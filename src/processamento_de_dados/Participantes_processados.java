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
    private String etapa1;
    private String intervalo1;
    private String etapa2;
    private String intervalo2;
    ArrayList<Participantes_processados> lista_partcproc;

    public Participantes_processados(String nome, String sobrenome, String etapa1, String intervalo1, String etapa2, String intervalo2) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.etapa1 = etapa1;
        this.intervalo1 = intervalo1;
        this.etapa2 = etapa2;
        this.intervalo2 = intervalo2;
        
    }
    
    
    public Participantes_processados(){
        lista_partcproc = new ArrayList();
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

    public String getEtapa1() {
        return etapa1;
    }

    public void setEtapa1(String etapa1) {
        this.etapa1 = etapa1;
    }

    public String getIntervalo1() {
        return intervalo1;
    }

    public void setIntervalo1(String intervalo1) {
        this.intervalo1 = intervalo1;
    }

    public String getEtapa2() {
        return etapa2;
    }

    public void setEtapa2(String etapa2) {
        this.etapa2 = etapa2;
    }

    public String getIntervalo2() {
        return intervalo2;
    }

    public void setIntervalo2(String intervalo2) {
        this.intervalo2 = intervalo2;
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
