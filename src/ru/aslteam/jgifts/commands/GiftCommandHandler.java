package ru.aslteam.jgifts.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ru.aslteam.api.bukkit.command.BasicModuleHandler;
import ru.aslteam.api.bukkit.command.interfaze.ECommand;
import ru.aslteam.api.bukkit.message.EText;

public class GiftCommandHandler extends BasicModuleHandler {

	private static CMDGift				gift;
	private static CMDGiftAddgift		addgift;
	private static CMDGiftHelp			help;
	private static GiftCommandHandler	handler;

	public static CMDGift getGift() {
		return GiftCommandHandler.gift == null ? GiftCommandHandler.gift = new CMDGift("gift", (s, args) -> {
			if (args.length == 0) s.sendMessage(EText.c("/gift <code>"));
			if (args.length > 0);

		}) : GiftCommandHandler.gift;
	}

	public static CMDGiftHelp getGiftHelp() {
		return GiftCommandHandler.help == null ? GiftCommandHandler.help = new CMDGiftHelp("help", (s, args) -> {
			s.sendMessage(EText.c("&4&m------------&r &5Gifts &4&m-------------"));
			List<ECommand> commands = new ArrayList<>(GiftCommandHandler.handler.getRegisteredCommands());
			commands.add(GiftCommandHandler.help);
			for (ECommand command : commands)
				if (s.hasPermission(command.getPermission())) EText.send(s, "&e" + command.getUsage() + " - &7" + command.getDescription() + (s.isOp() || s.hasPermission("*") ? " &f- &5" + command.getPermission() : ""));
			s.sendMessage(EText.c("&4&m--------------------------------"));
		}) : GiftCommandHandler.help;
	}

	public static CMDGiftAddgift getAddgift() {
		return GiftCommandHandler.addgift == null ? GiftCommandHandler.addgift = new CMDGiftAddgift("addgift", (s, args) -> {

			if (args.length == 0 || args.length == 1) EText.send(s, "&2[JG] /gift add &4<code> <type>");
			if (args.length > 1) {

			}

		}) : GiftCommandHandler.addgift;
	}

	public GiftCommandHandler() {
		super(getGift(), "gift");
		description = "������������� ����-����";
		usageMessage = "/gift";
		setPermission("jgifts.use");
		setAliases(Arrays.asList("jg"));
		handler = this;
		registerCommand(getGiftHelp());
		registerCommand(getGift());
	}
}
