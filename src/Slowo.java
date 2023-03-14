import java.util.Scanner;

public class Slowo {
            public static void main(String[] args) {
                String[] words = getWords();
                String finalWord = getFinalWord(words);
                System.out.println("Nowe słowo: "+ finalWord);
            }

    private static String getFinalWord(String[] words) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int index = words[i].length()-1;
            build.append(words[i].charAt(index));
        }
        String finalWord = build.toString();
        return finalWord;
    }

    private static String[] getWords() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów");
        int wordsNumber = input.nextInt();
        input.nextLine();

        String[] words = new String[wordsNumber];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Podaj kolejny wyraz");
            words[i] = input.nextLine();
        }
        input.close();
        return words;
    }
}
