package com.decaro;

public class Personaggio {
                             // private ---> NON permette di scrivere nel codice il valore di queste variabili.
    private String nome;
    private String provenienza;
    private int età;
    private Skin skin;
    private int vita = 100;
    private Posizione p;

    public Personaggio(String n, String pr, int e, Skin s, Posizione pos){     //Costruttore
        
        nome = n;
        provenienza = pr;
        età = e;
        skin = s;
        p = pos;

    }

    //setters
    public void setNome(String n) {
        if (n != null && n.length() > 0)
            nome = n;
        else
            System.out.println("Nome non valido");
    }

    public void setProvenienza(String pr) {
        if (pr != null && pr.length() > 0)
            provenienza = pr;
        else
            System.out.println("Provenienza non valida");
    }

    public void setEtà(int e) {
        if (e > 0)
            età = e;
        else
            System.out.println("Età non valida");
    }

    public void setSkin(Skin s) {
        skin = s;
    }

    public void setPosizione(Posizione pos) {
        p = pos;
    }

    public void setVita(int v) {
        if (v >= 0 && v <= 100)
            vita = v;
        else if (v < 0)
            vita = 0;
        else
            vita = 100;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getVita() {
        return vita;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public int getEtà() {
        return età;
    }

    public Skin getSkin() {
        return skin;
    }

    public Posizione getPosizione() {
        return p;
    }

    //Metodi
    public void siMuove(char dir, int dimX, int dimY){
        switch(dir){

			case 'w':   if (this.getPosizione().getY() > 0)
                        this.getPosizione().setY(this.getPosizione().getY() -1);
                    break;

			case 'a':   if (this.getPosizione().getX() > 0)
                        this.getPosizione().setX(this.getPosizione().getX() -1);

			case 's':   if (this.getPosizione().getY() < dimY -1)
                        this.getPosizione().setY(this.getPosizione().getY() +1);
                    break;

			case 'd':   if (this.getPosizione().getX() < dimX -1)
                        this.getPosizione().setX(this.getPosizione().getX() +1);
                    break;
		}
    }

    public void mangia(Cibo c){
        this.setVita (vita + c.getEnergia());
    }


    @Override
    public String toString() {
        return "Personaggio [nome=" + nome + ", provenienza=" + provenienza + ", età=" + età + ", skin=" + skin + ", vita=" +
            vita + ", p=" + p + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personaggio p = (Personaggio) obj;
        return età == p.età && nome.equals(p.nome) && provenienza.equals(p.provenienza);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + provenienza.hashCode();
        result = 31 * result + età;
        return result;
    }

}
