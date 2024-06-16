import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Object> list = new ArrayList<Object>();
            list.add("maria");
            list.add("john");
            List<? super Number> teste22 = list;
            teste22.add(2);
            Object receiver = teste22.get(2);
            System.out.println(receiver);

            List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
            List<Integer> integer = new ArrayList<Integer>();
            integer.add(1);
            integer.add(4);
            List<? extends Number> number = integer;
            System.out.println(number.get(0));
            System.out.println("Hello world!4");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}