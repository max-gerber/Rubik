enum Colour{
    Red,
    Yellow,
    Green,
    Blue,
    White,
	Orange,
	NULL
}

enum Face{
    Up,
    Down,
    Left,
    Right,
    Front,
	Back,
	NULL
}

public class Sticker {
    
    private Colour	colour;
    private Face	face;

    public Sticker(Colour ncolour, Face nface) {
        colour = ncolour;
        face = nface;
    }

    public Colour getColour() {
        return colour;
    }

    public Face getFace() {
        return face;
    }

    public void setColour(Colour ncolour) {
        colour = ncolour;
    }

    public void setFace(Face nface) {
        face = nface;
    }
}