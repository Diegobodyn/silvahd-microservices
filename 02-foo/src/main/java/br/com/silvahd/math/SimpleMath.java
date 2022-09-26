package br.com.silvahd.math;

public class SimpleMath {

	public Double sum(Double firstNumber, Double secondNUmber) {
		return firstNumber + secondNUmber;
	}

	public Double subtraction(Double firstNumber, Double secondNUmber) {
		return firstNumber - secondNUmber;
	}

	public Double multiplication(Double firstNumber, Double secondNUmber) {
		return firstNumber * secondNUmber;
	}

	public Double division(Double firstNumber, Double secondNUmber) {
		return firstNumber / secondNUmber;
	}

	public Double mean(Double firstNumber, Double secondNUmber) {
		return (firstNumber + secondNUmber) / 2;
	}

	public Double squareRoot(Double number) {
		return (Double) Math.sqrt(number);
	}

}
