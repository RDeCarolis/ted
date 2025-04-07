package com.decaro;

import java.util.Random;

public class Mago extends Personaggio{

    private int mana = 100;

    public Mago(String n, String pr, int e, Skin s, Posizione pos){

        super(n, pr, e, s, pos);
    }

    public Mago(String n, String pr, int e, Skin s, Posizione pos, int m){

        super(n, pr, e, s, pos);
        mana = m;
    }

    //setters
    public void setMana(int m) {
        if (m >= 0 && m <= 100)
            mana = m;
        else if (m < 0)
            mana = 0;
        else
            mana = 100;
    }

    //getters
    public int getMana() {
        return mana;
    }

    public void lanciaMagia(Magia m, Personaggio p){
        Random r = new Random();

        if (mana >= m.getMana())
            mana -= m.getMana();
        if (r.nextInt(10) +1 > 3)
            p.setVita(p.getVita() - m.getDanno());
        if (p.getVita() < 0)
            p.setVita(0);
    }

    public void bevePozione(Pozione p){

        mana += p.getMana();
        if (mana > 100)
            mana = 100;
    }

    @Override
    public String toString() {
        return "Mago [nome=" + this.getNome() + ", provenienza=" + this.getProvenienza() + ", età=" + this.getEtà() + ", skin=" + this.getSkin() + ", vita=" + this.getVita()
                + ", p=" + this.getPosizione() + ", mana=" + mana + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Mago)) return false;
        Mago other = (Mago) obj;
        return super.equals(obj) && this.mana == other.mana;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 31 * mana;
    }

}
