/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lucas
 */
public class NotaFiscalController {
    
    public static boolean salvar(int numeroNota, String nomeProduto, double valorNota ) {
        
        
       
        NotaFiscal nota = new NotaFiscal();
        System.out.println("agora no controler: " + numeroNota + " " + nomeProduto + " " + valorNota);
        
        nota.setNumNota(numeroNota);
        nota.setNomeProduto(nomeProduto);
        nota.setValNota(valorNota);
        
        
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(nota);
        
    
    return true;
    }
    
}
