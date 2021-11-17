package lesson4;

public class MySqrt {
    public static void main(String[] args) {
        mySqrt(0);
        System.out.println(Math.sqrt(0));
        mySqrt(1);
        System.out.println(Math.sqrt(1));
        mySqrt(2);
        System.out.println(Math.sqrt(2));
        mySqrt(4);
        System.out.println(Math.sqrt(4));
        mySqrt(1024);
        System.out.println(Math.sqrt(1024));
        mySqrt(8678);
        System.out.println(Math.sqrt(8678));
    }

    private static void mySqrt(int num) {
        if (num < 0) {
            System.out.println("Нет решений число " + num + " отрицательное");
        } else if (num == 0 || num == 1) {
            System.out.println("Квадратный корень числа " + num + " равен " + num);
        } else {
            double l = 0;
            double h = num;
            double r = 0;

            while (h - l > 0.000000001) {
                r = (h + l) / 2;
                double r2 = r * r;
                if (r2 > num) {
                    h = r;
                } else {
                    l = r;
                }
            }
            System.out.println("Квадратный корень числа " + num + " равен " + r);
        }
    }
}
