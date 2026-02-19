class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();

        for (String word : words) {
            if (match(word, pattern)) res.add(word);
        }
        return res;
    }

    private boolean match(String w, String p) {
        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < w.length(); i++) {
            char c1 = w.charAt(i), c2 = p.charAt(i);

            if (m1.getOrDefault(c1, c2) != c2 ||
                m2.getOrDefault(c2, c1) != c1) return false;

            m1.put(c1, c2);
            m2.put(c2, c1);
        }
        return true;
    }
}
