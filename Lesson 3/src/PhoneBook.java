import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    private Map<String, Set<String>> phoneBook;

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public Set<String> get(String name) {
        if (phoneBook.get(name) == null){
            return new HashSet<>();
        }
        return phoneBook.get(name);
    }

}
