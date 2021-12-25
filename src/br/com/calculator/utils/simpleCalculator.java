package br.com.calculator.utils;

public class simpleCalculator {

	private double valor1;
	private double valor2;
	private String operacao;
	private String mensagem = "";

	
	//Atribui e verifica se há erros na informação do dado para o valor 1
	
	/**
	 *@param v1 recebe o valor 1 para realizar o cálculo 
	 */
	public void setValor1(String v1) {
		try {
			this.valor1 = Double.parseDouble(v1);

		} catch (Exception e) {
			this.mensagem += "<br> O valor 1 não parece ser um número válido";
		}
	}
	
	//Atribui e verifica se há erros na informação do dado para o valor 2
	
	/**
	 *@param v2 recebe o valor 1 para realizar o cálculo 
	 */
	public void setValor2(String v2) {
		try {
			this.valor2 = Double.parseDouble(v2);

		} catch (Exception e) {
			this.mensagem += "<br> O valor 2 não parece ser um número válido";
		}
	}
	
	//Atribui o valor para a operação solicitada
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	//Retorna a mensagem de erro
	public String getMensagem() {
		return mensagem;
	}
	
	//Verifica se existe um valor na variável mensagem.
	public boolean validar() {
		return !mensagem.equals("");
	}
	
	//Efetua a operação desejada e retorna o valor
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
			System.out.println("Valor Inválido");
			break;
		}
		return resultado;
	}
}
