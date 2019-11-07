import java.util.Arrays;

public class Cube {

    private Cubie[][][] cubiePosition = new Cubie[3][3][3];

	public Cube() {
        //  Front face
		    //  Top row
		cubiePosition[0][0][0] = new Cubie(0,0,0, new Colour[]{ new Colour(Color.Yellow,Face.Up) , new Colour(Color.Red,Face.Left), new Colour('G','F')}, true, false);
		cubiePosition[1][0][0] = new Cubie(1,0,0, new Colour[]{ new Colour(Color.Yellow,Face.Up) , new Colour('G','F')}, false, true);
		cubiePosition[2][0][0] = new Cubie(2,0,0, new Colour[]{ new Colour(Color.Yellow,Face.Up) , new Colour('G','F'), new Colour('O',Color.Red)}, true, false);

            //  Middle row
		cubiePosition[0][0][1] = new Cubie(0,0,1, new Colour[]{ new Colour(Color.Red,Face.Left), new Colour('G','F')}, false, true);
		cubiePosition[1][0][1] = new Cubie(1,0,1, new Colour[]{ new Colour('G','F')}, false, false);
		cubiePosition[2][0][1] = new Cubie(2,0,1, new Colour[]{ new Colour('G','F'), new Colour('O',Color.Red)}, false, true);

            //Bottom row
		cubiePosition[0][0][2] = new Cubie(0,0,2, new Colour[]{ new Colour('W','D') , new Colour(Color.Red,Face.Left), new Colour('G','F')}, true, false);
		cubiePosition[1][0][2] = new Cubie(1,0,2, new Colour[]{ new Colour('W','D') , new Colour('G','F')}, false, true);
		cubiePosition[2][0][2] = new Cubie(2,0,2, new Colour[]{ new Colour('W','D') , new Colour('G','F'), new Colour('O',Color.Red)}, true, false);

        //  Center slice
            //  Top row
		cubiePosition[0][1][0] = new Cubie(0,1,0, new Colour[]{ new Colour(Color.Red,Face.Left), new Colour(Color.Yellow,Face.Up)}, false, true);
		cubiePosition[1][1][0] = new Cubie(1,1,0, new Colour[]{ new Colour(Color.Yellow,Face.Up)}, false, false);
		cubiePosition[2][1][0] = new Cubie(2,1,0, new Colour[]{ new Colour(Color.Yellow,Face.Up), new Colour('O',Color.Red)}, false, true);

            //  Middle row
		cubiePosition[0][1][1] = new Cubie(0,1,1, new Colour[]{ new Colour(Color.Red,Face.Left)}, false, false);
		cubiePosition[1][1][1] = new Cubie(1,1,1, new Colour[]{ new Colour('0','0')}, false, false); //Center cubie, is initialised to 0 to prevent error
		cubiePosition[2][1][1] = new Cubie(2,1,1, new Colour[]{ new Colour('O',Color.Red)}, false, false);

            // Bottom row
		cubiePosition[0][1][2] = new Cubie(0,1,2, new Colour[]{ new Colour(Color.Red,Face.Left), new Colour('W','D')}, false, true);
		cubiePosition[1][1][2] = new Cubie(1,1,2, new Colour[]{ new Colour('W','D')}, false, false);
		cubiePosition[2][1][2] = new Cubie(2,1,2, new Colour[]{ new Colour('W','D'), new Colour('O',Color.Red)}, false, true);

        //  Back face
		    //  Top row
        cubiePosition[0][2][0] = new Cubie(0,2,0, new Colour[]{ new Colour(Color.Yellow,Face.Up) , new Colour(Color.Red,Face.Left), new Colour('B','B')}, true, false);
		cubiePosition[1][2][0] = new Cubie(1,2,0, new Colour[]{ new Colour(Color.Yellow,Face.Up) , new Colour('B','B')}, false, true);
		cubiePosition[2][2][0] = new Cubie(2,2,0, new Colour[]{ new Colour(Color.Yellow,Face.Up) , new Colour('B','B'), new Colour('O',Color.Red)}, true, false);

		    //  Middle row
		cubiePosition[0][2][1] = new Cubie(0,2,1, new Colour[]{ new Colour(Color.Red,Face.Left), new Colour('B','B')}, false, true);
		cubiePosition[1][2][1] = new Cubie(1,2,1, new Colour[]{ new Colour('B','B')}, false, false);
		cubiePosition[2][2][1] = new Cubie(2,2,1, new Colour[]{ new Colour('B','B'), new Colour('O',Color.Red)}, false, true);

		    //  Bottom row
		cubiePosition[0][2][2] = new Cubie(0,2,2, new Colour[]{ new Colour('W','D') , new Colour(Color.Red,Face.Left), new Colour('B','B')}, true, false);
		cubiePosition[1][2][2] = new Cubie(1,2,2, new Colour[]{ new Colour('W','D') , new Colour('B','B')}, false, true);
		cubiePosition[2][2][2] = new Cubie(2,2,2, new Colour[]{ new Colour('W','D') , new Colour('B','B'), new Colour('O',Color.Red)}, true, false);
	}
}