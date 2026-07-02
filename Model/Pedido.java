package Model;
import java.util.List;

import java.time.LocalDateTime;

public class Pedido {
    Cliente cliente;
    List<Produto> produtos;
    LocalDateTime dataHora;

    public Pedido() {

    }

    public Pedido(Cliente cliente, List<Produto> produtos, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataHora = dataHora;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.preco;
        }

        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = LocalDateTime.now();
    }

}
