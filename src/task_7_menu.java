import java.util.Scanner;

public class task_7_menu {
    static Scanner sc = new Scanner(System.in);
    static int a, b;


    static void task_1() {
        System.out.println("Enter x :");
        a = sc.nextInt();
        task_1.couter(a);
    }

    static void task_2() {
        System.out.println("Enter x :");
        a = sc.nextInt();
        System.out.println("Enter y :");
        b = sc.nextInt();
        task_2.drawRectengle(a, b);
    }

    static void task_3() {
        System.out.println("Enter x :");
        a = sc.nextInt();
        task_2.drawRectengle(a);
    }

    static void task_4() {
        System.out.println("Enter a :");
        a = sc.nextInt();
        System.out.println("Enter b :");
        b = sc.nextInt();
        task_4.getMax(a, b);
    }

    static void task_5() {
        System.out.println("Enter x :");
        a = sc.nextInt();
        task_5.counterRec(a);
    }

    static void task_6() {
        System.out.println("Enter x :");
        a = sc.nextInt();
        System.out.println("Enter y :");
        b = sc.nextInt();
        task_6.drawRectangle(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select an assignment :");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                task_1();
                break;
            case 2:
                task_2();
                break;
            case 3:
                task_3();
                break;
            case 4:
                task_4();
                break;
            case 5:
                task_5();
                break;
            case 6:
                task_6();
                break;
            default: {
                System.out.println("Enter number 1 - 6 !!!");
            }
        }
    }
}
