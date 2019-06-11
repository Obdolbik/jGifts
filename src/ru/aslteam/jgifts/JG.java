package ru.aslteam.jgifts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import ru.aslteam.api.bukkit.command.BasicModuleHandler;
import ru.aslteam.api.bukkit.message.EText;
import ru.aslteam.api.ejcore.module.EJAddon;
import ru.aslteam.jgifts.commands.GiftCommandHandler;

public class JG extends EJAddon {
	
	private static JG instance;
	public static JG instance() { return instance; }


	@Override
	public String getModuleName() {
		return "Jaguar-Gifts-Module";
	}
	@Override
	public String getModuleVersion() {
		return "1.0.0-BETA";
	}

	@Override
	public List<String> getUncompatibleModules() {
		return Arrays.asList("null");
	}

	@Override
	public void loadModule() {
		EText.send("&5[&2JG&5]&f: &6JaguarGifts v"+getModuleVersion()+" initialization..");
		instance = this;
		
		if(getModuleConfig().contains("gifts"));
			for (String gift : getModuleConfig().getSection("gifts").getKeys(false))
				new Gift(gift);
		
		BasicModuleHandler.registerModuleCommand(new GiftCommandHandler(), "jg");
				
	}

	static YamlConfiguration yaml = new YamlConfiguration();
	private static File file = null;
	static List<String> gifts = new ArrayList<>();

	static {
		try {
			file = new File("plugins/jGifts/gifts.yml");

			file.getParentFile().mkdir();
			if (!file.exists())
				file.createNewFile();

			yaml.load(file);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onEnable() {
		if (yaml.contains("gifts"))
			gifts = yaml.getStringList("gifts");
		else {
			yaml.set("gifts", gifts);
			try {
				yaml.save(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}
	
	public void readGiftCode(String gift) {

	}

}