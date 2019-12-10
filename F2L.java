public class F2L {
	private static Face [] faces = {Face.Right, Face.Front, Face.Left, Face.Back};
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
	private static Cube F2l0(Cube cube, Colour colour1, Colour colour2, int rotation) {
		Face cornerFace1 = Face.NULL;
		Face cornerFace2 = Face.NULL;
		Face cornerFace3 = Face.NULL;
		Face edgeFace1 = Face.NULL;
		Face edgeFace2 = Face.NULL;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (cube.cubiePosition[i][j][k].isCorner()) {
						if (cube.cubiePosition[i][j][k].getFaceOfColour(Colour.White) != Face.NULL &&
						cube.cubiePosition[i][j][k].getFaceOfColour(colour1) != Face.NULL &&
						cube.cubiePosition[i][j][k].getFaceOfColour(colour2) != Face.NULL) {
								cornerFace1 = cube.cubiePosition[i][j][k].getFaceOfColour(Colour.White);
								cornerFace2 = cube.cubiePosition[i][j][k].getFaceOfColour(colour1);
								cornerFace3 = cube.cubiePosition[i][j][k].getFaceOfColour(colour2);
						}
					}
				}
			}
		}
		System.out.println(cornerFace1 + ", " + cornerFace2 + ", " + cornerFace3);
		if (cornerFace1 != Face.Up && cornerFace2 != Face.Up && cornerFace3 != Face.Up) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						if (cube.cubiePosition[i][j][k].isEdge()) {
							if (cube.cubiePosition[i][j][k].getFaceOfColour(colour1) != Face.NULL && cube.cubiePosition[i][j][k].getFaceOfColour(colour2) != Face.NULL) {
								edgeFace1 = cube.cubiePosition[i][j][k].getFaceOfColour(colour1);
								edgeFace2 = cube.cubiePosition[i][j][k].getFaceOfColour(colour2);
							}
						}
					}
				}
			}
			System.out.println(edgeFace1 + ", " + edgeFace2);
			return F2L31(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
		// FIX
		while (((cornerFace1 == Face.Up || cornerFace2 == Face.Up || cornerFace3 == Face.Up) && (cornerFace1 == faces[(2 + rotation) % 4] || cornerFace2 == faces[(2 + rotation) % 4] || cornerFace3 == faces[(2 + rotation) % 4]) && (cornerFace1 == faces[(1 + rotation) % 4] || cornerFace2 == faces[(1 + rotation) % 4] || cornerFace3 == faces[(1 + rotation) % 4])) == false) {
			cube.rotate("U");
			Face [] previousFaces = {Face.Right, Face.Front, Face.Left, Face.Back};
			Face [] currentFaces = {Face.Front, Face.Left, Face.Back, Face.Right};
			for (int i = 0; i < 4; i++) {
				if (cornerFace1 == previousFaces[i]) {
					cornerFace1 = currentFaces[i];
					break;
				}
			}
			for (int i = 0; i < 4; i++) {
				if (cornerFace2 == previousFaces[i]) {
					cornerFace2 = currentFaces[i];
					break;
				}
			}
			for (int i = 0; i < 4; i++) {
				if (cornerFace3 == previousFaces[i]) {
					cornerFace3 = currentFaces[i];
					break;
				}
			}
		}
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
		// Solved
		if (cornerFace1 == Face.Down && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == faces[(1 + rotation) % 4]) {
			return cube;
		}
		else {
			return F2L1(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Basic Cases
	private static Cube F2L1(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L2(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L2(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L3(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L3(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(3 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L4(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L4(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[(0 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L5(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Reposition Edge
	private static Cube F2L5(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(0 + rotation) % 4]) {
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube = turn(cube, faces[(3 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(3 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			return cube;
		}
		else {
			return F2L6(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L6(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[(3 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube = turn(cube, faces[(0 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(0 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			return cube;
		}
		else {
			return F2L7(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L7(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(3 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(0  + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(0  + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L8(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L8(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[(0 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(3 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(3 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L9(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Reposition Edge & Flip Corner
	private static Cube F2L9(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(0 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U");
			cube = turn(cube, faces[(0 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(0 + rotation) % 4], 1);
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			return cube;
		}
		else {
			return F2L10(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L10(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[(3 + rotation) % 4]) {
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube.rotate("U'");
			cube = turn(cube, faces[(3 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(3 + rotation) % 4], 0);
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			return cube;
		}
		else {
			return F2L11(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L11(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L12(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L12(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L13(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L13(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L14(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L14(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == Face.Up && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L15(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Split Pair
	private static Cube F2L15(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L16(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L16(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L17(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L17(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L18(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L18(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L19(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Pair on Side
	private static Cube F2L19(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(0 + rotation) % 4]) {
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L20(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L20(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(3 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L21(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L21(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(3 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube = turn(cube, faces[(0 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(0 + rotation) % 4], 1);
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L22(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L22(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(0 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube = turn(cube, faces[(3 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(3 + rotation) % 4], 0);
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L23(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Weird
	private static Cube F2L23(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			return cube;
		}
		else {
			return F2L24(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L24(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			return cube;
		}
		else {
			return F2L25(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Edge in Place, Corner in U face
	private static Cube F2L25(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L26(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L26(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Up && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			return cube;
		}
		else {
			return F2L27(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L27(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L28(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L28(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L29(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L29(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == Face.Up && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L30(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L30(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == Face.Up && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L31(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Corner in Place, Edge in U Face
	private static Cube F2L31(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Down && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L32(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L32(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Down && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L33(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L33(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == Face.Down && edgeFace1 == Face.Up && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L34(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L34(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == Face.Down && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L35(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L35(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == Face.Down && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == Face.Up) {
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L36(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L36(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == Face.Down && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == Face.Up && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L37(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	// Edge and Corner in Place
	private static Cube F2L37(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == Face.Down && cornerFace2 == faces[(2 + rotation) % 4] && cornerFace3 == faces[(1 + rotation) % 4] && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L38(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L38(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == Face.Down && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 2);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L39(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L39(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == Face.Down && cornerFace3 == faces[(2 + rotation) % 4] && edgeFace1 == faces[(2 + rotation) % 4] && edgeFace2 == faces[(1 + rotation) % 4]) {
			cube = turn(cube, faces[(2 + rotation) % 4], 2);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U2");
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			return cube;
		}
		else {
			return F2L40(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L40(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(2 + rotation) % 4] && cornerFace2 == faces[(1 + rotation) % 4] && cornerFace3 == Face.Down  && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
			cube.rotate("U");
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			return cube;
		}
		else {
			return F2L41(cube, cornerFace1, cornerFace2, cornerFace3, edgeFace1, edgeFace2, rotation);
		}
	}
	private static Cube F2L41(Cube cube, Face cornerFace1, Face cornerFace2, Face cornerFace3, Face edgeFace1, Face edgeFace2, int rotation) {
		if (cornerFace1 == faces[(1 + rotation) % 4] && cornerFace2 == Face.Down && cornerFace3 == faces[(2 + rotation) % 4]  && edgeFace1 == faces[(1 + rotation) % 4] && edgeFace2 == faces[(2 + rotation) % 4]) {
			cube = turn(cube, faces[(1 + rotation) % 4], 0);
			cube.rotate("U'");
			cube = turn(cube, faces[(1 + rotation) % 4], 1);
			cube = turn(cube, faces[(2 + rotation) % 4], 1);
			cube = turn(cube, faces[(3 + rotation) % 4], 1);
			cube.rotate("U2");
			cube = turn(cube, faces[(3 + rotation) % 4], 0);
			cube = turn(cube, faces[(2 + rotation) % 4], 0);
		}
		return cube;
	}
	public static Cube solve(Cube cube) {
		System.out.println("RED GREEN WHITE LAYERS\n");
		cube = F2l0(cube, Colour.Red, Colour.Green, 0);
		System.out.println("BLUE RED WHITE LAYERS\n");
		cube = F2l0(cube, Colour.Blue, Colour.Red, 1);
		System.out.println("ORANGE BLUE WHITE LAYERS\n");
		cube = F2l0(cube, Colour.Orange, Colour.Blue, 2);
		System.out.println("GREEN ORANGE WHITE LAYERS\n");
		cube = F2l0(cube, Colour.Green, Colour.Orange, 3);
		return cube;
	}
}