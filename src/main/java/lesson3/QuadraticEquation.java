package lesson3;
/*
Метод принимает в качестве аргументов коэффициенты a, b, c квадратного уравнения (a*x^+b*x+c=0).
В теле метода требуется вывести на экран значения корней этого уравнения согласно следующим правилам:
    если первый коэффициент a равен нулю, то вывести "Нет действительных решений уравнения";
    если уравнение не имеет корней, то вывести "Нет действительных решений уравнения";
    если уравнение имеет два корня, то вывести их в строку через пробел (для одного корня, достаточно одного значения).
*/
public class QuadraticEquation {
    public static void main(String[] args) {
        solveEquation(0, 4, 6);
        solveEquation(2, 4, 6);
        solveEquation(2, 4, 2);
        solveEquation(2, 5, 2);
    }

    private static void solveEquation(int a, int b, int c) {
        final int D = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (D < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (D == 0) {
            System.out.println("x = " + (double) -(b / (2 * a)));
        } else {
            double x1 = (-b - Math.sqrt(D)) / 2 * a;
            double x2 = (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
