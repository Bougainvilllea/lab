import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        System.out.println(Abs(a, b, c));

    }
    public static String Abs(int a, int b, int c) {
        int D = (b * b) - (4 * a * c);
        if (D >= 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            return "x1 = " + x1 + "; " + "x2 = " + x2;
        }

        else {
                return "NET VESHESTVENNOH KORNEY";
            }
    }
}

