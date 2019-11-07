public class Colour {
    
    private char    colour;
    private char    face;

    public Colour(char ncolour, char nface) {
        colour = ncolour;
        face = nface;
    }

    public char getColour() {
        return colour;
    }

    public char getFace() {
        return face;
    }

    public void setColour(char ncolour) {
        colour = ncolour;
    }

    public void setFace(char nface) {
        face = nface;
    }
}