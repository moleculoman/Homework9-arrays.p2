public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Задача №1");
        System.out.println("Сумма трат за месяц составила "+  arr[0] + " рублей");

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
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей»");
        System.out.println("Максимальная сумма трат за день составила "+max+" рублей»");









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