/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesTables;

/**
 *
 * @author Andressa
 */
public class Pedido {
    private int id_pedido;
    private double valorTotal;
    private String status;
    private String pagamento;

    public int getId_pedido() {
        return id_pedido;
    }
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPagamento() {
        return pagamento;
    }
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
}
