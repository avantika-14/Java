//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int a = 4;
    static int b;
    static{
        System.out.println("Inside static block");
        b = a * 5;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(Main.a+" "+Main.b);
        Main.b += 3;
        System.out.println(Main.a+" "+Main.b);
    }
}