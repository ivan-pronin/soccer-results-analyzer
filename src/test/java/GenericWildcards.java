import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericWildcards {


    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3); ints.add(5); ints.add(10);
        double sum = sum(ints);
        sum(new ArrayList<Float>());
        add(new ArrayList<Number>());
        System.out.println("Sum of ints="+sum);
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = intList; // OK. List<? extends Integer> is a subtype of List<? extends Number>
        Map m = new HashMap<>();
    }

    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static double add(List<? super Integer> list){
        double sum = 0;
        Object object = list.get(0);
        for(Object n : list){
//            sum += n.doubleValue();
        }
        return sum;
    }
}
