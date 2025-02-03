package br.com.tarefa;

import java.util.Scanner;

/**
 * @author Alessandra Nascimento
 */
public class Principal {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Lampada lampada = new Lampada ();
		
			System.out.println("Deseja acender a luz?");
			System.out.println("Sim");
			System.out.println("Não");
			System.out.print("Resposta: ");
			lampada.setStatus(sc.next());
			
			lampada.statusLampada();
		}
	}

