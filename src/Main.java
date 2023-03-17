public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("Задача 1");
        int expense = 0;
        int[] arr1 = generateRandomArray();
        for (int value : arr1) {
            expense += value;
        }
        System.out.println("Сумма трат за месяц составила " + expense + " рублей");

        // Задача 2
        System.out.println("Задача 2");

        int min = arr1 [0];
        int max = arr1 [0];
        for (int element : arr1) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма затрат за день " + min);
        System.out.println("Максимальная сумма затрат за день " + max);

        // Задача 3
        System.out.println("Задача 3");
        float average = expense / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average);

        // Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length - 1; i>=0; i--) {
            System.out.print(reverseFullName[i]);


        }



    }
}