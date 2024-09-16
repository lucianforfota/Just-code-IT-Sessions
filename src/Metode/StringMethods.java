public class StringMethods {
    public static void main(String[] args) {
        String s = "    dfsgdsgfd    ";
        s = s.strip().toUpperCase();
        int length = s.length();
        System.out.println(s);
        System.out.println(length);
    }
}
