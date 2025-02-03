package br.com.tarefa;

/**
 * @author Alessandra Nascimento
 */
public class Lampada {

private String status;
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	
	public void statusLampada() {
		
		try {
			if(this.getStatus().equalsIgnoreCase("Sim")) {
				System.out.println("Ligando...Lampada Acessa");
			}else if (this.getStatus().equalsIgnoreCase("Não")) {
				System.out.println("Desligado...Lampada Apagada");
			}else {
				System.out.println("Opção Inválida");
			}
		}catch(Exception message) {
			message.getMessage();
			
		}
	}
}
