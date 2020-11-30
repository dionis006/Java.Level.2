import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        new Chat();
        doTreeMap();

    }

    static void doTreeMap() {
        TreeMap<String, Integer> values = new TreeMap<>();
        values.put("4", 9);
        values.put("8", 5);
        values.put("7", 1);
        values.put("9", 2);
        values.put("1", 8);
        values.put("2", -8);
        values.put("0", -15);
        System.out.println(values);

        Comparator comparator = new ValuesComparator(values);
        Map<String, Integer> valuesSort = new TreeMap<>(comparator);
        valuesSort.putAll(values);
        System.out.println(valuesSort);

    }
}