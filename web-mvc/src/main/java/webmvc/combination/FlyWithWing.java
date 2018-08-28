package webmvc.combination;

public class FlyWithWing implements FlyBehavors {
    @Override
    public void fly() {
        System.out.println("有翅膀飞行");
    }
}
