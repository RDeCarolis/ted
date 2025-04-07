package com.decaro;

public class Cibo {

    private String nome;
    private int energia;
    private Posizione posizione;

    public Cibo(String n, int e, Posizione pos) { // Costruttore
        nome = n;
        energia = e;
        posizione = pos;

    }

    @Override
    public String toString() {
        return "Cibo{" + "nome=" + nome + ", energia=" + energia + ", posizione=" + posizione + '}';
    }

    //setters
    public void setNome(String n) {
        if (n != null && n.length() > 0)
            nome = n;
        else
            System.out.println("Nome non valido");
    }

    public void setEnergia(int e) {
        if (e >= 0 && e <= 100)
            energia = e;
        else if (e < 0)
            energia = 0;
        else
            energia = 100;
    }

    public void setPosizione(Posizione pos) {
        posizione = pos;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public Posizione getPosizione() {
        return posizione;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cibo other = (Cibo) obj;
        return nome.equals(other.nome) && posizione.equals(other.posizione);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + posizione.hashCode();
        return result;
    }

}
