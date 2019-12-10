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
	// All Edges Flipped Correctly
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
	// "P" Shapes
	private static Cube OLL31(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
				cube.rotate("L'");
				cube.rotate("U'");
				cube.rotate("B");
				cube.rotate("U");
				cube.rotate("L");
				cube.rotate("U'");
				cube.rotate("L'");
				cube.rotate("B'");
				cube.rotate("L");
			return cube;
		}
		return OLL32(cube);
	}
	private static Cube OLL32(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("B'");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("R'");
			return cube;
		}
		return OLL43(cube);
	}
	private static Cube OLL43(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("B'");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("B");
			return cube;
		}
		return OLL44(cube);
	}
	private static Cube OLL44(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left&&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("L");
			cube.rotate("U'");
			cube.rotate("L'");
			cube.rotate("B'");
			return cube;
		}
		return OLL36(cube);
	}
	// W Shapes
	private static Cube OLL36(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("B'");
			cube.rotate("R'");
			cube.rotate("B");
			return cube;
		}
		return OLL38(cube);
	}
	private static Cube OLL38(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("L");
			cube.rotate("U");
			cube.rotate("L'");
			cube.rotate("U");
			cube.rotate("L");
			cube.rotate("U'");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("L'");
			cube.rotate("B");
			cube.rotate("L");
			cube.rotate("B'");
			return cube;
		}
		return OLL48(cube);
	}
	// L Shapes
	private static Cube OLL48(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("F'");
			return cube;
		}
		return OLL47(cube);
	}
	private static Cube OLL47(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("L");
			cube.rotate("U");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("L");
			cube.rotate("U");
			cube.rotate("F");
			return cube;
		}
		return OLL53(cube);
	}
	private static Cube OLL53(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R'");
			cube.rotate("F'");
			cube.rotate("L");
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("F");
			cube.rotate("L");
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("F2");
			cube.rotate("R");
			return cube;
		}
		return OLL54(cube);
	}
	private static Cube OLL54(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("L");
			cube.rotate("F");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F2");
			cube.rotate("L'");
			return cube;
		}
		return OLL49(cube);
	}
	private static Cube OLL49(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("B'");
			cube.rotate("R2");
			cube.rotate("F");
			cube.rotate("R2");
			cube.rotate("B");
			cube.rotate("R2");
			cube.rotate("F'");
			cube.rotate("R");
			return cube;
		}
		return OLL50(cube);
	}
	private static Cube OLL50(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("L'");
			cube.rotate("B");
			cube.rotate("L2");
			cube.rotate("F'");
			cube.rotate("L2");
			cube.rotate("B'");
			cube.rotate("L2");
			cube.rotate("F");
			cube.rotate("L'");
			return cube;
		}
		return OLL34(cube);
	}
	// C Shapes
	private static Cube OLL34(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("B'");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("B");
			return cube;
		}
		return OLL46(cube);
	}
	private static Cube OLL46(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("U");
			cube.rotate("R");
			return cube;
		}
		return OLL33(cube);
	}
	// T Shapes	
	private static Cube OLL33(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			return cube;
		}
		return OLL45(cube);
	}
	private static Cube OLL45(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("F'");
			return cube;
		}
		return OLL55(cube);
	}
	private static Cube OLL55(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R2");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U2");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			return cube;
		}
		return OLL56(cube);
	}
	private static Cube OLL56(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("U2");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("F'");
			cube.rotate("U2");
			cube.rotate("F");
			return cube;
		}
		return OLL51(cube);
	}
	private static Cube OLL51(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("F");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("F'");
			return cube;
		}
		return OLL52(cube);
	}
	private static Cube OLL52(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("F'");
			cube.rotate("U");
			cube.rotate("F");
			cube.rotate("R");
			return cube;
		}
		return OLL5(cube);
	}
	// Square Shapes
	private static Cube OLL5(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("L'");
			cube.rotate("B2");
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("R'");
			cube.rotate("B");
			cube.rotate("L");
			return cube;
		}
		return OLL6(cube);
	}
	private static Cube OLL6(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("B2");
			cube.rotate("L'");
			cube.rotate("B'");
			cube.rotate("L");
			cube.rotate("B'");
			cube.rotate("R'");
			return cube;
		}
		return OLL39(cube);
	}
	// Big Lightning Bolt Shapes
	private static Cube OLL39(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("L");
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("L");
			cube.rotate("U");
			cube.rotate("F");
			cube.rotate("U'");
			cube.rotate("L'");
			return cube;
		}
		return OLL40(cube);
	}
	private static Cube OLL40(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("F'");
			cube.rotate("U");
			cube.rotate("R");
			return cube;
		}
		return OLL7(cube);
	}
	// Small Lightning Bolt Shapes
	private static Cube OLL7(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("L");
			cube.rotate("F");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F2");
			cube.rotate("L'");
			return cube;
		}
		return OLL8(cube);
	}
	private static Cube OLL8(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R'");
			cube.rotate("F'");
			cube.rotate("L");
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("F2");
			cube.rotate("R");
			return cube;
		}
		return OLL11(cube);
	}
	private static Cube OLL11(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("F'");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("L");
			cube.rotate("U");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("B'");
			cube.rotate("U'");
			cube.rotate("R'");
			return cube;
		}
		return OLL12(cube);
	}
	private static Cube OLL12(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("B2");
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("R2");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R'");
			return cube;
		}
		return OLL9(cube);
	}
	// Fish Shapes
	private static Cube OLL9(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("U");
			cube.rotate("R");
			return cube;
		}
		return OLL10(cube);
	}
	private static Cube OLL10(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("F");
			cube.rotate("U");
			cube.rotate("F'");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("F'");
			cube.rotate("R");
			return cube;
		}
		return OLL35(cube);
	}
	private static Cube OLL35(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R2");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R'");
			return cube;
		}
		return OLL37(cube);
	}
	private static Cube OLL37(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("B'");
			cube.rotate("R'");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("B");
			cube.rotate("U'");
			cube.rotate("B'");
			return cube;
		}
		return OLL13(cube);
	}
	// Knight Move Shapes
	private static Cube OLL13(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("F");
			cube.rotate("U");
			cube.rotate("R");
			cube.rotate("U2");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("F'");
			return cube;
		}
		return OLL14(cube);
	}
	private static Cube OLL14(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("F'");
			cube.rotate("U'");
			cube.rotate("L'");
			cube.rotate("U2");
			cube.rotate("L");
			cube.rotate("U");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("L");
			cube.rotate("F");
			return cube;
		}
		return OLL15(cube);
	}
	private static Cube OLL15(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("L'");
			cube.rotate("B'");
			cube.rotate("L");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("L'");
			cube.rotate("B");
			cube.rotate("L");
			return cube;
		}
		return OLL16(cube);
	}
	private static Cube OLL16(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("R'");
			cube.rotate("L");
			cube.rotate("U");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("R");
			cube.rotate("B'");
			cube.rotate("R'");
			return cube;
		}
		return OLL29(cube);
	}
	// Awkward Shapes
	private static Cube OLL29(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("B'");
			cube.rotate("U2");
			cube.rotate("B2");
			cube.rotate("U");
			cube.rotate("B'");
			cube.rotate("U'");
			cube.rotate("B'");
			cube.rotate("U2");
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("R'");
			return cube;
		}
		return OLL30(cube);
	}
	private static Cube OLL(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Right) {
			cube.rotate("B");
			cube.rotate("U2");
			cube.rotate("B2");
			cube.rotate("U'");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("B");
			cube.rotate("U2");
			cube.rotate("L'");
			cube.rotate("B'");
			cube.rotate("L");
			return cube;
		}
		return OLL41(cube);
	}
	private static Cube OLL41(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("R");
			cube.rotate("U'");
			cube.rotate("R'");
			cube.rotate("U2");
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("B");
			cube.rotate("U'");
			cube.rotate("B'");
			cube.rotate("U'");
			cube.rotate("R'");
			return cube;
		}
		return OLL42(cube);
	}
	private static Cube OLL42(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Front) {
			cube.rotate("L'");
			cube.rotate("U");
			cube.rotate("L");
			cube.rotate("U2");
			cube.rotate("L'");
			cube.rotate("U'");
			cube.rotate("B'");
			cube.rotate("U");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("L");
			return cube;
		}
		return OLL28(cube);
	}
	// All Corners Oriented
	private static Cube OLL28(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R2");
			cube.rotate("F2");
			cube.rotate("L");
			cube.rotate("F");
			cube.rotate("L'");
			cube.rotate("F2");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("R");
			return cube;
		}
		return OLL57(cube);
	}
	private static Cube OLL57(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R");
			cube.rotate("U");
			cube.rotate("R'");
			cube.rotate("U'");
			cube.rotate("L");
			cube.rotate("R'");
			cube.rotate("F");
			cube.rotate("R");
			cube.rotate("F'");
			cube.rotate("L'");
			return cube;
		}
		return OLL20(cube);
	}
	private static Cube OLL20(Cube cube) {
		if (yellowFace[0][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[0][1].getFaceOfColor(Colour.Yellow) == Face.Back &&
			yellowFace[0][2].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[1][0].getFaceOfColor(Colour.Yellow) == Face.Left &&
			yellowFace[1][2].getFaceOfColor(Colour.Yellow) == Face.Right &&
			yellowFace[2][0].getFaceOfColor(Colour.Yellow) == Face.Up &&
			yellowFace[2][1].getFaceOfColor(Colour.Yellow) == Face.Front &&
			yellowFace[2][2].getFaceOfColor(Colour.Yellow) == Face.Up) {
			cube.rotate("R");
			cube.rotate("B");
			cube.rotate("U");
			cube.rotate("B'");
			cube.rotate("R'");
			cube.rotate("F2");
			cube.rotate("B");
			cube.rotate("D'");
			cube.rotate("L'");
			cube.rotate("D");
			cube.rotate("B'");
			cube.rotate("F2");
			return cube;
		}
		cube.rotate("U");
		return OLL1(cube);
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