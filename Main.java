package org.andrea.costruttori;
public class Main {
    public static void main(String[]args) {
        Persona variabileProprietario= new Persona("andrea", "panoni");
        System.out.println (variabileProprietario.getNome() + " "+  variabileProprietario.getCognome());

        Macchina fiat=new Macchina(200, variabileProprietario);
        System.out.println(fiat.getVelocita());
        fiat.setModello("panda");
        System.out.println("il modello è" +" "+fiat.getModello());
        System.out.println("il proprietario è" +" "+fiat.getProprietario());






    }
}

