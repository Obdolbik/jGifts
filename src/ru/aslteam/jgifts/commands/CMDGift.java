package ru.aslteam.jgifts.commands;

import org.bukkit.command.CommandSender;

import ru.aslteam.api.bukkit.command.BasicCommand;
import ru.aslteam.api.bukkit.command.interfaze.SenderType;
import ru.aslteam.api.bukkit.command.interfaze.Usable;

public class CMDGift extends BasicCommand {

	public CMDGift(String command, Usable<CommandSender, String[]> func) {
		super(command, func);
		senderType = SenderType.PLAYER_ONLY;
	}

	@Override
	public String getDescription() {
		return "������������� ����-����";
	}

	@Override
	public String getUsage() {
		return "/gift";
	}

	@Override
	public String getPermission() {
		return "jgifts.use";
	}

}
