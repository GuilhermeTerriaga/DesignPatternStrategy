/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.model;

/**
 *
 * @author wolleyws
 */
public class Venda {

    private double totalVendido;
    private RegraDePagamento pagamento;

      //SETS E GETS
    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    } 
    
    public void setPagamento(RegraDePagamento pagamento){
        this.pagamento = pagamento;
    }

    public double calcularTotal() {
       return pagamento.pagar(this);
    }

}
