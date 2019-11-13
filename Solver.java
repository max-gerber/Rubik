public class Solver {
    private static Cube scramble(Cube cube, String mix) {
        String sequence [];
        sequence = mix.split(" ");
        for (int i = 0; i < sequence.length; i++) {
            cube.rotate(sequence[i]);
        }
        return cube;
    }
    public static void main(String[] args) {
        Cube cube = new Cube();
        // System.out.println("SCRAMBLE\n--------\n");
        cube = scramble(cube, args[0]);
        // System.out.println("SOLUTION\n--------\n");
        cube = WhiteCross.solve(cube);
        cube = WhiteCorners.solve(cube);
    }
    
}