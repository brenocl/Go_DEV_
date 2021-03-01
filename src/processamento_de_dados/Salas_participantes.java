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
public class Salas_participantes {
    
    String sala;   
    String nome;
    String sobrenome;
    String evento;

    
    ArrayList<Salas_participantes> lista_part_sala;
    
    public Salas_participantes(){
        lista_part_sala = new ArrayList();
    }    

    public Salas_participantes(String sala, String nome, String sobrenome, String evento) {
        this.sala = sala;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.evento = evento;
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

    public ArrayList<Salas_participantes> getLista_part_sala() {
        return lista_part_sala;
    }

    public void setLista_part_sala(ArrayList<Salas_participantes> lista_part_sala) {
        this.lista_part_sala = lista_part_sala;
    }
    
    public void addParticipantesSalas(Salas_participantes Ps){
        lista_part_sala.add(Ps);       
    }    
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
}
