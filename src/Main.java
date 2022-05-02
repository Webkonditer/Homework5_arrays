import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        //Задание 1
        int summ = 0;
                System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            summ += i;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        //Задание 2
        System.out.println("-------------");
        int max = 100_000;
        int min = 200_000;
        for (int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        System.out.println("Минимальная сумма трат за день составила  " + min + " рублей. Максимальная сумма трат за день составила  " + max + " рублей ");

        //Задание 3
        System.out.println("-------------");
        float averageValue = summ / arr.length;
        System.out.println("Среднее значение трат за день составило  " + averageValue + " руб.");

        //Задание 4
        System.out.println("-------------");
        char simbol;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = 0; i < reverseFullName.length / 2; i++) {
            simbol = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = simbol;
        }
        System.out.println(Arrays.toString(reverseFullName));

        //Задания повышенной сложности

        //Задание 4
        //Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.
        //Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        System.out.println("-------------");
        for(int i = 1; i <= 30; i++){
            System.out.print(i + ": ");
            if(i%3 == 0 && i%5 == 0){
                System.out.println("ping pong");
            } else if (i%3 == 0) {
                System.out.println("ping");
            } else if (i%5 == 0) {
                System.out.println("pong");
            } else {
                System.out.println();
            }
        }

        //Задание 5
        //Вывести первые 10 чисел последовательности Фибоначчи.
        System.out.println("-------------");
        int a = 0;
        int b =1;
        int[] c = new int[10];

        for(int i = 0; i < 10; i++){
            if(i == 0)
                c[i] = a;
            else if(i == 1)
                c[i] = b;
            else {
                c[i] = a + b;
                a = c[i - 1];
                b = c[i];
            }
        }
        System.out.println(Arrays.toString(c));

        //Задание 5
        //Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
        System.out.println("-------------");
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                if (i % 2 != 0 && y % 2 != 0) {
                    matrix[i][y] = 1;
                } else if(i % 2 == 0 && y % 2 == 0){
                    matrix[i][y] = 1;
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание 6
        //Нам дан массив чисел: {5, 4, 3, 2, 1}
        //Необходимо привести его к виду: {1, 2, 3, 4, 5}
        //Решите задачу с использованием дополнительного массива.
        //Напечатайте массив до преобразования и после
        System.out.println("-------------");
        int[] array_1 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array_1));
        int[] array_2 = new int[array_1.length];

        for (int i = 0; i < array_1.length; i++) {
            array_2[i] = array_1[array_1.length - 1 - i];
        }
        array_1 =array_2;
        System.out.println(Arrays.toString(array_1));

        //Задание 7
        //Решите предыдущее задание, но без использования дополнительного массива.
        //Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        //Выведите результат программы в консоль тем же способом.
        System.out.println("-------------");
        int[] array_3 = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(array_3));
        int variable;

        for(int i = 0; i < array_3.length / 2; i++) {
            variable = array_3[i];
            array_3[i] = array_3[array_3.length - 1 - i];
            array_3[array_3.length - 1 - i] = variable;
        }
        System.out.println(Arrays.toString(array_3));

        //Задание 8
        //Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        //Необходимо найти два числа, сумма которых равна −2.
        //Напечатать эти числа в консоль.
        System.out.println("-------------");
        int[] array_4 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(array_4));
        int counter = 0;
        Arrays.sort(array_4);
        for (int i = 0; i < array_4.length; i++) {
            for (int y = 0; y < array_4.length; y++) {
                if(array_4[i] + array_4[y] == -2){
                    System.out.println(array_4[i] + " и " + array_4[y]);
                    counter++;
                }
                if(counter == 1)
                    break;
            }
            if(counter == 1)
                break;
        }

        //Задание 9
        //Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
        System.out.println("-------------");
        Arrays.sort(array_4);
        int[] doubles = new int[array_4.length];
        counter = 0;
        for (int i = 0; i < array_4.length; i++) {
            for (int y = 0; y < array_4.length; y++) {
                if(array_4[i] + array_4[y] == -2){
                    System.out.println(array_4[i] + " и " + array_4[y]);
                    array_4[i] = 0;
                    array_4[y] = 0;
                }
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}