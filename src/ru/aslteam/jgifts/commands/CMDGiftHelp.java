package ru.aslteam.jgifts.commands;

import org.bukkit.command.CommandSender;

import ru.aslteam.api.bukkit.command.BasicCommand;
import ru.aslteam.api.bukkit.command.interfaze.Usable;

public class CMDGiftHelp extends BasicCommand{
	
	public CMDGiftHelp(String command, Usable<CommandSender, String[]> func) {
		super(command, func);
	}

	@Override
	public String getDescription() {
		return "Отображает список доступных команд";
	}

	@Override
	public String getUsage() {
		return "/jg help";
	}

	@Override
	public String getPermission() {
		return "jgift.help";
	}

}
