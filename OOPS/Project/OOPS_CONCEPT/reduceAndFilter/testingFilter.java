package reduceAndFilter;

import java.util.List;
import java.util.function.Consumer;

public class testingFilter {
    static void main(String[] args) {
        List<String> fruits = List.of("apple" , "banana" , "orange" , "cherry" ,"date");
        System.out.println(fruits.size());
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {                    // METHOD 1
                System.out.println(fruit);
            }
        });
        System.out.println("using lambda");

        fruits.stream().forEach(fruit-> System.out.println(fruit));    //METHOD 2

        // more .....
        // filterationnnnnn
        System.out.println("after applying filter");
        fruits.stream().filter(fruit->fruit.endsWith("e")).forEach(fruit-> System.out.println(fruit));

        //here .filter is retuning a stream of fruits .....  but .forEach doesn't have any return type .....
    }
}
