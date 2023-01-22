public class cycles {
    public static void main(String[] args) {
        
        // Цикл while
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count += 1; // или count++
        }
        System.out.println(count);

        // Цикл do while
        int count_1 = 0;
        int item = 321;
        do {
            item /= 10;
            count_1++;
        }
        while (item != 0);
        System.out.println(count_1);

        // continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // Перебор массива
        int[] arr = new int[] {1, 2, 3, 5, 77};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
