package Framwork_BuildingBlocks;

public class Reverse_String_Words_order {

    public static void main(String[] args) {
        String input = "My Name is Zakir";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }

    private static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
