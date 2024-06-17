import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.silentsoft.stopwatch.Stopwatch;

public class Main {
    public static void main(String[] args) {
        try {
            Stopwatch time = new Stopwatch();
            time.start("Array object");
            List<Object> list = new ArrayList<Object>();
            list.add("maria");
            list.add("john");
            List<? super Number> teste22 = list;
            teste22.add(2);
            Object receiver = teste22.get(2);
            System.out.println(receiver);
            time.stop();
            time.start("asList");
            List<Integer> integer = new ArrayList<Integer>();
            integer.add(1);
            integer.add(4);
            List<? extends Number> number = integer;
            Number number2 = number.get(0);
            System.out.println(number2);
            time.stop();
            time.print();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}