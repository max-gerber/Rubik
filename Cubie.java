public class Cubie {

	private boolean		corner;
	private boolean		edge;
	protected Sticker[]	stickers;

	public Cubie(Sticker[] nStickers, boolean isCorner, boolean isEdge) {
		corner = isCorner;
		edge = isEdge;
		stickers = nStickers;
	}
	
	public boolean isCorner() {
		return corner;
	}
	
	public boolean isEdge() {
		return edge;
	}
	
	public Sticker[] getStickers() {
		return stickers;
	}
	
	public Face getFaceOfColour(Colour colour) {
		for (int i = 0; i < stickers.length; i++) {
			if (stickers[i].getColour() == colour) {
				return stickers[i].getFace();
			}
		}
		return Face.NULL;
	}
	
	// public char getColorOfFace(char face) {
	// 	for (int i = 0; i < colors.length; i++) {
	// 		if (colors[i].getFace() == face)
	// 			return colors[i].getColor();
	// 	}
	// 	return '0';
	// }
	
	public void setStickers(Sticker[] newStickers) {
		this.stickers = newStickers;
	}
	
	// public void setColorOfFace(char face, char ncolor) {
	// 	for (int i = 0; i < colors.length; i++) {
	// 		if (colors[i].getFace() == face)
	// 			colors[i].setColor(ncolor);
	// 	}
	// }
	
	// public boolean isWhiteCorner() {
	// 	if (corner) {
	// 		return (stickers[0].getColour()=='W'|| stickers[1].getColour()=='W' || stickers[2].getColour()=='W');
	// 	}
	// 	return false;
	// }

}