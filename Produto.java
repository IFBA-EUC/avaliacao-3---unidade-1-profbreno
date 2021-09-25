
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    // Atributos criados (Questão 1)
    private double precoCusto;
    private double precoVenda;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidadeEstoque;
    }

    // Início do encapsulamento da Questão 1
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return this.precoCusto;
    }

    public double getPrecoVenda() {
        return this.precoVenda;
    }
    // Fim do encapsulamento da Questão 1

    // Início da Questão 2
    public double calcularLucro() {
        return this.precoVenda - this.precoCusto;
    }
    // Fim da Questão 2
}
