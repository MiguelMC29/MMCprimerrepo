package prueba;

public class PracticaGit {

	private int num1;
	private int num2;
	private int resultado;

	public PracticaGit(int num1, int num2, int resultado) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}

	public int sumar() {

		return resultado = num1 + num2;
	}

	public int resta() {

		return resultado = num1 - num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	
	
}
