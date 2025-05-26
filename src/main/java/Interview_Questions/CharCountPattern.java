package Interview_Questions;
public class CharCountPattern {
    public static void main(String[] args) {
        String str = "aaabbcde";
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char current = str.charAt(i);
            int count = 1;
            // Count Consecutive Duplicates
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(current).append(count).append(" ");
            i++;
        }
        System.out.println(result.toString().trim());
    }
}