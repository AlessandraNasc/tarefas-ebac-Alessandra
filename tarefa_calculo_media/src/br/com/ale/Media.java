package br.com.ale;
/**
 * @author Alessandra Nascimento
 */
public class Media {

	private double num1, num2, num3, num4;
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum3(double num3) {
		this.num3 = num3;
	}
	
	public double getNum3() {
		return num3;
	}
	
	public void setNum4(double num4) {
		this.num4 = num4;
	}
	
	
	public double getNum4() {
		return num4;
	}
	
	public double resultadoMedia() {
		return (this.getNum1()+this.getNum2()+this.getNum3()+this.getNum4())/4;
	}
}
