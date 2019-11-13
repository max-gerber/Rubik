public class WhiteCorners {
	private static Cube redGreenCorner(Cube cube) {
		Face green = Face.NULL;
		Face white = Face.NULL;
		Face red = Face.NULL;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isCorner()) {
						for (int f = 0; f < 3; f++) {
							if (cube.cubiePosition[i][j][k].getStickers()[f].getColour() == Colour.White
								&& ((cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == Colour.Green
								&& cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getColour() == Colour.Red)
								|| (cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == Colour.Red
								&& cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getColour() == Colour.Green))) {
									white = cube.cubiePosition[i][j][k].getStickers()[f].getFace();
									green = cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == Colour.Green ? cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getFace() : cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getFace();
									red = cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == Colour.Red ? cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getFace() : cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getFace();
							}
						}
					}
				}
			}
		}
		System.out.println(green + "	" + white + "	" + red);
		return cube;
	}
	public static Cube solve(Cube cube) {
		cube = redGreenCorner(cube);
		return cube;
	}    
}