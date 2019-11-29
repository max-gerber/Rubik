public class OLL {
	private static Cubie[][] yellowFace = new Cubie[3][3];
	//	No Edges Flipped Correctly
	private static Cube OLL1(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R2");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("U2");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			return cube;
		}
		return OLL2(cube);
	}
	private static Cube OLL2(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("F");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("L");
			cube.rotate("U'");
			cube.rotate("B'");
			return cube;
		}
		return OLL3(cube);
	}
	private static Cube OLL3(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("R");
			cube.rotate("L2");
			cube.rotate("F");
			cube.rotate("L'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("L'");
			cube.rotate("R");
			return cube;
		}
		return OLL4(cube);
	}
	private static Cube OLL4(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("F'");
			cube.rotate("B");
			cube.rotate("L'");
			cube.rotate("F");
			cube.rotate("U2");
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("B");
			cube.rotate("L'");
			cube.rotate("B2");
			cube.rotate("F");
			return cube;
		}
		return OLL17(cube);
	}
	private static Cube OLL17(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("F'");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("L'");
			cube.rotate("B");
			cube.rotate("U2");
			cube.rotate("B'");
			cube.rotate("L");
			cube.rotate("U2");
			cube.rotate("R'");
			cube.rotate("F");
			return cube;
		}
		return OLL18(cube);
	}
	private static Cube OLL18(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("B'");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U2");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			return cube;
		}
		return OLL19(cube);
	}
	private static Cube OLL19(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R'");
			cube.rotate("U2");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("F2");
			cube.rotate("U2");
			cube.rotate("F");
			cube.rotate("R");
			return cube;
		}
		return OLL27(cube);
	}
	private static Cube OLL27(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R'");
			return cube;
		}
		return OLL26(cube);
	}
	private static Cube OLL26(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("L");
			cube.rotate("U'");
			cube.rotate("L'");
			cube.rotate("U2");
			cube.rotate("L");
			return cube;
		}
		return OLL21(cube);
	}
	private static Cube OLL21(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R'");
			return cube;
		}
		return OLL22(cube);
	}
	private static Cube OLL22(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R2");
			cube.rotate("U'");
			cube.rotate("R2");
			cube.rotate("U'");
			cube.rotate("R2");
			cube.rotate("U2");
			cube.rotate("R");
			return cube;
		}
		return OLL23(cube);
	}
	private static Cube OLL23(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R2");
			cube.rotate("D'");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R'");
			cube.rotate("D");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R");
			return cube;
		}
		return OLL24(cube);
	}
	private static Cube OLL24(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("L");
			cube.rotate("F");
			cube.rotate("R'");
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			return cube;
		}
		return OLL25(cube);
	}
	private static Cube OLL25(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("L'");
			cube.rotate("B");
			cube.rotate("L");
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("B'");
			cube.rotate("L");
			cube.rotate("F");
			return cube;
		}
		return OLL31(cube);
	}
	public static Cube solve(Cube cube) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				yellowFace[i][j] = cube.cubiePosition[j][2 - i][0];
			}
		}
		cube = OLL1(cube);
		return cube;
	}
}