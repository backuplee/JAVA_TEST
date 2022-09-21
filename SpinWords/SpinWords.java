package SpinWords;

public class SpinWords {
    public String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] splitSentence = sentence.split(" ");

        for (String word : splitSentence) {
            if (word.length() > 4) {
                sb.append(new StringBuilder(word).reverse().toString() + " ");
            } else {
                sb.append(word + " ");
            }
        }
        return sb.toString().trim();
    }
}