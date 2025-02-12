package br.com.ale;

import java.util.Scanner;

/**
 * @author Alessandra Nascimento
 */
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Numeros numero = new Numeros();
		
		System.out.println("Conversão para Wrapper");
		System.out.print("Digite um número: ");
		numero.setNumero(sc.nextInt());
		
		numero.conversaoNumeroParaWrapper();

	}

}
