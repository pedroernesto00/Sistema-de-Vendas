public class Teste {
	
	public static void main (String[] args) {
		Produto p1 = new Produto("Whey Protein", "Pra ficar monstrão", 99.00);
		Produto p2 = new Produto("Monopoly", "Para divertir a familia", 70.00);
		Produto p3 = new Produto("Cachaça", "Pra esquecer aquela linda", 7.00);

		Venda v1 = new Venda("04/06/18", "Pedro");

		v1.adicionarProduto(p1);
		v1.adicionarProduto(p2);
		v1.adicionarProduto(p3);

		v1.listarProdutos();

		System.out.println(v1.getPrecoTotal());
		System.out.println(v1.getVendedor());
		System.out.println(v1.getData());
		System.out.println(v1.getQuantidadeTotal());
	}
}