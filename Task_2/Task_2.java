package Task_2;

public class Task_2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("a = " + a + " b = " + b);
        swap(a, b);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }
}
