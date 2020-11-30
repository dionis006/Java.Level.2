
public class Cat implements Actions {

    int maxHeight = 3;
    int maxDistance = 300;

    public Cat(int maxHeight, int maxDistance) {
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    public Cat() {
    }

    @Override
    public void run() {
        System.out.println("Cat running...");
    }

    @Override
    public void run(Treadmill treadmill) {
        System.out.println("Cat running on a treadmill...");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping...");
    }

    @Override
    public void jump(Wall wall) {
        System.out.println("Cat jumping over a wall...");
    }

    @Override
    public boolean doAction(Obstacles obstacle) {
        String name = obstacle.getName();
        int distance = obstacle.getDistance();
        int height = obstacle.getHeight();
        if (distance <= maxDistance && height <= maxHeight) {
            System.out.println("Cat overcame an obstacle: " + name);
            return true;
        }
        System.out.println("Cat can't overcame an obstacle: " + name);
        return false;
    }

}
