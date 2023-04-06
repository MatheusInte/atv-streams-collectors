public class Cliente {
    private long idCliente;
    private String nome;

    public Cliente(){

    }
    public Cliente(Long idCliente, String nome) {
        this.idCliente = idCliente;
        this.nome = nome;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
