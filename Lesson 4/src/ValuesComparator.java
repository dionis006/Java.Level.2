import java.util.Comparator;
import java.util.Map;

public class ValuesComparator implements Comparator {
    final Map<String, Integer> map;

    public ValuesComparator(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (map.get(o1) < map.get(o2)) return -1;
        else if (map.get(o1) > map.get(o2)) return 1;
        else return 0;
    }
}
