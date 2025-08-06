package solutions_2025_08_06_Wednesday;

import java.util.*;

public class P08_Autocomplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.nextLine();
        int n = sc.nextInt();
        List<String> matchedWords = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if(word.startsWith(prefix))matchedWords.add(word);
        }
        matchedWords.sort(Comparator.naturalOrder());
        System.out.println(!matchedWords.isEmpty() ? matchedWords.getFirst() : prefix);
    }
}
