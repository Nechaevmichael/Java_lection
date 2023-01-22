public class dif_construction {
    public static void main(String[] args) { // нахождение максимума
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        }
        else {
            c = b;
        }
        System.out.println(c);

        // Тернарный оператор
        int min = a < b ? a : b; // читается так - если а меньше b, то вернётся а (если нет, то вернётся b)
        System.out.println(min);

        // Оператор выбора
        String text = "Spider-man";
        switch (text) {
            case "Hello":
                System.out.println("Java!");
                break;
            case "Spider-man":
            System.out.println("Python");
        }
    }
    
}
