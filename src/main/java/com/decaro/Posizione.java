package com.decaro;

public class Posizione {

    private int x;
    private int y;

    public Posizione(int x, int y){
        this.x = x;
        this.y = y;

    }

    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Posizione{" + "x=" + x + ", y=" + y +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Posizione posizione = (Posizione) obj;
        return x == posizione.x && y == posizione.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

}
