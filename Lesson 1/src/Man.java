
public class Man implements Actions {

    int maxHeight = 2;
    int maxDistance = 500;

    public Man(int maxHeight, int maxDistance) {
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    public Man() {
    }

    @Override
    public void run() {
        System.out.println("Man running...");
    }

    @Override
    public void run(Treadmill treadmill) {
        System.out.println("Man running on a treadmill...");
    }

    @Override
    public void jump() {
        System.out.println("Man jumping...");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println("Man jumping over a wall...");
    }

    @Override
    public boolean doAction(Obstacles obstacle) {
        String name = obstacle.getName();
        int distance = obstacle.getDistance();
        int height = obstacle.getHeight();
        if (distance <= maxDistance && height <= maxHeight) {
            System.out.println("Man overcame an obstacle: " + name);
            return true;
        }
        System.out.println("Man can't overcame an obstacle: " + name);
        return false;
    }

}
