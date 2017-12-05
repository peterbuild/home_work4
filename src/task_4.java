import java.util.Scanner;

public class task_4 {

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static double getMax(double a, double b) {
        return a > b ? a : b;
    }

    public static float getMax(float a, float b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Max value = " + getMax(a, b));

        System.out.println("Enter (float) a : ");
        float fa = sc.nextFloat();
        System.out.println("Enter (float) b : ");
        float fb = sc.nextFloat();
        System.out.println("Max float value = " + getMax(fa, fb));
    }
}
