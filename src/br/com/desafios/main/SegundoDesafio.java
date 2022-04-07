package br.com.desafios.main;

import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// Para garantir que na entrada será ponto ao inves de virgula para separar as
										// casas decimais.

		// responsavel pela leitura do teclado (entrada do teclado).
		Scanner sc = new Scanner(System.in);
		double valor;

		// lê primeira linha
		valor = sc.nextDouble();

		// validação do valor
		if (!(0 <= valor && valor <= 1000000.00)) {
			System.exit(0);// finaliza o programa
		}

		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00", (valor / 100) >= 1 ? (int) (valor / 100) : 0); // printo na tela a
																									// quantidade da
																									// divisão com um
																									// if/else ternario
		valor -= (int) (valor / 100) * 100; // faço a subtração do valor já contado.

		System.out.printf("\n%d nota(s) de R$ 50.00", (valor / 50) >= 1 ? (int) (valor / 50) : 0);
		valor -= (int) (valor / 50) * 50;

		System.out.printf("\n%d nota(s) de R$ 20.00", (valor / 20) >= 1 ? (int) (valor / 20) : 0);
		valor -= (int) (valor / 20) * 20;

		System.out.printf("\n%d nota(s) de R$ 10.00", (valor / 10) >= 1 ? (int) (valor / 10) : 0);
		valor -= (int) (valor / 10) * 10;

		System.out.printf("\n%d nota(s) de R$ 5.00", (valor / 5) >= 1 ? (int) (valor / 5) : 0);
		valor -= (int) (valor / 5) * 5;

		System.out.printf("\n%d nota(s) de R$ 2.00", (valor / 2) >= 1 ? (int) (valor / 2) : 0);
		valor -= (int) (valor / 2) * 2;

		System.out.println("\n\nMOEDAS: ");

		System.out.printf("\n%d moeda(s) de R$ 1.00", (valor / 1) >= 1 ? (int) (valor / 1) : 0);
		valor -= (int) (valor / 1) * 1;

		System.out.printf("\n%d moeda(s) de R$ 0.50", (valor / 0.50) >= 1 ? (int) (valor / 0.50) : 0);
		valor -= (int) (valor / 0.50) * 0.50;

		System.out.printf("\n%d moeda(s) de R$ 0.20", (valor / 0.20) >= 1 ? (int) (valor / 0.20) : 0);
		valor -= (int) (valor / 0.20) * 0.20;

		System.out.printf("\n%d moeda(s) de R$ 0.10", (valor / 0.10) >= 1 ? (int) (valor / 0.10) : 0);
		valor -= (int) (valor / 0.10) * 0.10;

		System.out.printf("\n%d moeda(s) de R$ 0.05", (valor / 0.05) >= 1 ? (int) (valor / 0.05) : 0);
		valor -= (int) (valor / 0.05) * 0.05;

		System.out.printf("\n%d moeda(s) de R$ 0.01", (valor / 0.01) >= 1 ? (int) (valor / 0.01) : 0);
		valor -= (int) (valor / 0.01) * 0.01;

	}

}
