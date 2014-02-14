package br.scrumban;

public class CalculadoraComissao {

	private static final double FAIXA_COMISSAO_CINCO_PORCENTO = 0.05;

	public double calcula(double venda) {
		
		double resultado = venda * FAIXA_COMISSAO_CINCO_PORCENTO;

		return trataArrendomanentoDecimal(resultado);
	}

	private static double trataArrendomanentoDecimal(double resultado) {
		return (Math.floor(resultado * 100))/100;
	}

}
