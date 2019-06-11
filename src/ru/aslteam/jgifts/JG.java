package ru.aslteam.jgifts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class JG extends JavaPlugin {

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

	@Override
	public void onDisable() {

	}

	public void readGiftCode(String gift) {

	}
}