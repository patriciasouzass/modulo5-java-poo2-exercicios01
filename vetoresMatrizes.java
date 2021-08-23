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

	int temperatura[][] = {
			{-2, 33},
			{-3, 32},
			{-8, 27},
			{4, 37},
			{6, 42},
			{5, 43},
			{0, 39},
			{-7, 26},
			{-1, 31},
			{-10, 35}
	};

	int max = temperatura[0][0], posmin = 0, posmax = 0, min = temperatura[0][0];

	for (int i = 0; i < 10; i++){
		if (temperatura[i][0] < min){
			min = temperatura[i][0];
			posmin = i;
		}
	}

	for (int j = 0; j < 10; j++){
		if (temperatura[j][1] > max){
			max = temperatura[j][1];
			posmax = j;
		}
	}

		System.out.println("A cidade mais fria é: " + cidades[posmin] + " e a cidade mais quente é: " + cidades[posmax]);

    }
}