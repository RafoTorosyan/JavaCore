package homework.bracechecker;

public class BraceChecker {
    String text;

    public BraceChecker(String text) {
        System.out.println(text);
    }

    public void check() {
        Stack stack = new Stack();
        stack.push(']');
        char a = stack.pop();
        System.out.println(a);





    }
}


