package ru.aslteam.jgifts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Material;

import ru.aslteam.core.Core;

public abstract class JType implements Give {

	public static Map<String, JType>	types		= new HashMap<>();

	String								name		= null;
	List<Material>						materials	= new ArrayList<>();

	public JType(String name, List<String> mat) {
		loadMaterials(mat);

		if (materials.size() < 1) return;
		else {
			this.name = name;
			types.put(name, this);
		}
	}

	void loadMaterials(List<String> mat) {
		for (String mater : mat) {
			Material check = null;
			if ((check = Core.getMaterialAdapter().attemptMaterial(mater)) != null) materials.add(check);
		}
	}

	public static boolean containsType(String id) {
		return types.containsKey(id.toLowerCase());
	}

	public static JType get(String id) {
		return types.get(id);
	}

}
