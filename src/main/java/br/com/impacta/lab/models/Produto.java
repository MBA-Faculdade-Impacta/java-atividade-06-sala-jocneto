package br.com.impacta.models

public class produto {
  public int codigo;
  public string descricao;
  public double valor;

  public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {
		 for (int contador = 0; contador < listadeprodutos.size(); contador++){
       Produto produto = listaDeProdutos.get(contador);
       if (codigoProduto == 2 produto.codigo)
return produto     }
return null 
}
}