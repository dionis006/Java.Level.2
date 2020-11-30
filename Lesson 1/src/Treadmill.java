public class Treadmill implements Obstacles {

    int distance = 1000;

    String name = "Treadmill";

    public Treadmill() {
    }

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
