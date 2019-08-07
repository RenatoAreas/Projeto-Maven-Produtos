package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	@Test
	public void verificaPrecoComImposto() {
		
		Produto bala = new Produto("juquinha", 0.10, "doce");
		assertEquals(0.11, bala.getProdutoComImposto(), 0.0001);

    } 

}
