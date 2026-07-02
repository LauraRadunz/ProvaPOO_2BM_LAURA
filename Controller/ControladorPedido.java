package Controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Model.Cliente;
import Model.Pedido;
import Model.Produto;

public class ControladorPedido implements PedidoView {
    Pedido pedido = new Pedido();
    PedidoView view;

    public ControladorPedido() {

    }

    public ControladorPedido(Pedido pedido, PedidoView view) {
        this.pedido = pedido;
        this.view = view;
    }

    public void criarPedido(Cliente cliente) {
        pedido.setCliente(cliente);
        pedido.setDataHora(LocalDateTime.now());
        List<Produto> lista = new ArrayList<>();
        pedido.setProdutos(lista);
    }

    public void adicionarProduto(Produto produto) {
        if (pedido.getProdutos().size() < 10) {
            pedido.getProdutos().add(produto);
        } else {
            System.out.println("Não é possível adicionar mais de 10 produtos em um pedido!");
        }
    }

    public void finalizarPedido() {
        exibirDetalhePedido(pedido);
    }

    @Override
    public void exibirDetalhePedido(Pedido pedido) {
        String pedidoInfo = "-- Cliente: -- \nNome: " + pedido.getCliente().getNome() + "\nCPF: " + pedido.getCliente().getCpf() + "\nTelefone: " + pedido.getCliente().getTelefone() + "\n\n";
        pedidoInfo += "-- Produtos: --\n";

        for (Produto produto : pedido.getProdutos()) {
            pedidoInfo += "Nome: " + produto.getNome() + " | Tipo: " + produto.getTipo() + " | Preço: " + produto.getPreco() + "\n";
        }
        
        pedidoInfo += "\nHorário do pedido: " + pedido.getDataHora();
        pedidoInfo += "\n\nValor total do pedido: " + pedido.calcularTotal();

        System.out.println(pedidoInfo);
    }
}
