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
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

}
