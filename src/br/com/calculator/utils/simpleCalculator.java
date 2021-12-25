package br.com.calculator.utils;

public class simpleCalculator {

	private double valor1;
	private double valor2;
	private String operacao;
	private String mensagem = "";

	
	//Atribui e verifica se h� erros na informa��o do dado para o valor 1
	
	/**
	 *@param v1 recebe o valor 1 para realizar o c�lculo 
	 */
	public void setValor1(String v1) {
		try {
			this.valor1 = Double.parseDouble(v1);

		} catch (Exception e) {
			this.mensagem += "<br> O valor 1 n�o parece ser um n�mero v�lido";
		}
	}
	
	//Atribui e verifica se h� erros na informa��o do dado para o valor 2
	
	/**
	 *@param v2 recebe o valor 1 para realizar o c�lculo 
	 */
	public void setValor2(String v2) {
		try {
			this.valor2 = Double.parseDouble(v2);

		} catch (Exception e) {
			this.mensagem += "<br> O valor 2 n�o parece ser um n�mero v�lido";
		}
	}
	
	//Atribui o valor para a opera��o solicitada
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	//Retorna a mensagem de erro
	public String getMensagem() {
		return mensagem;
	}
	
	//Verifica se existe um valor na vari�vel mensagem.
	public boolean validar() {
		return !mensagem.equals("");
	}
	
	//Efetua a opera��o desejada e retorna o valor
	public double calcular() {
		double resultado = 0.0;
		
		switch (operacao) {
		case "adicao":
			resultado = (valor1 + valor2);
			break;
		case "subtracao":
			resultado = (valor1 - valor2);
			break;
		case "multiplicacao":
			resultado = (valor1 * valor2);
			break;
		case "divisao":
			resultado = (valor1 / valor2);
			break;	
		default:
			System.out.println("Valor Inv�lido");
			break;
		}
		return resultado;
	}
}
