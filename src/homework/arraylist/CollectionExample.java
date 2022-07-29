package homework.arraylist;

        import java.util.ArrayList;
        import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        System.out.println("size" + users.size());
        System.out.println(users);

        users.add(new User("minas", "minasyan", "minas@mail.ru", "minasminas"));
        users.add(new User("minas", "minasyan", "minas@mail.ru", "minasminas"));
        users.add(new User("minas", "minasyan", "minas@mail.ru", "minasminas"));
        users.add(new User("minas", "minasyan", "minas@mail.ru", "minasminas"));
        users.add(new User("minas", "minasyan", "minas@mail.ru", "minasminas"));
        users.add(new User("minas", "minasyan", "minas@mail.ru", "minasminas"));
        users.add(new User("minas", "minasyan", "minas@mail.ru", "minasminas"));
        System.out.println("size" + users.size());
        System.out.println(users);

        users.add(4, new User("Gevor", "Gevoorgyan", "gevor@gmail.com", "gevgev"));
        System.out.println("size" + users.size());
        System.out.println(users);

        users.set(2, new User("Anna","Mxitaryan","anna@yandex.ru","annaanna"));
        System.out.println("size" + users.size());
        System.out.println(users);

        boolean contains = users.contains(new User("Anna", "Mxitaryan", "anna@yandex.ru", "annaanna"));
        System.out.println(contains);

        users.remove(new User("Gevor", "Gevoorgyan", "gevor@gmail.com", "gevgev"));
        System.out.println("size" + users.size());
        System.out.println(users);

        User user = users.get(3);
        System.out.println(user);


    }
}
