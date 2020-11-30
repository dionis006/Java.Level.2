public interface Actions {

    void run();

    void jump();

    void run(Treadmill treadmill);

    void jump(Wall wall);

    boolean doAction(Obstacles obstacle);

}
