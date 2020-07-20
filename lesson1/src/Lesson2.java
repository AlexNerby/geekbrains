public class Lesson2 {
    public static void main(String[] args) {
        System.out.print("task 1:   ");
        int task1[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < task1.length; i++) {
            if (task1[i] == 1) {
                task1[i] = 0;
            }else
                task1[i] = 1;
            System.out.print(task1[i] + " ");
        }
        System.out.println();

        System.out.print("task 2:   ");
        int task2[] = new int[8];
        int count = 0;
        for (int i = 0; i < task2.length; i++) {
            task2[i] = count;
            count += 3;
            System.out.print(task2[i] + " ");
        }
        System.out.println();

        System.out.print("task 3:   ");
        int task3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] < 6) {
                task3[i] *= 2;
            }
            System.out.print(task3[i] + " ");
        }
        System.out.println();

        System.out.println("task 4:   ");
        int task4[][] = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        int dia = -1;
        int dia2 = 5;
        for (int i = 0; i < task4.length; i++) {
            dia++;
            dia2--;
            System.out.print("          ");
            for (int j = 0; j < task4[i].length; j++) {
                if (j == dia || j == dia2)
                    task4[i][j] = 1;
                System.out.print(task4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
