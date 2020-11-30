
public class Main {
    public static void main(String[] args) {

        completingFirstTask();
        completingSecondTask();
        completingThirdTask();
        completingFourthTask();
    }

    public static void completingSecondTask() {
        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();

        Man man = new Man();
        man.jump(wall);
        man.run(treadmill);

        Cat cat = new Cat();
        cat.jump(wall);
        cat.run(treadmill);

        Robot robot = new Robot();
        robot.jump(wall);
        robot.run(treadmill);
    }

    public static void completingFirstTask() {
        Man man = new Man();
        man.jump();
        man.run();

        Cat cat = new Cat();
        cat.jump();
        cat.run();

        Robot robot = new Robot();
        robot.jump();
        robot.run();
    }

    public static void completingThirdTask() {
        Actions[] participants = {new Man(), new Cat(), new Robot()};
        Obstacles[] obstacles = {new Wall(), new Treadmill()};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                participants[i].doAction(obstacles[j]);
            }
        }
    }

    public static void completingFourthTask() {
        Actions[] participants = {new Man(2, 800), new Cat(3, 200), new Robot(0, 2000)};
        Obstacles[] obstacles = {new Wall(3), new Treadmill(5000)};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                boolean active = participants[i].doAction(obstacles[j]);
                if (!active) break;
            }
        }
    }

}
