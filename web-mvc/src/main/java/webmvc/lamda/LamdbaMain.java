package webmvc.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdbaMain {

    public static void main(String[] args) {
        MyLambda myLambda=(x)->{
            System.out.println(x);};
        myLambda.sayLambda("hello");

        myLambda.add(1,2);

        MyLambda.get();


        Predicate predicate= (x) ->{return true;};
        System.out.println(predicate.test("1"));


        Predicate<List<String>> listPredicate=(List<String> list) -> { return list.isEmpty();};

        System.out.println("+++++++++++++++"+listPredicate.test(new ArrayList<>()));



        List<String> newList=new ArrayList<>();
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");
        newList.forEach(item->{
            System.out.println(item);
        });


        newList.forEach(item->{
            item.equals(1);
        });
        List<String> collect = newList.stream().filter(item -> "1".equals(item)).collect(Collectors.toList());

        collect.stream().forEach(item->{
            System.out.println("================="+item);
        });

    }
}
