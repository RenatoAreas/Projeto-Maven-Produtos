package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		Produto produto = new Produto("Bala juquinha sabor tangirina", 0.15, "doce");

		System.out.println("A bala que eu gosto é: " + produto.getNome() + "e custa " + produto.getPreco());
	}
}
