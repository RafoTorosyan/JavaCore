package homework.bracechecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {


        String text = "Hello (from) {Java]";


         BraceChecker braceChecker = new BraceChecker("Hello (from){Java]");


         braceChecker.check();
        System.out.println("Error: opend { closed ]");



    }
}
