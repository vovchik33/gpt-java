package basics.task_02;

public class SplitString {
    public static void main(String[] args) {
        String sentence = "Hello, World! Welcome to Java programming.";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}