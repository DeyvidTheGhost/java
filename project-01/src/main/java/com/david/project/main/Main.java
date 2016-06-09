package com.david.project.main;

import com.david.utilitario.util.StrinUtil;

public class Main {
	public static void main(String[] args) {
		StrinUtil.capitalize("David");
		String nombres[] = { "Mauro", "jUan", "aleX" };

		for (String nom : nombres) {
			System.out.println(StrinUtil.capitalize(nom));
		}
	}

}
