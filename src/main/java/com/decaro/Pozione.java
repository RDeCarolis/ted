package com.decaro;

public class Pozione {

    private String nome;
    private int mana;
    private Posizione posizione;

    public Pozione(){}

    public Pozione(String n, int m, Posizione p) { // Costruttore
        nome = n;
        mana = m;
        posizione = p;

    }

    //setters
    public void setNome(String n) {
        if (n != null && n.length() > 0)
            nome = n;
        else
            System.out.println("Nome non valido");
    }

    public void setMana(int m) {
        if (m >= 0 && m <= 100)
            mana = m;
        else if (m < 0)
            mana = 0;
        else
            mana = 100;
    }

    public void setPosizione(Posizione pos) {
        posizione = pos;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getMana() {
        return mana;
    }

    public Posizione getPosizione() {
        return posizione;
    }

    @Override
    public String toString() {
        return "Pozione{" + "nome=" + nome + ", mana=" + mana + ", posizione=" + posizione + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pozione other = (Pozione) obj;
        return nome.equals(other.nome) && posizione.equals(other.posizione);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + posizione.hashCode();
        return result;
    }


}
