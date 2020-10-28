/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.model;

/**
 *
 * @author guilherme
 */
public class PagamentoAVista implements RegraDePagamento{

    @Override
    public double pagar(Venda venda) {
        double total = 0;
            if (venda.getTotalVendido() > 500) {
                total = venda.getTotalVendido() - (0.15 * venda.getTotalVendido());
            } else if (venda.getTotalVendido() > 300) {
                total = venda.getTotalVendido() - (0.1 * venda.getTotalVendido());
            }else{
                total = venda.getTotalVendido();
        } 
            return total;
    }
    
}
