package br.scrumban;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {

	@Test
	public void testa_calculo_comissao_venda_100_retorna_5() {
		int venda = 100;
		int esperado = 5;
		
		double calculo = CalculadoraComissao.calcula( venda );
		
		assertEquals( esperado, calculo, 0 );
	}
	
	@Test
	public void testa_calculo_comissao_venda_10000_retorna_500() {
		int venda = 10000;
		int esperado = 500;
		
		double calculo = CalculadoraComissao.calcula( venda );
		
		assertEquals( esperado, calculo, 0 );
	}
	
	@Test
	public void testa_calculo_comissao_venda_1_retorna_5_cents() {
		int venda = 1;
		double esperado = 0.05;
		
		double calculo = CalculadoraComissao.calcula( venda );
		
		assertEquals( esperado, calculo, 0 );
	}
	
	@Test
	public void testa_calculo_comissao_venda_0_retorna_0() {
		int venda = 0;
		double esperado = 0;
		
		double calculo = CalculadoraComissao.calcula( venda );
		
		assertEquals( esperado, calculo, 0 );
	}
	
	@Test
	public void testa_calculo_comissao_venda_50_e_80_retorna_2_e_54() {
		double venda = 50.80;
		double esperado = 2.54;
		
		double calculo = CalculadoraComissao.calcula( venda );
		
		assertEquals( esperado, calculo, 0 );
	}
	
	@Test
	public void testa_calculo_comissao_venda_55_e_59_retorna_2_e_77() {
		double venda = 55.59;
		double esperado = 2.77;
		
		double calculo = CalculadoraComissao.calcula( venda );
		
		assertEquals( esperado, calculo, 0 );
	}
}
