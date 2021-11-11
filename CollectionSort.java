package CollectionJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<> ();
        list.add (1);
        list.add (0);
        list.add (20);
        list.add (10);
        Collections.addAll (list,100,200,300,400,500,600);
        //Collections.sort (list);
       // System.out.println (Collections.max (list));
        Collections.reverse (list);
        for (Integer num: list){
            System.out.println (num);
        }
    }
    //Java Generics
    //Generic
}
