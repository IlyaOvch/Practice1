import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> vaza = new ArrayList<String>();
        vaza.add("Арбуз");
        vaza.add("Виноград");

        for(String t : vaza) System.out.println(t);

        LinkedList<String> countries = new LinkedList<String>();
        countries.add("Норвегия");
        countries.add("Украина");
        countries.add("USA");
        countries.addFirst("Canada");
        countries.addLast("Japan");
        countries.add(1, "Italy");
        for (int i = 0; i < countries.size(); i++)
            System.out.println(countries.get(i));
        countries.remove(1);
        System.out.println("///////////////\n");


        if (countries.contains("Japan")) System.out.println("Есть такое государство");
        countries.remove(0);
        countries.remove("USA");

        for (String p : countries) {
            System.out.println(p);

        }
        LinkedList<Person> friends = new LinkedList<Person>();
        friends.add(new Person("Misha"));
        friends.add(1, new Person("Alex"));
        friends.addFirst(new Person("Belov"));
        friends.addLast(new Person("Danya"));


        for(Person p : friends) System.out.println(p);
        friends.remove(1);
        for(Person p : friends) System.out.println(p);
        Person tmp = friends.getFirst();
        System.out.println(tmp);
    }
}

