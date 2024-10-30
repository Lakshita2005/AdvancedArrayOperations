public class MainStringAlgorithms {
    public static void main(String[] args) {
        // Test KMP Pattern Matching
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        int index = StringAlgorithms.KMP(text, pattern);

        // Expected output: 6
        System.out.println("KMP Pattern Matching result for 'abcaby' in 'abxabcabcaby': " + index);

        // Test Run Length Encoding
        String input = "aaabbbcccaaa";
        String compressed = StringAlgorithms.runLengthEncoding(input);

        // Expected output: "3a3b3c3a"
        System.out.println("Run Length Encoding of 'aaabbbcccaaa': " + compressed);
    }
}
