public class F2L {
	static Face [] faces = {Face.Right, Face.Front, Face.Left, Face.Back};
	private static Cube turn(Cube cube, Face face, int type) {
		if (type == 0) {
			if (face == Face.Right) {
				cube.rotate("R");
			}
			else if (face == Face.Left) {
				cube.rotate("L");
			}
			else if (face == Face.Front) {
				cube.rotate("F");
			}
			else if (face == Face.Back) {
				cube.rotate("B");
			}
		}
		else if (type == 1) {
			if (face == Face.Right) {
				cube.rotate("R'");
			}
			else if (face == Face.Left) {
				cube.rotate("L'");
			}
			else if (face == Face.Front) {
				cube.rotate("F'");
			}
			else if (face == Face.Back) {
				cube.rotate("B'");
			}
		}
		else {
			if (face == Face.Right) {
				cube.rotate("R2");
			}
			else if (face == Face.Left) {
				cube.rotate("L2");
			}
			else if (face == Face.Front) {
				cube.rotate("F2");
			}
			else if (face == Face.Back) {
				cube.rotate("B2");
			}
		}
		return cube;
	}
	private static Cube F2l1(Cube cube, Colour colour1, Colour colour2, int rotation) {
		Face cornerFace1 = Face.NULL;
		Face cornerFace2 = Face.NULL;
		Face cornerFace3 = Face.NULL;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isCorner()) {
						for (int f = 0; f < 3; f++) {
							if (cube.cubiePosition[i][j][k].getStickers()[f].getColour() == Colour.White
								&& ((cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == colour1
								&& cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getColour() == colour2)
								|| (cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == colour2
								&& cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getColour() == colour1))) {
									cornerFace1 = cube.cubiePosition[i][j][k].getStickers()[f].getFace();
									cornerFace2 = cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == colour1 ? cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getFace() : cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getFace();
									cornerFace3 = cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getColour() == colour2 ? cube.cubiePosition[i][j][k].getStickers()[(f + 1) % 3].getFace() : cube.cubiePosition[i][j][k].getStickers()[(f + 2) % 3].getFace();
							}
						}
					}
				}
			}
		}
		System.out.println(cornerFace1 + "  " + cornerFace2 + "  " + cornerFace3);
		if (cornerFace1 != Face.Up && cornerFace2 != Face.Up && cornerFace3 != Face.Up) {
			// return F2L30(cube, cornerFace1, cornerFace2, cornerFace3)
		}
		while ((cornerFace1 == Face.Up || cornerFace2 == Face.Up || cornerFace3 == Face.Up) && (cornerFace1 == faces[2 + rotation % 4] || cornerFace2 == faces[2 + rotation % 4] || cornerFace3 == faces[2 + rotation % 4]) && (cornerFace1 == faces[1 + rotation % 4] || cornerFace2 == faces[1 + rotation % 4] || cornerFace3 == faces[1 + rotation % 4]) != true) {
			cube.rotate("U");
			Face [] previousFaces = {Face.Right, Face.Front, Face.Left, Face.Back};
			Face [] currentFaces = {Face.Front, Face.Left, Face.Back, Face.Right};
			for (int i = 0; i < 4; i++) {
				if (cornerFace1 == previousFaces[i]) {
					cornerFace1 = currentFaces[i];
				}
				if (cornerFace2 == previousFaces[i]) {
					cornerFace2 = currentFaces[i];
				}
				if (cornerFace3 == previousFaces[i]) {
					cornerFace3 = currentFaces[i];
				}
			}
		}
		Face edgeFace1 = Face.NULL;
		Face edgeFace2 = Face.NULL;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isEdge()) {
						for (int f = 0; f < 2; f++) {
							if (cube.cubiePosition[i][j][k].getStickers()[f].getColour() == colour1 && cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getColour() == colour2) {
								edgeFace1 = cube.cubiePosition[i][j][k].getStickers()[f].getFace();
								edgeFace2 = cube.cubiePosition[i][j][k].getStickers()[Math.abs(f - 1)].getFace();
							}
						}
					}
				}
			}
		}
		// Basic Cases
		if (cornerFace1 == faces[2 + rotation % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[1 + rotation % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[1 + rotation % 4]) {
			cube.rotate("U");
			cube = turn(faces[1 + rotation % 4], 0);
			cube.rotate("U'");
			cube = turn(faces[1 + rotation % 4], 1);
			return cube;
		}
		else {
			return F2L2(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Basic Cases Cont.
	private static Cube F2L2(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[1 + rotation % 4] && cornerFace2 == faces[2 + rotation % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[2 + rotation % 4] && edgeFace2 == Face.Up) {
			cube.rotate("U'");
			cube = turn(faces[2 + rotation % 4], 1);
			cube.rotate("U");
			cube = turn(faces[2 + rotation % 4], 0);
			return cube;
		}
		else {
			return F2L3(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L3(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[2 + rotation % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[1 + rotation % 4] && edgeFace1 == faces[3 + rotation % 4] && edgeFace2 == Face.Up) {
			cube = turn(faces[2 + rotation % 4], 1);
			cube.rotate("U'");
			cube = turn(faces[2 + rotation % 4], 0);
			return cube;
		}
		else {
			return F2L4(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L4(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[1 + rotation % 4] && cornerFace2 == faces[2 + rotation % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[0 + rotation % 4]) {
			cube = turn(faces[1 + rotation % 4], 0);
			cube.rotate("U");
			cube = turn(faces[1 + rotation % 4], 1);
			return cube;
		}
		else {
			return F2L5(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Reposition Edge
	private static Cube F2L5(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[2 + rotation % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[1 + rotation % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[0 + rotation % 4]) {
			cube = turn(faces[2 + rotation % 4], 2);
			cube = turn(faces[3 + rotation % 4], 1);
			cube.rotate("U'");
			cube = turn(faces[3 + rotation % 4], 0);
			cube.rotate("U");
			cube = turn(faces[2 + rotation % 4], 2);
			return cube;
		}
		else {
			return F2L6(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L6(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[1 + rotation % 4] && cornerFace2 == faces[2 + rotation % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[3 + rotation % 4] && edgeFace2 == Face.Up) {
			cube = turn(faces[1 + rotation % 4], 2);
			cube = turn(faces[0 + rotation % 4], 0);
			cube.rotate("U");
			cube = turn(faces[0 + rotation % 4], 1);
			cube.rotate("U'");
			cube = turn(faces[1 + rotation % 4], 2);
			return cube;
		}
		else {
			return F2L7(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L7(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[2 + rotation % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[1 + rotation % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[3 + rotation % 4]) {
			cube = turn(faces[1 + rotation % 4], 0);
			cube.rotate("U");
			cube = turn(faces[0  + rotation % 4], 0);
			cube.rotate("U2");
			cube = turn(faces[0  + rotation % 4], 1);
			cube.rotate("U");
			cube = turn(faces[1 + rotation % 4], 1);
			return cube;
		}
		else {
			return F2L8(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L8(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[1 + rotation % 4] && cornerFace2 == faces[1 + rotation % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[0 + rotation % 4] && edgeFace2 == Face.U) {
			cube = turn(faces[2 + rotation % 4], 1);
			cube.rotate("U'");
			cube = turn(faces[3 + rotation % 4], 1);
			cube.rotate("U2");
			cube = turn(faces[3 + rotation % 4], 0);
			cube.rotate("U");
			cube = turn(faces[2 + rotation % 4], 0);
			return cube;
		}
		else {
			return F2L9(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Reposition Edge & Flip Corner
	private static Cube F2L9(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[2 + rotation % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[1 + rotation % 4] && edgeFace1 == faces[0 + rotation % 4] && edgeFace2 == Face.Up) {
			cube = turn(faces[1 + rotation % 4], 2);
			cube.rotate("U");
			cube = turn(faces[0 + rotation % 4], 0);
			cube.rotate("U'");
			cube = turn(faces[0 + rotation % 4], 1);
			cube = turn(faces[1 + rotation % 4], 2);
			return cube;
		}
		else {
			return F2L10(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L10(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[1 + rotation % 4] && cornerFace2 == faces[2 + rotation % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[3 + rotation % 4]) {
			cube = turn(faces[2 + rotation % 4], 2);
			cube.rotate("U'");
			cube = turn(faces[3 + rotation % 4], 1);
			cube.rotate("U");
			cube = turn(faces[3 + rotation % 4], 0);
			cube = turn(faces[2 + rotation % 4], 2);
			return cube;
		}
		else {
			return F2L11(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L11(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[2 + rotation % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[1 + rotation % 4] && edgeFace1 == faces[1 + rotation % 4] && edgeFace2 == Face.Up) {
			cube = turn(faces[2 + rotation % 4], 0);
			cube.rotate("U2");
			cube = turn(faces[2 + rotation % 4], 2);
			cube.rotate("U'");
			cube = turn(faces[2 + rotation % 4], 2);
			cube.rotate("U'");
			cube = turn(faces[2 + rotation % 4], 1);
			return cube;
		}
		else {
			return F2L12(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L12(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[1 + rotation % 4] && cornerFace2 == faces[2 + rotation % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[2 + rotation % 4]) {
			cube = turn(faces[1 + rotation % 4], 1);
			cube.rotate("U2");
			cube = turn(faces[1 + rotation % 4], 2);
			cube.rotate("U");
			cube = turn(faces[1 + rotation % 4], 2);
			cube.rotate("U");
			cube = turn(faces[1 + rotation % 4], 0);
			return cube;
		}
		else {
			return F2L13(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L13(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[2 + rotation % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[1 + rotation % 4] && edgeFace1 == faces[2 + rotation % 4] && edgeFace2 == Face.Up) {
			cube.rotate("U");
			cube = turn(faces[2 + rotation % 4], 1);
			cube.rotate("U");
			cube = turn(faces[2 + rotation % 4], 0);
			cube.rotate("U'");
			cube = turn(faces[2 + rotation % 4], 1);
			cube.rotate("U'");
			cube = turn(faces[2 + rotation % 4], 0);
			return cube;
		}
		else {
			return F2L14(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L14(Cube cube, Colour colour1, Colour colour2, int rotation) {
		if (cornerFace1 == faces[1 + rotation % 4] && cornerFace2 == faces[2 + rotation % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[1 + rotation % 4]) {
			cube.rotate("U'");
			cube = turn(faces[1 + rotation % 4], 0);
			cube.rotate("U'");
			cube = turn(faces[1 + rotation % 4], 1);
			cube.rotate("U");
			cube = turn(faces[1 + rotation % 4], 0);
			cube.rotate("U");
			cube = turn(faces[1 + rotation % 4], 1);
			return cube;
		}
		else {
			return F2L15(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Split Pair
	private static Cube F2L15(Cube cube, Colour colour1, Colour colour2, int rotation) {
	}
	public static Cube solve(Cube cube) {
		cube = F2l1(cube, Colour.Red, Colour.Green, 0);
		return cube;
	}
}