import java.util.Arrays;

public class Cube {

    public Cubie[][][] cubiePosition = new Cubie[3][3][3];

	public Cube() {
        //  Front face
		    //  Top row
		cubiePosition[0][0][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up), new Sticker(Colour.Red, Face.Left), new Sticker(Colour.Green,Face.Front)}, true, false);
		cubiePosition[1][0][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up), new Sticker(Colour.Green, Face.Front)}, false, true);
		cubiePosition[2][0][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up), new Sticker(Colour.Green, Face.Front), new Sticker(Colour.Orange,Face.Right)}, true, false);

            //  Middle row
		cubiePosition[0][0][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Red, Face.Left), new Sticker(Colour.Green, Face.Front)}, false, true);
		cubiePosition[1][0][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Green, Face.Front)}, false, false);
		cubiePosition[2][0][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Green, Face.Front), new Sticker(Colour.Orange, Face.Right)}, false, true);

            //Bottom row
		cubiePosition[0][0][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down), new Sticker(Colour.Red, Face.Left), new Sticker(Colour.Green, Face.Front)}, true, false);
		cubiePosition[1][0][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down), new Sticker(Colour.Green, Face.Front)}, false, true);
		cubiePosition[2][0][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down), new Sticker(Colour.Green, Face.Front), new Sticker(Colour.Orange, Face.Right)}, true, false);

        //  Center slice
            //  Top row
		cubiePosition[0][1][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Red, Face.Left), new Sticker(Colour.Yellow, Face.Up)}, false, true);
		cubiePosition[1][1][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up)}, false, false);
		cubiePosition[2][1][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up), new Sticker(Colour.Orange, Face.Right)}, false, true);

            //  Middle row
		cubiePosition[0][1][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Red, Face.Left)}, false, false);
		cubiePosition[1][1][1] = new Cubie(new Sticker[]{ new Sticker(Colour.NULL, Face.NULL)}, false, false); //Center cubie, is initialised to 0 to prevent error
		cubiePosition[2][1][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Orange, Face.Right)}, false, false);

            // Bottom row
		cubiePosition[0][1][2] = new Cubie(new Sticker[]{ new Sticker(Colour.Red, Face.Left), new Sticker(Colour.White, Face.Down)}, false, true);
		cubiePosition[1][1][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down)}, false, false);
		cubiePosition[2][1][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down), new Sticker(Colour.Orange, Face.Right)}, false, true);

        //  Back face
		    //  Top row
        cubiePosition[0][2][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up), new Sticker(Colour.Red, Face.Left), new Sticker(Colour.Blue, Face.Back)}, true, false);
		cubiePosition[1][2][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up), new Sticker(Colour.Blue, Face.Back)}, false, true);
		cubiePosition[2][2][0] = new Cubie(new Sticker[]{ new Sticker(Colour.Yellow, Face.Up), new Sticker(Colour.Blue, Face.Back), new Sticker(Colour.Orange, Face.Right)}, true, false);

		    //  Middle row
		cubiePosition[0][2][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Red, Face.Left), new Sticker(Colour.Blue, Face.Back)}, false, true);
		cubiePosition[1][2][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Blue, Face.Back)}, false, false);
		cubiePosition[2][2][1] = new Cubie(new Sticker[]{ new Sticker(Colour.Blue, Face.Back), new Sticker(Colour.Orange, Face.Right)}, false, true);

		    //  Bottom row
		cubiePosition[0][2][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down), new Sticker(Colour.Red, Face.Left), new Sticker(Colour.Blue, Face.Back)}, true, false);
		cubiePosition[1][2][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down), new Sticker(Colour.Blue, Face.Back)}, false, true);
		cubiePosition[2][2][2] = new Cubie(new Sticker[]{ new Sticker(Colour.White, Face.Down), new Sticker(Colour.Blue, Face.Back), new Sticker(Colour.Orange, Face.Right)}, true, false);
	}
    
    public void rotate(String move) {
        Face previousFaces[];
        Face currentFaces[];
		Cubie face[][] = new Cubie[3][3];
		System.out.println(move + '\n');
        switch (move) {
			case "U":
                previousFaces = new Face[] {Face.Left, Face.Right, Face.Front, Face.Back};
                currentFaces = new Face[] {Face.Back, Face.Front, Face.Left, Face.Right};
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        face[i][j] = cubiePosition[j][2 - i][0];
                    }
				}
				face = swap(previousFaces, currentFaces, face, true);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        cubiePosition[j][2 - i][0] = face[i][j];
                    }
				}
                break;
			case "U'":
				previousFaces = new Face[] {Face.Left, Face.Right, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Front, Face.Back, Face.Right, Face.Left};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[j][2 - i][0];
					}
				}
				face = swap(previousFaces, currentFaces, face, false);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[j][2 - i][0] = face[i][j];
					}
				}
				break;
			case "U2":
				previousFaces = new Face[] {Face.Left, Face.Right, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Back, Face.Front, Face.Left, Face.Right};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[j][2 - i][0];
					}
				}
				face = swap(previousFaces, currentFaces, swap(previousFaces, currentFaces, face, true), true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[j][2 - i][0] = face[i][j];
					}
				}
				break;
			case "F":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Left, Face.Right};
				currentFaces = new Face[] {Face.Right, Face.Left, Face.Up, Face.Down};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[j][0][i];
					}
				}
				face = swap(previousFaces, currentFaces, face, true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[j][0][i] = face[i][j];
					}
				}
				break;
			case "F'":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Left, Face.Right};
				currentFaces = new Face[] {Face.Left, Face.Right, Face.Down, Face.Up};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[j][0][i];
					}
				}
				face = swap(previousFaces, currentFaces, face, false);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[j][0][i] = face[i][j];
					}
				}
				break;
			case "F2":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Left, Face.Right};
				currentFaces = new Face[] {Face.Right, Face.Left, Face.Up, Face.Down};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[j][0][i];
					}
				}
				face = swap(previousFaces, currentFaces, swap(previousFaces, currentFaces, face, true), true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[j][0][i] = face[i][j];
					}
				}
				break;
			case "R":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Back, Face.Front, Face.Up, Face.Down};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[2][j][i];
					}
				}
				face = swap(previousFaces, currentFaces, face, true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[2][j][i] = face[i][j];
					}
				}
				break;
			case "R'":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Front, Face.Back, Face.Down, Face.Up};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[2][j][i];
					}
				}
				face = swap(previousFaces, currentFaces, face, false);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[2][j][i] = face[i][j];
					}
				}
				break;
			case "R2":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Back, Face.Front, Face.Up, Face.Down};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[2][j][i];
					}
				}
				face = swap(previousFaces, currentFaces, swap(previousFaces, currentFaces, face, true), true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[2][j][i] = face[i][j];
					}
				}
				break;
			case "D":
				previousFaces = new Face[] {Face.Left, Face.Right, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Front, Face.Back, Face.Right, Face.Left};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[i][2 - j][2];
					}
				}
				face = swap(previousFaces, currentFaces, face, true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[i][2 - j][2] = face[i][j];
					}
				}
				break;
			case "D'":
				previousFaces = new Face[] {Face.Left, Face.Right, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Back, Face.Front, Face.Left, Face.Right};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[i][2 - j][2];
					}
				}
				face = swap(previousFaces, currentFaces, face, false);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[i][2 - j][2] = face[i][j];
					}
				}
				break;
			case "D2":
				previousFaces = new Face[] {Face.Left, Face.Right, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Front, Face.Back, Face.Right, Face.Left};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[i][2 - j][2];
					}
				}
				face = swap(previousFaces, currentFaces, swap(previousFaces, currentFaces, face, true), true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[i][2 - j][2] = face[i][j];
					}
				}
				break;
			case "B":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Left, Face.Right};
				currentFaces = new Face[] {Face.Left, Face.Right, Face.Down, Face.Up};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[i][2][j];
					}
				}
				face = swap(previousFaces, currentFaces, face, true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[i][2][j] = face[i][j];
					}
				}
				break;
			case "B'":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Left, Face.Right};
				currentFaces = new Face[] {Face.Right, Face.Left, Face.Up, Face.Down};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[i][2][j];
					}
				}
				face = swap(previousFaces, currentFaces, face, false);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[i][2][j] = face[i][j];
					}
				}
				break;
			case "B2":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Left, Face.Right};
				currentFaces = new Face[] {Face.Left, Face.Right, Face.Down, Face.Up};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[i][2][j];
					}
				}
				face = swap(previousFaces, currentFaces, swap(previousFaces, currentFaces, face, true), true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[i][2][j] = face[i][j];
					}
				}
				break;
			case "L":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Front, Face.Back, Face.Down, Face.Up};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[0][i][j];
					}
				}
				face = swap(previousFaces, currentFaces, face, true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[0][i][j] = face[i][j];
					}
				}
				break;
			case "L'":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Back, Face.Front, Face.Up, Face.Down};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[0][i][j];
					}
				}
				face = swap(previousFaces, currentFaces, face, false);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[0][i][j] = face[i][j];
					}
				}
				break;
			case "L2":
				previousFaces = new Face[] {Face.Up, Face.Down, Face.Front, Face.Back};
				currentFaces = new Face[] {Face.Front, Face.Back, Face.Down, Face.Up};
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						face[i][j] = cubiePosition[0][i][j];
					}
				}
				face = swap(previousFaces, currentFaces, swap(previousFaces, currentFaces, face, true), true);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						cubiePosition[0][i][j] = face[i][j];
					}
				}
				break;
            default:
                break;
        }
	}

	public Cubie[][] swap(Face previousFaces[], Face currentFaces[], Cubie oldFace[][], boolean clockwise) {
		Cubie newFace[][] = new Cubie[3][3];
		if (clockwise) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					newFace[i][j] = oldFace[2 - j][i];
				}
			}
		}
		else {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					newFace[i][j] = oldFace[j][2 - i];
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int faces = 0;
				if (oldFace[i][j].isCorner()) {
					faces = 3;
				}
				if (oldFace[i][j].isEdge()) {
					faces = 2;
				}
				for (int k = 0; k < faces; k++) {
					for (int l = 0; l < 4; l++) {
						if (newFace[i][j].getStickers()[k].getFace() == previousFaces[l]) {
							newFace[i][j].getStickers()[k].setFace(currentFaces[l]);
							break;
						}
					}
				}
			}
		}
		return newFace;
	}
}