public class Produto {
    private long idProduto;
    private String nomeProduto;
    private String categoria;
    private Double preco;

    public Produto(){

    }

    public Produto(String categoria, Long idProduto, String nomeProduto,  Double preco) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "O Produto: " + nomeProduto + ", de ID: " + idProduto + ". Custa: " + preco + "\n";
    }
}
