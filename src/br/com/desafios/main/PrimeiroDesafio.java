package br.com.desafios.main;

import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		// responsavel pela leitura do teclado (entrada do teclado).
		Scanner sc = new Scanner(System.in);
		int numeroLinhas = 0;

		// lê primeira linha
		numeroLinhas = sc.nextInt();

		// validação da primeira linha
		if (!(1 < numeroLinhas && numeroLinhas <= Math.pow(10, 5))) {
			System.exit(0);// finaliza o programa
		}

		// array responsavel por salvar todos os numeros digitados nas linhas
		int arrayTodosNumeros[] = new int[numeroLinhas];

		// variaveis responsaveis por registrar a quantidade de numeros impares e pares.
		int qtdPares = 0;
		int qtdImpares = 0;

		// loop para leitura das linhas
		for (int i = 0; i < numeroLinhas; i++) {
			arrayTodosNumeros[i] = sc.nextInt();

			// verifica se o numero é negativo
			if (arrayTodosNumeros[i] < 0) {
				System.exit(0);// finaliza o programa
			}

			// verifica se o numero é par
			if (arrayTodosNumeros[i] % 2 == 0) {
				qtdPares++;// incremento para variavel que registra a quantidade de pares
			} else {
				qtdImpares++;// incremento para variavel que registra a quantidade de impares
			}

		}

		// arrays para salvar os numeros pares e impares.
		int arrayPares[] = new int[qtdPares];
		int arrayImpares[] = new int[qtdImpares];

		// preenche o array dos numeros pares
		int aux = 0;
		for (int j = 0; j < arrayTodosNumeros.length; j++) {
			if (arrayTodosNumeros[j] % 2 == 0) {
				arrayPares[aux] = arrayTodosNumeros[j];
				aux++;
			}
		}

		// preenche o array dos numeros impares
		aux = 0;
		for (int j = 0; j < arrayTodosNumeros.length; j++) {
			if (!(arrayTodosNumeros[j] % 2 == 0)) {
				arrayImpares[aux] = arrayTodosNumeros[j];
				aux++;
			}
		}

		// ordena o array dos numeros pares em ordem crescente
		aux = -1;
		for (int i = 0; i < arrayPares.length; i++) {
			for (int j = 0; j < arrayPares.length - 1; j++) {

				if (arrayPares[j] > arrayPares[j + 1]) {// comparo se a posição da frente é menor que a de trás (até a
														// penultima posição)
					aux = arrayPares[j];// armazeno a posição em uma variavel auxiliar para não perder o dado.
					arrayPares[j] = arrayPares[j + 1];// faço a troca do anterior pelo posterior
					arrayPares[j + 1] = aux;// faço a troca do posterior pelo anterior, que foi armazenado em uma
											// variavel auxiliar
				}

			}
		}

		// ordena o array dos numeros impares em ordem decrescente (Basicamente a mesma
		// coisa do ordenamento acima)
		for (int i = 0; i < arrayImpares.length; i++) {
			for (int j = 0; j < arrayImpares.length - 1; j++) {

				if (arrayImpares[j] < arrayImpares[j + 1]) {// comparo se a posição da frente é maior que a de trás (até
															// a penultima posição)
					aux = arrayImpares[j];
					arrayImpares[j] = arrayImpares[j + 1];
					arrayImpares[j + 1] = aux;
				}

			}
		}

		// printa os numeros pares primeiro. (em ordem crescente)
		for (int i = 0; i < arrayPares.length; i++) {
			System.out.println(arrayPares[i]);
		}

		// printa os numeros impares. (em ordem decrescente)
		for (int i = 0; i < arrayImpares.length; i++) {
			System.out.println(arrayImpares[i]);
		}

	}

}