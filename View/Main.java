package View;
import Model.Produto;
import Controller.ControladorPedido;
import Model.Cliente;
import Model.TipoProduto;

public class Main {
    public static void main(String[] args) {
        String nomeC1 = "Camila";
        String telefoneC1 = "45 99999-8888";
        String cpfC1 = "11122233344";
        Cliente cliente1 = new Cliente(nomeC1, telefoneC1, cpfC1);

        String nomeP1 = "Suco de laranja";
        String nomeP2 = "Empada de frango";
        String nomeP3 = "Mousse de maracujá";
        double precoP1 = 5;
        double precoP2 = 8;
        double precoP3 = 10;

        Produto produto1 = new Produto(nomeP1, precoP1, TipoProduto.BEBIDA);
        Produto produto2 = new Produto(nomeP2, precoP2, TipoProduto.LANCHE);
        Produto produto3 = new Produto(nomeP3, precoP3, TipoProduto.SOBREMESA);

        ControladorPedido pedido1 = new ControladorPedido();
        pedido1.criarPedido(cliente1);
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);
        pedido1.adicionarProduto(produto3);
        pedido1.finalizarPedido();
        
        

    }

    
}
