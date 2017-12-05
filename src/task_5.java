import java.util.Scanner;

public class task_5 {
    public static void counterRec(int x) {
        if (x > 0) {
            counterRec(x - 1);
            System.out.println(x + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
        counterRec(x);

    }
}