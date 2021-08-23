package com.company;

public class vetoresMatrizes {

    public static void main(String[] args) {
	String cidades[] = new String[10];
	cidades[0] = "Londres";
	cidades[1] = "Madrid";
	cidades[2] = "Nova York";
	cidades[3] = "Buenos Aires";
	cidades[4] = "Assuncion";
	cidades[5] = "Sao Paulo";
	cidades[6] = "Lima";
	cidades[7] = "Santiago de Chile";
	cidades[8] = "Lisboa";
	cidades[9] = "Tokio";

//	for (int i = 0; i < cidades.length; i++) {
//		System.out.println(cidades[i]);
//	}

	String temperatura[][] = {
			{"-2", "33"},
			{"-3", "32"},
			{"-8", "27"},
			{"4", "37"},
			{"6", "42"},
			{"5", "43"},
			{"0", "39"},
			{"-7", "26"},
			{"-1", "31"},
			{"-10", "35"}
	};

	for (int linha = 0; linha < 10; linha++){
		for (int col = 0; col < 10; col++) {
			System.out.println(temperatura[col][linha]);
		}
	}

    }
}