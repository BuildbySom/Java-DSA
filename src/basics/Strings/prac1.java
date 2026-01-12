package basics.Strings;

public class prac1 {
    public static void main(String[] args) {
        String str = "Hello World";

        int v= 0;
        int c = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}
