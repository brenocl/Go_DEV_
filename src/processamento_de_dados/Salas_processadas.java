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
public class Salas_processadas {
    
    private String nome;
    private String tipo;
    private int alocacao;
    ArrayList<Salas_processadas> lista_salasproc;

    public Salas_processadas(String nome, String tipo, int alocacao, ArrayList<Salas_processadas> lista_salasproc) {
        this.nome = nome;
        this.tipo = tipo;
        this.alocacao = alocacao;
        this.lista_salasproc = lista_salasproc;
    }
    
    public Salas_processadas(){
        lista_salasproc = new ArrayList();
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

    public int getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(int alocacao) {
        this.alocacao = alocacao;
    }

    public ArrayList<Salas_processadas> getLista_salasprocessadas() {
        return lista_salasproc;
    }

    public void setLista_salasprocessadas(ArrayList<Salas_processadas> lista_salasprocessadas) {
        this.lista_salasproc = lista_salasprocessadas;
    }
    public void addSalasProc(Salas_processadas Sp){
        lista_salasproc.add(Sp);       
    }
}


