public class Test {
    public static void main(String[] args) {
        Cube testCube = new Cube();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int faces = 1;
				if (testCube.cubiePosition[i][0][j].isCorner()) {
					faces = 3;
				}
				if (testCube.cubiePosition[i][0][j].isEdge()) {
					faces = 2;
				}
				for (int k = 0; k < faces; k++) {
                    System.out.println("[" + testCube.cubiePosition[i][0][j].getStickers()[k].getColour() + "]    [" + testCube.cubiePosition[i][0][j].getStickers()[k].getFace() + "]");
				}
                System.out.println("\n");
			}
            System.out.println("\n");
		}
        System.out.println("-----------------------");
        testCube.rotate("U2");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int faces = 1;
				if (testCube.cubiePosition[i][0][j].isCorner()) {
					faces = 3;
				}
				if (testCube.cubiePosition[i][0][j].isEdge()) {
					faces = 2;
				}
				for (int k = 0; k < faces; k++) {
                    System.out.println("[" + testCube.cubiePosition[i][0][j].getStickers()[k].getColour() + "]    [" + testCube.cubiePosition[i][0][j].getStickers()[k].getFace() + "]");
				}
                System.out.println("\n");
			}
            System.out.println("\n");
		}
    }
}