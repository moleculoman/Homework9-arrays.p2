public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Задача №1");
        System.out.println("Сумма трат за месяц составила " + arr[0] + " рублей");

        System.out.println("Задача №2");
        int max = arr[0];
        int min = 100_000;
        for (int i :arr){
            if (i>= max) {
                max = i;
            } else if (i<min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей»");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей»");



        System.out.println("Задача №3");
        float average = 0F;
        if (arr.length > 0)
        {
            float sum = 0F;
            for (int j : arr) {
                sum += j;
            }
            average = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");


        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (char element : reverseFullName)
        {
            length++;
        }
        for (int i = length - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
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