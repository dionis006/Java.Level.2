import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> animalNames = doNames();
        uniqueNames(animalNames);
        doCountNames(animalNames);
        doCountNames2(animalNames);


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nikolay", "89267113308");
        phoneBook.add("Nikolay", "89267113300");
        System.out.println(phoneBook.get("Nikolay"));
        System.out.println(phoneBook.get("Nik"));

    }

    static List<String> doNames() {
        String[] array = {"Cat", "Dog", "Puppy", "Cat", "Cat", "Dog", "Fox", "Mouse", "Rat", "Rabbit", "Fox", "Chicken", "Horse", "Dog", "Fox", "Fox", "Mouse", "Cat", "Horse", "Rat"};
        List<String> names = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            names.add(array[i]);
        }
        System.out.printf("All names: %s; total: %s%n", names, names.size());
        return names;
    }

    static void uniqueNames(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.printf("Unique names: %s; total: %s\n", uniqueNames, uniqueNames.size());
    }

    static void doCountNames(List<String> animals) {
        List<String> names = new ArrayList(animals);
        List<String> newNames = new ArrayList();
        while (0 < names.size()) {
            String name = names.get(0);
            int count = 0;
            for (int i = 0; i < names.size(); i++) {
                if (name.equals(names.get(i))) {
                    count++;
                    names.remove(i);
                    i--;
                }
            }
            newNames.add(name + ": " + count);
        }
        System.out.printf("1. Counting names: %s%n", newNames);
    }

    static void doCountNames2(List<String> names) {
        Map<String, Integer> newNames = new HashMap<>();
        for (String name : names) {
            if (!newNames.containsKey(name)) {
                newNames.put(name, 1);
            } else {
                newNames.put(name, newNames.get(name) + 1);
            }
        }
        System.out.printf("2. Counting names: %s%n", newNames);
    }

}
