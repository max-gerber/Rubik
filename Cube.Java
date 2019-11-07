import java.util.Arrays;

public class Cube {

    private Cubie[][][] cubiePosition = new Cubie[3][3][3];

	public Cube() {
        //  Front face
		    //  Top row
		cubiePosition[0][0][0] = new Cubie(0,0,0, new Colour[]{ new Colour('Y','U') , new Colour('R','L'), new Colour('G','F')}, true, false);
		cubiePosition[1][0][0] = new Cubie(1,0,0, new Colour[]{ new Colour('Y','U') , new Colour('G','F')}, false, true);
		cubiePosition[2][0][0] = new Cubie(2,0,0, new Colour[]{ new Colour('Y','U') , new Colour('G','F'), new Colour('O','R')}, true, false);

            //  Middle row
		cubiePosition[0][0][1] = new Cubie(0,0,1, new Colour[]{ new Colour('R','L'), new Colour('G','F')}, false, true);
		cubiePosition[1][0][1] = new Cubie(1,0,1, new Colour[]{ new Colour('G','F')}, false, false);
		cubiePosition[2][0][1] = new Cubie(2,0,1, new Colour[]{ new Colour('G','F'), new Colour('O','R')}, false, true);

            //Bottom row
		cubiePosition[0][0][2] = new Cubie(0,0,2, new Colour[]{ new Colour('W','D') , new Colour('R','L'), new Colour('G','F')}, true, false);
		cubiePosition[1][0][2] = new Cubie(1,0,2, new Colour[]{ new Colour('W','D') , new Colour('G','F')}, false, true);
		cubiePosition[2][0][2] = new Cubie(2,0,2, new Colour[]{ new Colour('W','D') , new Colour('G','F'), new Colour('O','R')}, true, false);

        //  Center slice
            //  Top row
		cubiePosition[0][1][0] = new Cubie(0,1,0, new Colour[]{ new Colour('R','L'), new Colour('Y','U')}, false, true);
		cubiePosition[1][1][0] = new Cubie(1,1,0, new Colour[]{ new Colour('Y','U')}, false, false);
		cubiePosition[2][1][0] = new Cubie(2,1,0, new Colour[]{ new Colour('Y','U'), new Colour('O','R')}, false, true);

            //  Middle row
		cubiePosition[0][1][1] = new Cubie(0,1,1, new Colour[]{ new Colour('R','L')}, false, false);
		cubiePosition[1][1][1] = new Cubie(1,1,1, new Colour[]{ new Colour('0','0')}, false, false); //Center cubie, is initialised to 0 to prevent error
		cubiePosition[2][1][1] = new Cubie(2,1,1, new Colour[]{ new Colour('O','R')}, false, false);

            // Bottom row
		cubiePosition[0][1][2] = new Cubie(0,1,2, new Colour[]{ new Colour('R','L'), new Colour('W','D')}, false, true);
		cubiePosition[1][1][2] = new Cubie(1,1,2, new Colour[]{ new Colour('W','D')}, false, false);
		cubiePosition[2][1][2] = new Cubie(2,1,2, new Colour[]{ new Colour('W','D'), new Colour('O','R')}, false, true);

        //  Back face
		    //  Top row
        cubiePosition[0][2][0] = new Cubie(0,2,0, new Colour[]{ new Colour('Y','U') , new Colour('R','L'), new Colour('B','B')}, true, false);
		cubiePosition[1][2][0] = new Cubie(1,2,0, new Colour[]{ new Colour('Y','U') , new Colour('B','B')}, false, true);
		cubiePosition[2][2][0] = new Cubie(2,2,0, new Colour[]{ new Colour('Y','U') , new Colour('B','B'), new Colour('O','R')}, true, false);

		    //  Middle row
		cubiePosition[0][2][1] = new Cubie(0,2,1, new Colour[]{ new Colour('R','L'), new Colour('B','B')}, false, true);
		cubiePosition[1][2][1] = new Cubie(1,2,1, new Colour[]{ new Colour('B','B')}, false, false);
		cubiePosition[2][2][1] = new Cubie(2,2,1, new Colour[]{ new Colour('B','B'), new Colour('O','R')}, false, true);

		    //  Bottom row
		cubiePosition[0][2][2] = new Cubie(0,2,2, new Colour[]{ new Colour('W','D') , new Colour('R','L'), new Colour('B','B')}, true, false);
		cubiePosition[1][2][2] = new Cubie(1,2,2, new Colour[]{ new Colour('W','D') , new Colour('B','B')}, false, true);
		cubiePosition[2][2][2] = new Cubie(2,2,2, new Colour[]{ new Colour('W','D') , new Colour('B','B'), new Colour('O','R')}, true, false);
	}
}