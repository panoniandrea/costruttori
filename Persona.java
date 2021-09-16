package org.andrea.costruttori;

public class Persona {
    private String nome;
    private String cognome;
    private String cf;

    public Persona(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf= cf;
    }
    public Persona (String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }


    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                '}';
    }
}