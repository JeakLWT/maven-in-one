package webmvc.combination;

public abstract  class Duck {
    FlyBehavors flyBehavors;
    QuackBehavors quackBehavors;

    public Duck() {

    }

    public FlyBehavors getFlyBehavors() {
        return flyBehavors;
    }

    public void setFlyBehavors(FlyBehavors flyBehavors) {
        this.flyBehavors = flyBehavors;
    }

    public QuackBehavors getQuackBehavors() {
        return quackBehavors;
    }

    public void setQuackBehavors(QuackBehavors quackBehavors) {
        this.quackBehavors = quackBehavors;
    }

    public void duckFly(){
        flyBehavors.fly();
    }

    public void dackQuack(){
        quackBehavors.quack();
    }

    public abstract void display();
}
