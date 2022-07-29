package homework.arraylist;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(new UserEmailComparator());
        User user1 = new User("martiros", "Martirosyan", "martiros5@mail.com", "martmart");
        User user2 = new User("martiros", "Martirosyan", "martiros2@mail.com", "martmart");
        User user3 = new User("martiros", "Martirosyan", "martiros1@mail.com", "martmart");
        User user4 = new User("martiros", "Martirosyan", "martiros3@mail.com", "martmart");
        User user5 = new User("martiros", "Martirosyan", "martiros4@mail.com", "martmart");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);

        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
