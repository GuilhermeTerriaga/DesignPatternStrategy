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
public class PagamentoAPrazo implements RegraDePagamento{

    @Override
    public double pagar(Venda venda) {
        return venda.getTotalVendido() + (0.08 * venda.getTotalVendido());
    }
    
}
