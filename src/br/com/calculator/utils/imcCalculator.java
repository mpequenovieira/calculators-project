package br.com.calculator.utils;

public class imcCalculator {

	private double weight, height, imc;
	private String mensagem;

	public double getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		try {
			this.weight = Double.parseDouble(weight);

		} catch (Exception e) {
			this.mensagem += "<br> O peso informado n�o parece ser um valor v�lido";
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(String height) {
		try {
			this.height = Double.parseDouble(height);

		} catch (Exception e) {
			this.mensagem += "<br> A altura informada n�o parece ser um valor v�lido";
		}

	}

	public double getImc() {
		return imc;
	}

	public void setImc() {
		imc = Math.pow(height, height);
	}

}
