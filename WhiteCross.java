public class WhiteCross {
	private static Cube greenFace(Cube cube) {
		Face green = Face.NULL;
		Face white = Face.NULL;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isEdge()) {
						for (int f = 0; f < 2; f++) {
							if (cube.cubiePosition[i][j][k].getStickers()[f].getColour() == Colour.White
								&& cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getColour() == Colour.Green) {
								green = cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getFace();
								white = cube.cubiePosition[i][j][k].getStickers()[f].getFace();
							}
						}
					}
				}
			}
		}
		if (white == Face.Down) {
			if (green == Face.Right) {
				cube.rotate("D'");
			}
			else if (green == Face.Left) {
				cube.rotate("D");
			}
			else if (green == Face.Back) {
				cube.rotate("D2");
			}
		}
		else if (white == Face.Up) {
			if (green == Face.Right) {
				cube.rotate("U");
			}
			else if (green == Face.Left) {
				cube.rotate("U'");
			}
			else if (green == Face.Back) {
				cube.rotate("U2");
			}
			cube.rotate("F2");
		}
		else if (white == Face.Right) {
			if (green == Face.Down) {
				cube.rotate("R");
			}
			else if (green == Face.Up) {
				cube.rotate("R'");
			}
			else if (green == Face.Back) {
				cube.rotate("R2");
			}
			cube.rotate("F");
		}
		else if (white == Face.Left) {
			if (green == Face.Down) {
				cube.rotate("L'");
			}
			else if (green == Face.Up) {
				cube.rotate("L");
			}
			else if (green == Face.Back) {
				cube.rotate("L2");
			}
			cube.rotate("F'");
		}
		else if (white == Face.Back) {
			if (green == Face.Up) {
				cube.rotate("B");
				cube.rotate("L'");
				cube.rotate("D");
			}
			else if (green == Face.Down) {
				cube.rotate("B");
				cube.rotate("R");
				cube.rotate("D'");
			}
			else if (green == Face.Right) {
				cube.rotate("R");
				cube.rotate("D'");
			}
			else if (green == Face.Left) {
				cube.rotate("L'");
				cube.rotate("D");
			}
		}
		else if (white == Face.Front) {
			if (green == Face.Right) {
				cube.rotate("R'");
				cube.rotate("D'");
			}
			else if (green == Face.Left) {
				cube.rotate("L");
				cube.rotate("D");
			}
			else if (green == Face.Up) {
				cube.rotate("F");
				cube.rotate("R'");
				cube.rotate("D'");
			}
			else if (green == Face.Down) {
				cube.rotate("F");
				cube.rotate("L");
				cube.rotate("D");
			}
		}
		return cube;
	}
	private static Cube orangeFace(Cube cube) {
		Face orange = Face.NULL;
		Face white = Face.NULL;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isEdge()) {
						for (int f = 0; f < 2; f++) {
							if (cube.cubiePosition[i][j][k].getStickers()[f].getColour() == Colour.White
								&& cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getColour() == Colour.Orange) {
								orange = cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getFace();
								white = cube.cubiePosition[i][j][k].getStickers()[f].getFace();
							}
						}
					}
				}
			}
		}
		if (white == Face.Down) {
			if (orange == Face.Back) {
				cube.rotate("B");
				cube.rotate("D");
				cube.rotate("B'");
				cube.rotate("D'");
			}
			else if (orange == Face.Left) {
				cube.rotate("L");
				cube.rotate("D2");
				cube.rotate("L'");
				cube.rotate("D2");
			}
		}
		else if (white == Face.Up) {
			if (orange == Face.Front) {
				cube.rotate("U'");
			}
			else if (orange == Face.Left) {
				cube.rotate("U2");
			}
			else if (orange == Face.Back) {
				cube.rotate("U");
			}
			cube.rotate("R2");
		}
		else if (white == Face.Right) {
			if (orange == Face.Down) {
				cube.rotate("R");
				cube.rotate("D'");
				cube.rotate("F");
				cube.rotate("D");
			}
			else if (orange == Face.Up) {
				cube.rotate("R");
				cube.rotate("D");
				cube.rotate("B'");
				cube.rotate("D'");
			}
			else if (orange == Face.Back) {
				cube.rotate("D");
				cube.rotate("B'");
				cube.rotate("D'");
			}
			else if (orange == Face.Front) {
				cube.rotate("D'");
				cube.rotate("F");
				cube.rotate("D");
			}
		}
		else if (white == Face.Left) {
			if (orange == Face.Front) {
				cube.rotate("D'");
				cube.rotate("F'");
				cube.rotate("D");
			}
			else if (orange == Face.Up) {
				cube.rotate("L");
				cube.rotate("D'");
				cube.rotate("F'");
				cube.rotate("D");
			}
			else if (orange == Face.Back) {
				cube.rotate("D");
				cube.rotate("B");
				cube.rotate("D'");
			}
			else if (orange == Face.Down) {
				cube.rotate("L");
				cube.rotate("D");
				cube.rotate("B");
				cube.rotate("D'");
			}
		}
		else if (white == Face.Back) {
			if (orange == Face.Up) {
				cube.rotate("B'");
			}
			else if (orange == Face.Down) {
				cube.rotate("B");
			}
			else if (orange == Face.Left) {
				cube.rotate("B2");
			}
			cube.rotate("R");
		}
		else if (white == Face.Front) {
			if (orange == Face.Up) {
				cube.rotate("D'");
				cube.rotate("F");
				cube.rotate("D");
			}
			else if (orange == Face.Left) {
				cube.rotate("D'");
				cube.rotate("F2");
				cube.rotate("D");
			}
			cube.rotate("R'");
		}
		return cube;
	}
	private static Cube redFace(Cube cube) {
		Face red = Face.NULL;
		Face white = Face.NULL;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isEdge()) {
						for (int f = 0; f < 2; f++) {
							if (cube.cubiePosition[i][j][k].getStickers()[f].getColour() == Colour.White
								&& cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getColour() == Colour.Red) {
								red = cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getFace();
								white = cube.cubiePosition[i][j][k].getStickers()[f].getFace();
							}
						}
					}
				}
			}
		}
		if (white == Face.Down) {
			if (red == Face.Back) {
				cube.rotate("B");
				cube.rotate("D'");
				cube.rotate("B'");
				cube.rotate("D");
			}
		}
		else if (white == Face.Up) {
			if (red == Face.Front) {
				cube.rotate("U");
			}
			else if (red == Face.Right) {
				cube.rotate("U2");
			}
			else if (red == Face.Back) {
				cube.rotate("U'");
			}
			cube.rotate("L2");
		}
		else if (white == Face.Right) {
			if (red == Face.Up) {
				cube.rotate("D'");
				cube.rotate("R");
				cube.rotate("B'");
				cube.rotate("D");
			}
			else if (red == Face.Back) {
				cube.rotate("D'");
				cube.rotate("B'");
				cube.rotate("D");
			}
			else if (red == Face.Front) {
				cube.rotate("D");
				cube.rotate("F");
				cube.rotate("D'");
			}
		}
		else if (white == Face.Left) {
			if (red == Face.Front) {
				cube.rotate("D");
				cube.rotate("F'");
				cube.rotate("D'");
			}
			else if (red == Face.Up) {
				cube.rotate("L");
				cube.rotate("D");
				cube.rotate("F'");
				cube.rotate("D'");
			}
			else if (red == Face.Back) {
				cube.rotate("D'");
				cube.rotate("B");
				cube.rotate("D");
			}
			else if (red == Face.Down) {
				cube.rotate("L");
				cube.rotate("D'");
				cube.rotate("B");
				cube.rotate("D");
			}
		}
		else if (white == Face.Back) {
			if (red == Face.Up) {
				cube.rotate("B");
			}
			else if (red == Face.Down) {
				cube.rotate("B'");
			}
			else if (red == Face.Right) {
				cube.rotate("B2");
			}
			cube.rotate("L'");
		}
		else if (white == Face.Front) {
			if (red == Face.Up) {
				cube.rotate("D");
				cube.rotate("F'");
				cube.rotate("D'");
			}
			else if (red == Face.Left) {
				cube.rotate("D");
				cube.rotate("F2");
				cube.rotate("D'");
			}
			cube.rotate("L");
		}
		return cube;
	}
	private static Cube blueFace(Cube cube) {
		Face blue = Face.NULL;
		Face white = Face.NULL;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isEdge()) {
						for (int f = 0; f < 2; f++) {
							if (cube.cubiePosition[i][j][k].getStickers()[f].getColour() == Colour.White
								&& cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getColour() == Colour.Blue) {
								blue = cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getFace();
								white = cube.cubiePosition[i][j][k].getStickers()[f].getFace();
							}
						}
					}
				}
			}
		}
		if (white == Face.Up) {
			if (blue == Face.Front) {
				cube.rotate("U2");
			}
			else if (blue == Face.Right) {
				cube.rotate("U'");
			}
			else if (blue == Face.Left) {
				cube.rotate("U");
			}
			cube.rotate("B2");
		}
		else if (white == Face.Right) {
			if (blue == Face.Up) {
				cube.rotate("D'");
				cube.rotate("R");
				cube.rotate("D");
			}
			else if (blue == Face.Front) {
				cube.rotate("D'");
				cube.rotate("R2");
				cube.rotate("D");
			}
			cube.rotate("B'");
		}
		else if (white == Face.Left) {
			if (blue == Face.Front) {
				cube.rotate("D");
				cube.rotate("L2");
				cube.rotate("D'");
			}
			else if (blue == Face.Up) {
				cube.rotate("D");
				cube.rotate("L'");
				cube.rotate("D'");
			}
			cube.rotate("B");
		}
		else if (white == Face.Back) {
			if (blue == Face.Up) {
				cube.rotate("B");
				cube.rotate("D");
				cube.rotate("L'");
				cube.rotate("D'");
			}
			else if (blue == Face.Left) {
				cube.rotate("D");
				cube.rotate("L'");
				cube.rotate("D'");
			}
			else if (blue == Face.Down) {
				cube.rotate("B");
				cube.rotate("D'");
				cube.rotate("R");
				cube.rotate("D");
			}
			else if (blue == Face.Right) {
				cube.rotate("D'");
				cube.rotate("R");
				cube.rotate("D");
			}
		}
		else if (white == Face.Front) {
			if (blue == Face.Up) {
				cube.rotate("D2");
				cube.rotate("F");
				cube.rotate("D");
				cube.rotate("R'");
				cube.rotate("D");
			}
			else if (blue == Face.Right) {
				cube.rotate("D'");
				cube.rotate("R'");
				cube.rotate("D");
			}
			else if (blue == Face.Left) {
				cube.rotate("D");
				cube.rotate("R'");
				cube.rotate("D");
			}
		}
		return cube;
	}
	public static Cube solve(Cube cube) {
		cube = greenFace(cube);
		cube = orangeFace(cube);
		cube = redFace(cube);
		cube = blueFace(cube);
		return cube;
	}    
}