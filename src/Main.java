public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxSum = 99999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }

        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей.");
        int minSum = 101000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.");
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int[] i = new int[30];
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        double averageSum = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i= reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
            if(i!=0){
            }
        }



        }
    }







