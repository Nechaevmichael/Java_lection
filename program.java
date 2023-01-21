/**
 * program
 */
import java.util.Scanner;
 public class program {
    public static void main(String[] args) {
        var msg = "qwerty";
        System.out.println(getType(msg)); // мои комментарии будут здесь

        Integer a = 123;
        System.out.println(a ++);
        System.out.println(++ a);

        Boolean f = 123 <= 234;
        System.out.println(f);
        
        
        // побитовые сдвиги
        Integer b = 18;
        // 10010
        // a = a << 1
        System.out.println(b << 1);

        // Массивы одномерные
        int[] arr = new int[10];
        arr[3] = 13;
        System.out.println(arr[3]);

        int[] new_arr = new int[] {1, 2, 3, 5};
        System.out.println(new_arr.length);

        // Многомерные массивы
        int[] matrix[] = new int[3][5];
        for (int[] line: matrix) {
            for (int item: line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        int[][] arr1 = new int[3][5];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d ", arr1[i][j]);
            }
            System.out.println();
        }
        
        // Ввод данных

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

}
