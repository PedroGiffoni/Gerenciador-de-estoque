import java.util.ArrayList;
import java.util.List;

// Classe que gerencia o estoque usando lógica de fila ordenada
public class FilaEstoque {

    // Lista que armazenará os produtos
    private List<Produto> fila;

    // Construtor
    public FilaEstoque() {
        fila = new ArrayList<>();
    }

    // Método para adicionar produto respeitando a ordem por vencimento
    public void adicionarProduto(Produto novoProduto) {

        // Se a fila estiver vazia, apenas adiciona
        if (fila.isEmpty()) {
            fila.add(novoProduto);
            return;
        }

        // Encontrar posição correta baseada na data de vencimento
        int i = 0;
        while (i < fila.size() &&
                fila.get(i).getDataVencimento().isBefore(novoProduto.getDataVencimento())) {
            i++;
        }

        // Inserir na posição correta
        fila.add(i, novoProduto);
    }

    // Listar produtos
    public void listarProdutos() {
        if (fila.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        for (Produto p : fila) {
            System.out.println(p);
        }
    }

    // Remover o primeiro produto (FIFO)
    public Produto removerProduto() {
        if (fila.isEmpty()) {
            System.out.println("Nada para remover.");
            return null;
        }

        return fila.remove(0);
    }

    // Remover produtos vencidos
    public void removerVencidos() {
        fila.removeIf(produto -> produto.getDataVencimento().isBefore(java.time.LocalDate.now()));
    }

    //aviso de produtos vencendo em 7 dias

    public void produtosProximosDoVencimento() {
        for (Produto p : fila) {
            if (p.getDataVencimento().isBefore(java.time.LocalDate.now().plusDays(7))) {
                System.out.println("Atenção! Produto próximo do vencimento: " + p);
            }
        }
    }
}