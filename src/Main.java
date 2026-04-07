import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Criando o estoque
        FilaEstoque estoque = new FilaEstoque();

        // Criando produtos
        Produto p1 = new Produto("Leite", 1, 10, LocalDate.of(2026, 4, 10));
        Produto p2 = new Produto("Arroz", 2, 5, LocalDate.of(2026, 5, 1));
        Produto p3 = new Produto("Carne", 3, 2, LocalDate.of(2026, 4, 8));

        // Adicionando produtos
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);

        // Listando produtos (já ordenados por vencimento)
        System.out.println("=== Produtos no estoque ===");
        estoque.listarProdutos();

        // Removendo o primeiro (FIFO)
        System.out.println("\nRemovendo produto:");
        System.out.println(estoque.removerProduto());

        // Listando novamente
        System.out.println("\n=== Estoque após remoção ===");
        estoque.listarProdutos();

        // Remover vencidos
        estoque.removerVencidos();

        System.out.println("\n=== Após remover vencidos ===");
        estoque.listarProdutos();

        // mostrar produtos proximo ao vencimento
        System.out.println("\n=== Produtos próximos do vencimento ===");
        estoque.produtosProximosDoVencimento();
    }
}