/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniensinojavaswing.murilo.swing.jogo.da.velha.murilo.nata.nogueira.Controle;

/**
 *
 * @author muril
 */
public class Controlador {
    private String[][] tabuleiro;
    private String suporte;
    
    public boolean verificaGanhador(String[][] tabuleiro, String suporte)
    {
        setSuporte(suporte);
        setTabuleiro(tabuleiro);
        
        return verificaHorizontais() || verificaVerticais() || verificaDiagonais();
    }
    
   public void configuraTextos(){
        
    }
    
    private boolean verificaHorizontais(){
        for(int i = 0; i < 3; i++)
        {
            if(tabuleiro[i][0].equals(suporte) && tabuleiro[i][1].equals(suporte) && tabuleiro[i][2].equals(suporte))
            {
                return true;
            }
        }
        return false;
    }
    
    private boolean verificaVerticais(){
        for(int i = 0; i < 3; i++)
        {
            if(tabuleiro[0][i].equals(suporte) && tabuleiro[1][i].equals(suporte) && tabuleiro[2][i].equals(suporte))
            {
                return true;
            }
        }
        return false;
    }
    
    private boolean verificaDiagonais(){
        if(tabuleiro[0][0].equals(suporte) && tabuleiro[1][1].equals(suporte) && tabuleiro[2][2].equals(suporte)){ //Diagonal Principal
            return true;
        } 
        if(tabuleiro[2][0].equals(suporte) && tabuleiro[1][1].equals(suporte) && tabuleiro[0][2].equals(suporte)){ //Diagonal Secundária
            return true;
        }
        return false;
    }
    

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public String getSuporte() {
        return suporte;
    }

    public void setSuporte(String suporte) {
        this.suporte = suporte;
    }
    
    
    
    
}
