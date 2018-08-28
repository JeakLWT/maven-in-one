package webmvc.combination;

public class FirstDuck extends Duck {

    public FirstDuck() {
       flyBehavors=new FlyWithWing();
        quackBehavors=new QuackZhiZhi();
    }

    @Override
    public void display() {
        System.out.println("我是FristDuck");
    }

}
