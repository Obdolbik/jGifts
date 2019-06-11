package ru.aslteam.jgifts;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

public class JType {

	String name = null;
	List<Material> materials = new ArrayList<>();

	public JType(String name, List<String> mat) {
		loadMaterials(mat);

	}

	void loadMaterials(List<String> mat) {

	}

}
