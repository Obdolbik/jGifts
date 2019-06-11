package ru.aslteam.jgifts;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JGCommands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length > 0) if (args[0].equalsIgnoreCase("addgift")) {
			if (args.length == 1) {
				sender.sendMessage("Пропущен аргумент");
				sender.sendMessage("/jg addgift <gift> <type>");
			}
			if (args.length > 1) {

			}
		}
		return false;
	}

	boolean check(CommandSender sender) {
		return sender instanceof Player;
	}

}
