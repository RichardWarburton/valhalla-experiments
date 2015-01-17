
import java.util.*;
import java.time.*;

class Simple {

    public static void main(String[] args) {
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
                values.add(i);
            }
            System.out.println(values);
        }
    }

    private static <any T> String nothing(T value) {
        /*try {
            value.wait();
        } catch (Exception e) {
        }*/
        return value.toString();
        //return value;
    }

}

