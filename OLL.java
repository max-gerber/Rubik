public class OLL {
	private static Cube OLL1(Cube cube) {
		int front = 0;
		int left = 0;
		int back = 0;
		int right = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (cube.cubiePosition[i][j][0].isEdge()) {
					for (int k = 0; k < 2; k++) {
						if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Up) {
							// return /*OLL5*/(cube);
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Front) {
							front++;
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Left) {
							left++;
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Back) {
							back++;
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Right) {
							right++;
						}
					}
				}
				else if (cube.cubiePosition[i][j][0].isCorner()) {
					for (int k = 0; k < 3; k++) {
						if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Up) {
							// return /*OLL3*/(cube);
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Front) {
							front++;
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Left) {
							left++;
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Back) {
							back++;
						}
						else if (cube.cubiePosition[i][j][0].getStickers()[k].getColour() == Colour.Yellow && cube.cubiePosition[i][j][0].getStickers()[k].getFace() == Face.Right) {
							right++;
						}
					}
				}
			}
		}
		System.out.println("Front = " + front);
		System.out.println("Left = " + left);
		System.out.println("Back = " + back);
		System.out.println("Right = " + right);
		return cube;
	}
	public static Cube solve(Cube cube) {
		cube = OLL1(cube);
		return cube;
	}
}