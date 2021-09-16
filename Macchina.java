package org.andrea.costruttori;

public class Macchina {
    private String modello;
    private long velocita;
    private Persona proprietario;

    public Macchina(long velocita, Persona proprietario){
     this.velocita=velocita;
     this.proprietario=proprietario;
    }


    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public long getVelocita() {
        return velocita;
    }

    public void setVelocita(long velocita) {
        this.velocita = velocita;
    }

    public Persona getProprietario() {
        return proprietario;
    }

    public void setProprietario(Persona proprietario) {
        this.proprietario = proprietario;
    }
}
