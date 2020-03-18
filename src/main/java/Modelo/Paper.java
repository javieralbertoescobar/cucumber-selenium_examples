package Modelo;

public class Paper {
    boolean isColored;
    Color colorInSurface;

    public Paper() {
        this.isColored = false;
    }

    public boolean isColored() {
        return isColored;
    }

    public Color colorOnSurface(){
        return this.colorInSurface; }

    public void colored( Color color ) {

        this.isColored = true;
        this.colorInSurface = color;

    }
}
