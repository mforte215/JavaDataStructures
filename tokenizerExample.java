
public class tokenizerExample {
    public static void main(String[] args) {
        String example = "This is a string with white space at the end    ";
        System.out.println("---------------------");
        System.out.println(example);
        String trimmed_example = example.trim();
        System.out.println("-----------------");
        System.out.println(trimmed_example);
        String[] words = trimmed_example.split(" ");
        String lastWord = words[words.length - 1];
        int LastWordLength = lastWord.length();
        System.out.println("Last word is: " + lastWord);
        System.out.println("The length of the last word is: " + LastWordLength);

    }
}
