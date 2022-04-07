package br.com.desafios.main;

import java.util.Scanner;

public class QuartoDesafio {
	public static void main(String[] args) {
		// responsavel pela leitura do teclado (entrada do teclado).
		Scanner sc = new Scanner(System.in);

		// lê tamanho do array
		int qtdCasosTeste = sc.nextInt();
		sc.nextLine();

		String casoTeste = "";
		char[] casoTesteArray = null;

		// variaveis inicio e fim de cada metade a ser convertida da string
		int inicio = 0;
		int fim = 0;

		char aux;
		for (int i = 0; i < qtdCasosTeste; i++) {
			casoTeste = "";
			casoTeste += sc.nextLine();

			casoTesteArray = casoTeste.toCharArray();//converto a string para um array de caracteres

			inicio = 0;
			fim = (casoTesteArray.length / 2) - 1; //defino onde é a metade da linha para inverter as letras

			while (fim > inicio) {//faço a inversão do primeiro elemento pelo proximo até o fim.
				aux = casoTesteArray[inicio];
				casoTesteArray[inicio] = casoTesteArray[fim];
				casoTesteArray[fim] = aux;
				fim--;
				inicio++;
			}

			inicio = (casoTesteArray.length / 2);//defino a outra metade como inicio
			fim = (casoTesteArray.length - 1);//e agora o fim da string

			while (fim > inicio) {
				aux = casoTesteArray[inicio];
				casoTesteArray[inicio] = casoTesteArray[fim];
				casoTesteArray[fim] = aux;
				fim--;
				inicio++;
			}

			for (char c : casoTesteArray) {//foreach para printar a linha inteira
				System.out.print(c);
			}
			System.out.println("");
		}
	}
}
