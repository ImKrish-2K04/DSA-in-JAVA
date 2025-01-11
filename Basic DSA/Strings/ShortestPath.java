public class ShortestPath {
    public static int findShortestPath(String str) {
        int path, len = str.length(), x1 = 0, y1 = 0, x2 = 0, y2 = 0;

        for (int i = 0; i < len; i++) {
            char dir = Character.toLowerCase(str.charAt(i));

            if (dir == 'n') {
                y2++;
            } else if (dir == 's') {
                y2--;
            } else if (dir == 'e') {
                x2++;
            } else {
                x2--;
            }
        }

        int x = (int) Math.pow((x2 - x1), 2);
        int y = (int) Math.pow((y2 - y1), 2);

        path = (int) Math.sqrt(x + y);

        return path;
    }

    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        int shortestPath = findShortestPath(directions);
        System.out.println("the shortest path is: " + shortestPath);
    }
}
