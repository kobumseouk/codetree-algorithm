import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        List<String> matchingWords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (word.startsWith(t)) {
                matchingWords.add(word);
            }
        }

        Collections.sort(matchingWords);

        System.out.print(matchingWords.get(k - 1));
    }
}
