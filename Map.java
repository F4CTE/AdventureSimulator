import java.io.*;
import java.util.*;

public class Map {
    private char[][] map;

    public Map(String mapPath, int startX, int startY) throws IOException {

        // Open the map file
        BufferedReader reader = new BufferedReader(new FileReader(mapPath));

        // Read the lines of the map file
        String line;
        List<char[]> mapList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            mapList.add(line.toCharArray());
        }
        reader.close();

        // Convert the map into a 2D array
        map = mapList.toArray(new char[0][]);

        // Check that the starting position is not in a forest
        if (map[startY][startX] == '#') {
            throw new IllegalArgumentException("Invalid start position: The hero is starting in a forest!");
        }
    }

    /**
     * Determines whether a given position is a valid move on the game map.
     *
     * @param x The x-coordinate of the position being checked.
     * @param y The y-coordinate of the position being checked.
     * @return True if the position is valid and unobstructed, false otherwise.
     */
    public boolean canMove(int x, int y) {
        return (x >= 0 && x < map[0].length && y >= 0 && y < map.length && map[y][x] != '#');
    }
}
