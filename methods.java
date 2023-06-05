class ClassesAndMethods {
    public static void main(String[] args) {
        MathCalculator mathCalculator = new MathCalculator();
        int sum = mathCalculator.sumOfNumbers(10, 20);
        int difference = mathCalculator.differenceBetween(10, 20);
        System.out.println("Sum of numbers is: " + sum);
        System.out.println("Difference between numbers is: " + difference);
    }
}

class MathCalculator {
    int sumOfNumbers(int a, int b) {
        return a + b;
    }

    int differenceBetween(int a, int b) {
        return a - b;
    }
}
