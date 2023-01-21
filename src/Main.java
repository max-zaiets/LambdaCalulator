public class Main {
    public static void main(String[] args) {
        Operationable operationable;
        System.out.print("Sum: ");
        operationable = (x, y) -> x + y;
        System.out.println(operationable.calculate(2,2));

        System.out.print("Substraction: ");
        operationable = (x, y) -> x - y;
        System.out.println(operationable.calculate(2,2));

        System.out.print("Multiplication: ");
        operationable = (x, y) -> x * y;
        System.out.println(operationable.calculate(2,2));

        System.out.print("Division: ");
        operationable = (x, y) -> x / y;
        System.out.println(operationable.calculate(2,2));

    }
}

@FunctionalInterface
interface Operationable{
    double calculate(double x, double y);
}
