import java.util.Scanner;

public class AreaCalculator {

    static float calculateArea(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    static float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        float circleArea = calculateArea(radius);
        float rectangleArea = calculateArea(length, breadth);
        double triangleArea = calculateArea(base, height);

        System.out.printf("%.2f\n", circleArea);
        System.out.printf("%.2f\n", rectangleArea);
        System.out.printf("%.2f\n", triangleArea);

        sc.close();
    }
}
