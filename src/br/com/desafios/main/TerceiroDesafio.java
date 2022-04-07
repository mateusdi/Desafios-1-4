package br.com.desafios.main;

import java.util.Scanner;

public class TerceiroDesafio {
	public static void main(String[] args) {
		// responsavel pela leitura do teclado (entrada do teclado).
		Scanner sc = new Scanner(System.in);

		int contadorDePares = 0;

		// lê tamanho do array
		int n = sc.nextInt();

		int array[] = new int[n];

		// numero Alvo
		int k = sc.nextInt();

		//lê os numeros do array
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		//Verifica as combinações dos pares
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] - array[j] == k) {//percorre toda lista em busca de combinação
					contadorDePares++;
				}
			}

		}
		System.out.println(contadorDePares);

	}
}
