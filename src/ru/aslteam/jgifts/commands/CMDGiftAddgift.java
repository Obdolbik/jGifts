package ru.aslteam.jgifts.commands;

import org.bukkit.command.CommandSender;

import ru.aslteam.api.bukkit.command.BasicCommand;
import ru.aslteam.api.bukkit.command.interfaze.SenderType;
import ru.aslteam.api.bukkit.command.interfaze.Usable;

public class CMDGiftAddgift extends BasicCommand {

	public CMDGiftAddgift(String command, Usable<CommandSender, String[]> func) {
		super(command, func);
		senderType = SenderType.CONSOLE_ONLY;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPermission() {
		// TODO Auto-generated method stub
		return null;
	}

}
