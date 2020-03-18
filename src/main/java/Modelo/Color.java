package Modelo;

public class Color {

    private String color;

    public Color( String color ) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    @Override
    public boolean equals( Object obj ) {
        if (obj.getClass() == Color.class) {
            Color c = (Color) obj;
            if (c.getColor().equals(this.getColor())) {
                return true;
            }

        }
        return false;
    }
}