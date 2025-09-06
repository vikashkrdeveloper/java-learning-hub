package codes;

public class FirstProgram {
    public static void main(String[] args) {
        String[] loadNamesList = {"Jai Shri Krishna जय श्री कृष्ण \uD83E\uDD9A\uD83E\uDDFF", "Jai Shri Ram जय श्री राम \uD83D\uDE4F\uD83C\uDFFB", "Jai Hanuman जय हनुमान \uD83D\uDC51", "Jai Mata Di जय माता दी \uD83D\uDE4F\uD83C\uDFFB", "Jai Bhole Nath जय भोलेनाथ \uD83D\uDC7A", "Jai Ganesha जय गणेश \uD83D\uDC30", "Jai Surya देवो भव"};

        for (String name : loadNamesList) {
            System.out.println(name);
        }
    }
}