/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processamento_de_dados;

import java.util.ArrayList;

/**
 *
 * @author Breno
 */
public class Salas {
    
    private int numero;
    private String nome;
    private String tipo;
    private int lotacao;
    ArrayList<Salas> lista_salas;
   
    
    public Salas(){
        lista_salas = new ArrayList();
    }
    
    public Salas(int numero, String nome, String tipo, int lotacao) {
        this.numero = numero;
        this.nome = nome;
        this.tipo = tipo;
        this.lotacao = lotacao;        
    }   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
    
    public ArrayList<Salas> getLista_salas() {
        return lista_salas;
    }

    public void setLista_salas(ArrayList<Salas> lista_salas) {
        this.lista_salas = lista_salas;
    }
  
    public void addSalas(Salas S){
        lista_salas.add(S);       
    }    
}
