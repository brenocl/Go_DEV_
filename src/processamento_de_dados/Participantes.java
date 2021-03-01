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
public class Participantes {
    
    private String nome;
    private String sobrenome;
    private int numero;
    
    ArrayList<Participantes> lista_partc;
    
    public Participantes(){
        lista_partc = new ArrayList(); 
    }
    
      
    public Participantes(String nome, String sobrenome, int numero) {
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
      
    public ArrayList<Participantes> getPartc() {
        return lista_partc;
    }

    public void setPartc(ArrayList<Participantes> partc) {
        this.lista_partc = partc;
    }
    public void addPartc(Participantes P){
        lista_partc.add(P);
    }
}
