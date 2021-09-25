/*
 Crie uma classe RepositórioPedidos que armazene os pedidos de um supermercado.
  Essa classe deve ser capaz de gerar um relatório de vendas do dia.
*/

public class RepositórioPedidos {
    private Pedido[] pedidos;
    private int contador;

    public RepositórioPedidos(int tamanho) {
        pedidos = new Pedido[tamanho];
        contador = 0;
    }

    public void adiciona(Pedido pedido) {
        pedidos[contador] = pedido;
        contador++;
    }

    // Método Gerar Relatório
    public String getRelatorio() {
        String relatorio = "Foram realizados " + contador + " pedidos no dia.\n";
        double total = 0;
        for (int i = 0; i < contador; i++) {
            relatorio += "Pedido " + (i + 1) + ": " + pedidos[i].getValorTotal() + "\n";
            total += pedidos[i].getValorTotal();
        }
        relatorio += "Total: " + total;
        return relatorio;
    }
}