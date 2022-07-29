package homework.arraylist;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListExample  {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User("martiros", "Martirosyan", "martiros@mail.com", "martmart");
        User user2 = new User("henrik", "poxosyan", "martiros@mail.com", "martmart");
        User user3 = new User("samvel", "greyan", "martiros@mail.com", "martmart");
        User user4 = new User("artur", "kirakosyan", "martiros@mail.com", "martmart");
        User user5 = new User("babken", "torosyan", "martiros@mail.com", "martmart");
         userList.add(user1);
         userList.add(user2);
         userList.add(user3);
         userList.add(user4);
         userList.add(user5);
        System.out.println("Before Sort");
        for (User user : userList) {
            System.out.println(user);
        }
        Collections.sort(userList);
        System.out.println("After Sort");
        for (User user :userList) {
            System.out.println(user);
        }
    }
    }

