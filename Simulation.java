import java.io.*;

public class Simulation {
    /**
     * Runs the game with the given map and moves.
     * 
     * @param args an array of command-line arguments
     */
    public static void main(String[] args) {
        // replace with the path to your map file
        String mapPath = "Map.txt";
        // replace with the path to your moves file
        String movePath = "Moves.txt";

        try {
            // read the moves file
            BufferedReader br = new BufferedReader(new FileReader(movePath));
            String[] coordinates = br.readLine().split(",");
            int startX = Integer.parseInt(coordinates[0]);
            int startY = Integer.parseInt(coordinates[1]);

            // create the map and adventurer
            Map gameMap = new Map(mapPath, startX, startY);
            Adventurer adventurer = new Adventurer(startX, startY);

            // execute each move
            for (char move : br.readLine().toCharArray()) {
                switch (move) {
                    case 'N':
                        if (gameMap.canMove(adventurer.getX(), adventurer.getY() - 1))
                            adventurer.moveNorth();
                        break;
                    case 'S':
                        if (gameMap.canMove(adventurer.getX(), adventurer.getY() + 1))
                            adventurer.moveSouth();
                        break;
                    case 'E':
                        if (gameMap.canMove(adventurer.getX() + 1, adventurer.getY()))
                            adventurer.moveEast();
                        break;
                    case 'O':
                        if (gameMap.canMove(adventurer.getX() - 1, adventurer.getY()))
                            adventurer.moveWest();
                        break;
                }
            }

            br.close();
            // print the final position
            System.out.println("Final position: (" + adventurer.getX() + "," + adventurer.getY() + ")");
        } catch (FileNotFoundException e) {
            // file not found
            e.printStackTrace();
        } catch (IOException e) {
            // IOException occurred
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // invalid argument
            System.out.println(e.getMessage());
        }
    }

}
