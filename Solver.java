public class Solver {
    public static void main(String[] args) {
        Cube cube = new Cube();
        System.out.println("SCRAMBLE\n--------\n");
        cube.rotate("R");
        cube.rotate("F'");
        cube.rotate("R");
        cube.rotate("U'");
        cube.rotate("L'");
        cube.rotate("B2");
        cube.rotate("F");
        System.out.println("SOLUTION\n--------\n");
        cube = WhiteCross.solve(cube);
    }
    
}