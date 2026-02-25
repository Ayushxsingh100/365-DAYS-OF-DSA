class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // 1. Map banana (Syntax fix: Character, HashMap, charAt)
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }

        // 2. Har do adjacent words ko compare karne ke liye loop
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            
            // Loop chalao dono words ke characters compare karne ke liye
            for (int j = 0; j < word1.length(); j++) {
                
                // Edge Case: Agar word1 lamba hai aur word2 khatam ho gaya (e.g., apple, app)
                if (j >= word2.length()) return false;

                if (word1.charAt(j) != word2.charAt(j)) {
                    int char1Rank = orderMap.get(word1.charAt(j));
                    int char2Rank = orderMap.get(word2.charAt(j));
                    
                    if (char1Rank > char2Rank) return false; // Galat order!
                    else break; // Sahi order mil gaya, is pair ko chodo
                }
            }
        }
        return true;
    }
}
