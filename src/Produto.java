import java.time.LocalDate;

// Classe que representa um produto do estoque
public class Produto {

    // Atributos do produto
    private String nome;
    private int codigo;
    private int quantidade;
    private LocalDate dataVencimento;

    // Construtor
    public Produto(String nome, int codigo, int quantidade, LocalDate dataVencimento) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.dataVencimento = dataVencimento;
    }

    // Getters (acessar os valores)
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    // Setter para atualizar quantidade (usado em venda parcial)
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para exibir o produto
    @Override
    public String toString() {
        return "Produto: " + nome +
                " | Código: " + codigo +
                " | Quantidade: " + quantidade +
                " | Vencimento: " + dataVencimento;
    }
}