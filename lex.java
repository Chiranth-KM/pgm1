package LABpack;

public class lex {
    public static void main(String[] args) {
        String[] names = {"Rajiv", "Abhi", "Suresh", "Harish", "Kiran"};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    // Swap the names
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        for (String str : names) {
            System.out.println(str);
        }

    }
}