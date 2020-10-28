/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.model;

/**
 *
 * @author wolley
 */
public class App {
 
    
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.setTotalVendido(420.50);
        
        RegraDePagamento pagamento = new PagamentoAVista();
        venda.setPagamento(pagamento);
        
        System.out.println("Total de pagamento a vista: "+ venda.calcularTotal());
        
        venda.setTotalVendido(42.50);
        RegraDePagamento pagamentoPrazo = new PagamentoAPrazo();
        venda.setPagamento(pagamentoPrazo);
        
        System.out.println("Total de pagamento a prazo: "+ venda.calcularTotal());
       
    }
    
}
