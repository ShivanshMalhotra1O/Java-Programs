import java.util.Scanner;

class AreaCalculator {
    void area(int a, int b) {
        int areaOfRectange = a * b;
        System.out.println("Area of rectangle is: " + areaOfRectange);
    }

    void area(int a) {
        int areaOfSquare = a * a;
        System.out.println("Area of square is: " + areaOfSquare);
    }

    void area() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double areaOfCircle = 3.14 * r * r;
        System.out.println("area of circle is: " + areaOfCircle);
        sc.close();
    }
}

class overloading_method {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parameters: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        ac.area(a, b);
        ac.area(a);
        ac.area();
        sc.close();
    }
}
