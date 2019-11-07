public class Cubie {

	private int			x;
	private int			y;
	private int			z;
	private boolean		corner;
	private boolean		edge;
	protected Colour[]	colors;

	public Cubie(int xPos, int yPos, int zPos, Colour[] nColors, boolean isCorner, boolean isEdge) {
		x = xPos;
		y = yPos;
		z = zPos;
		corner = isCorner;
		edge = isEdge;
		colors = nColors;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	public boolean isCornerCubie() {
		return corner;
	}
	
	public boolean isEdgeCubie() {
		return edge;
	}
	
	public Colour[] getColors() {
		return colors;
	}
	
	public char getFaceOfColor(char color) {
		for (int i = 0; i<colors.length; i++) {
			if (colors[i].getColor() == color)
				return colors[i].getFace();
		}
		return '0';
	}
	
	public char getColorOfFace(char face) {
		for (int i = 0; i<colors.length; i++) {
			if (colors[i].getFace() == face)
				return colors[i].getColor();
		}
		return '0';
	}
	
	public void setColors(Colour[] newColors) {
		this.colors = newColors;
	}
	
	public void setColorOfFace(char face, char ncolor) {
		for (int i = 0; i<colors.length; i++) {
			if (colors[i].getFace() == face)
				colors[i].setColor(ncolor);
		}
	}

	public char verticalFace(int x, int y) {
		if (edge) {
			if (x == 0) {
				return 'L';
			}
			else if (x == 1) {
				if (y == 0) {
					return 'F';
				}
				else return 'B';
			}
			else return 'R';
		}
		return '0';
	
	}
	
	public boolean isWhiteCorner() {
		if (corner) {
			return (colors[0].getColor()=='W'|| colors[1].getColor()=='W' || colors[2].getColor()=='W');
		}
		return false;
	}

}