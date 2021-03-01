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
public class Participantes_processados {
    
    private String nome;
    private String sobrenome;
    private String sala1;
    private String cafe1;
    private String sala2;
    private String cafe2;
    ArrayList<Participantes_processados> lista_partcproc;

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

    public String getSala1() {
        return sala1;
    }

    public void setSala1(String sala1) {
        this.sala1 = sala1;
    }

    public String getCafe1() {
        return cafe1;
    }

    public void setCafe1(String cafe1) {
        this.cafe1 = cafe1;
    }

    public String getSala2() {
        return sala2;
    }

    public void setSala2(String sala2) {
        this.sala2 = sala2;
    }

    public String getCafe2() {
        return cafe2;
    }

    public void setCafe2(String cafe2) {
        this.cafe2 = cafe2;
    }

    public ArrayList<Participantes_processados> getLista_partcproc() {
        return lista_partcproc;
    }

    public void setLista_partcproc(ArrayList<Participantes_processados> lista_partcproc) {
        this.lista_partcproc = lista_partcproc;
    }
    
    public void addPartcProc(Participantes_processados Pc){
        lista_partcproc.add(Pc);
    }
    
}
