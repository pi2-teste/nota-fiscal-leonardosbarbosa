/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.model;

/**
 *
 * @author lucas
 */
public class NotaFiscal {
    double valNota;
    int numNota;
    String nomeProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        System.out.print("O objeto nota recebeu um nome do produto: ");
        System.out.println(nomeProduto);
        this.nomeProduto = nomeProduto;
    }
    
    public NotaFiscal() {
        System.out.println("inicializando um objeto do tipo NotaFiscal");
    }
    
    public double getValNota() {
        return valNota;
    }

    public void setValNota(double valNota) {
        System.out.print("O objeto nota recebeu um valor: ");
        System.out.println(valNota);
        this.valNota = valNota;
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        System.out.print("O objeto nota recebeu um numero de nota: ");
        System.out.println(numNota);
        this.numNota = numNota;
    }
    
    
}