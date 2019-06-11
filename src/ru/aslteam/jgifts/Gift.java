package ru.aslteam.jgifts;

import java.util.ArrayList;
import java.util.List;

public class Gift {

	private static List<Gift>	gifts	= new ArrayList<>();

	private String				code	= null;
	private JType				type	= null;

	public static Gift getGift(String id) {
		for (Gift gift : gifts)
			if (gift.is(id)) return gift;
		return null;
	}

	private boolean is(String id) {
		return false;
	}

	public Gift(String id) {
		if (id == null || !id.contains(";")) return;

		String[] split = id.split(";");

		if (JType.containsType(split[1])) {
			code = split[0];
			type = JType.get(split[1]);
		}
	}

}
