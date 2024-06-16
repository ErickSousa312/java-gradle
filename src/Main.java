import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Object>();
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list = list2;
        System.out.println(list);

        System.out.println("Hello world!4");
    }
}