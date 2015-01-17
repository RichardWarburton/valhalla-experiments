
import java.util.*;
import java.time.*;

class Simple {

    public static void main(String[] args) throws Exception {
        //ArrayList<int> values = new ArrayList<>();
        //values.add(1);
        //values.add(2);
        //System.out.println(values);
        //LocalDate date = LocalDate.now();
        //synchronized(date) {
            //System.out.println(date);
        //}

        //int i = (Integer) null;

        //String x = Simple.<int>nothing(1);
        //System.out.println(x);

        for (int j = 0; j < 10_000; j++) {
            ArrayList<int> values = new ArrayList<int>();
            for (int i = 0;i < 1000; i++) {
                values.addd(i);
            }
            System.out.println(values);
        }

        Thread.sleep(1000);
        
        for (int j = 0; j < 10_000; j++) {
            ArrayList<int> values = new ArrayList<int>();
            for (int i = 0;i < 1000; i++) {
                values.addd(i);
            }
            System.out.println(values);
        }
    }

    static interface Consumer<any T> {
        public void accept(T arg);
    }


    // Another compiler error case:
    /*
    public static <any T> void fail(T[] values) {
        get(values).toString();
    }

    public static <any T> T get(T[] values) {
        return values[0];
    }
    */

/*
    public static <any T> T second(Iterable<T> it) {
        return it.iterator().next().next();
    }
*/

    private static <any T> String nothing(T value) {
        /*try {
            value.wait();
        } catch (Exception e) {
        }*/
        return value.toString();
        //return value;
    }

}

