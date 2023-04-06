import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private long idPedido;
    private LocalDate LocalDate;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(){

    }

    public Pedido(Long idPedido, java.time.LocalDate localDate, List<Produto> produtos, Cliente cliente) {
        this.idPedido = idPedido;
        LocalDate = localDate;
        this.produtos = produtos;
        this.cliente = cliente;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public java.time.LocalDate getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(java.time.LocalDate localDate) {
        LocalDate = localDate;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
