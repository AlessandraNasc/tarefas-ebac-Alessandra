package br.com.ale;
/**
 * @author Alessandra Nascimento
 */
public class Numeros {
	
	private int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void conversaoNumeroParaWrapper() {
		Long numeroConvertido = Long.valueOf(this.getNumero());
		System.out.println("Após converter para WRAPPER: "+ numeroConvertido.getClass().getName());
	}

}
