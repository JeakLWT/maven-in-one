package webmvc.lamda;

@FunctionalInterface
public interface MyLambda {

    public void sayLambda(String str);

    default void add(int x, int y){
        System.out.println(x+y);
    }

    public static void get(){
        System.out.println("hello");
    }
}
