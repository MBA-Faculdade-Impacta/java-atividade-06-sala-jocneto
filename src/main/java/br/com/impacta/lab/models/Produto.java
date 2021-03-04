package br.com.impacta.models;

public class produto {
  private int codigo;
  public string descricao;
  public double valor;

  public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {
		 for (int contador = 0; contador < listadeprodutos.size(); contador++){
       Produto produto = listaDeProdutos.get(contador);
       if (codigoProduto == produto.codigo)
return produto     }

{return null} 
}
}