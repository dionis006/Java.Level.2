public class Wall implements Obstacles {

    int height = 2;

    String name = "Wall";

    public Wall() {
    }

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getDistance() {
        return 0;
    }

}
