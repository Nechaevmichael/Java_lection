/**
 * program
 */
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

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

}
