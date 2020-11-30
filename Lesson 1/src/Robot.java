
public class Robot implements Actions {

    int maxHeight = 1;
    int maxDistance = 1000;

    public Robot(int maxHeight, int maxDistance) {
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    public Robot() {
    }

    @Override
    public void run() {
        System.out.println("Robot running...");
    }

    @Override
    public void run(Treadmill treadmill) {
        System.out.println("Robot running on a treadmill...");
    }

    @Override
    public void jump() {
        System.out.println("Robot jumping...");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println("Robot jumping over a wall...");
    }

    @Override
    public boolean doAction(Obstacles obstacle) {
        String name = obstacle.getName();
        int distance = obstacle.getDistance();
        int height = obstacle.getHeight();
        if (distance <= maxDistance && height <= maxHeight) {
            System.out.println("Robot overcame an obstacle: " + name);
            return true;
        }
        System.out.println("Robot can't overcame an obstacle: " + name);
        return false;
    }

}
