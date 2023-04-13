import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseDeDados {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                //Criar clientes e Colocar em uma lista:
                Cliente cliente1 = new Cliente(127361L, "Guilherme Rivaldy");
                Cliente cliente2 = new Cliente(127264L, "Jonas Henrique");
                Cliente cliente3 = new Cliente(238964L, "Luis Gustavo");
                List<Cliente> listaClientes = Arrays.asList(cliente1, cliente2, cliente3);

                //Criar Produtos e Colocar em uma lista:
                Produto produto1 = new Produto("Papelaria", 10000L, "Caneta Azul", 5.00);
                Produto produto2 = new Produto("Papelaria", 10001L, "Borracha", 4.00);
                Produto produto3 = new Produto("Jogo", 10002L, "Xadrez", 50.00);
                Produto produto4 = new Produto("Jogo", 10004L, "The Last of US", 250.00);
                Produto produto5 = new Produto("Livro", 10005L, "Fogo & Sangue", 80.00);
                Produto produto6 = new Produto("Livro", 10006L, "Como Programar em Java", 140.00);
                List<Produto> listaProdutos = Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6);

                //Criar Pedidos:
                Pedido pedido1 = new Pedido(20000L, LocalDate.of(2023, 4, 12), Arrays.asList(produto1, produto2), cliente1);
                Pedido pedido2 = new Pedido(20001L, LocalDate.now(), Arrays.asList(produto3, produto4), cliente2);
                Pedido pedido3 = new Pedido(20002L, LocalDate.of(2022, 4, 11), Arrays.asList(produto5, produto6), cliente3);
                List<Pedido> listaPedidos = Arrays.asList(pedido1,pedido2,pedido3);

                //Filtrar Produtos e Mostrar com preço menor que 100.00:
                Stream<Produto> streamProdutosMenor100 = listaProdutos.stream().filter(x -> x.getCategoria().equals("Jogo")).filter(x -> x.getPreco()<100.00);
                System.out.println("Jogos por menos de 100 Reais: \n" + streamProdutosMenor100.collect(Collectors.toList()));

                System.out.println();

                //Lista de Produtos da Categoria Papelaria:
                Stream<Produto> streamProdutosPapelaria = listaProdutos.stream().filter(x -> x.getCategoria().equals("Papelaria"));
                System.out.println("Produtos de Papelaria: \n" + streamProdutosPapelaria.collect(Collectors.toList()));

                System.out.println();

                //Agrupar Produtos por Categoria:
                Stream<Produto> streamProdutosPorCategoria = listaProdutos.stream().sorted(Comparator.comparing(Produto::getCategoria));
                System.out.println("Produtos por Categoria: \n" + streamProdutosPorCategoria.collect(Collectors.toList()));

                //Ordenar Pedidos por Mais Recentes:
                Stream<Pedido> streamPedidoMaisRecente = listaPedidos.stream().sorted(Comparator.comparing(Pedido::getLocalDate).reversed());
                System.out.println("Produtos mais Recentes: \n" + streamPedidoMaisRecente.collect(Collectors.toList()));
        }
}