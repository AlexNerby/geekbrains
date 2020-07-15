public class Lesson1 {

    public static void main(String[] args) {
        System.out.println("Task 1: completed");

        String str = "Task 2:";
        byte bye = 100;
        short sht = 10000;
        int in = 1000000;
        long lng = 1000000000;
        float flt = 10.10f;
        double dbl = 10d;
        char chr = 1;
        boolean bln = false;
        System.out.println(str + " completed");

        System.out.println("Task 3: " + task3(5, 10, 15, dbl));

        System.out.println("Task 4: " + task4(3, 12));

        task5(5);

        System.out.println("Task 6: " + task6(-5));

        task7("Алексей");

        task8(2020);
    }

    static double task3 (double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    static boolean task4 (int a, int b) {
        int sum =  (a + b);
        if (sum >= 10 && sum <= 20) {
            return true;
        }else
            return false;
    }

    static void task5 (int number) {
        if (number >= 0) {
            System.out.println("Task 5: " + number + " положительное число");
        }else
            System.out.println("Task 5: " + number + " отрицательное число");
    }

    static boolean task6 (int number) {
        if (number >= 0) {
            return false;
        }else
            return true;
    }

    static void task7(String name) {
        System.out.println("Task 7: Привет " + name);
    }

    static void task8 (int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Task 8* " + year +  " год является високосным");
        }else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Task 8* " + year + " год является високосным");
        }else
            System.out.println("Task 8* " + year + " Год не является високосным");
    }
}
