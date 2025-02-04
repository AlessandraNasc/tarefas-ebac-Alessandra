package br.com.ale;
/**
 * @author Alessandra Nascimento
 */
public class Principal {

	public static void main(String[] args) {
		Media media = new Media();
		media.setNum1(5);
		media.setNum2(4.5);
		media.setNum3(3);
		media.setNum4(2.5);
		
		System.out.println("Media das Notas");
		System.out.println("Resultado: "+ media.resultadoMedia());

	}

}
