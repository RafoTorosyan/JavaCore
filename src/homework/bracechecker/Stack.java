package homework.bracechecker;

public class Stack {
    public char[] chars = new char[16];
    public int size;


    public Stack() {
        size = -1;
    }

    public void push(char value) {
        if (size == chars.length) {
            System.out.println("stack is end");
        } else {
            chars[++size] = value;
        }
    }

    public char pop() {
        if (size < 0) {
            System.out.println("stacl is empty");
            return 0;
        } else {
            return chars[size--];
        }
    }
}
