public class Ex3 {

    static void printSubstring(String s, char ch) {
        int index = s.indexOf(ch);
        while (index > -1) {
            System.out.println(s.substring(index));
            index = s.indexOf(ch, index + 1);
        }
    }

    public static void main(String[] args) {
        printSubstring("miaom", 'm');

    }
}
