package IJPPractice;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
       List<String> list= new ArrayList<>();
       list.add("green");
       list.add("red");
       list.add("pink");
        System.out.println(list);
        list.set(2,"#FG0012");
        System.out.println(list);
        System.out.println(list.contains("pink"));
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println( list.indexOf("green"));
        System.out.println(list.lastIndexOf("pink"));

    }
}
