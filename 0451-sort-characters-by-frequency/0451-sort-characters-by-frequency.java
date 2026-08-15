class Solution {
    public String frequencySort(String s) {

        // Count frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.merge(curr, 1, Integer::sum);
        }

        // Save unique characters
        List<Character> unique = new ArrayList<>(map.keySet());

        // Sort characters by frequency in descending order
        unique.sort((char1, char2) -> 
            Integer.compare(map.get(char2), map.get(char1))
        );

        // Build result
        StringBuilder result = new StringBuilder();

        for (char character : unique) {
            int fre = map.get(character);

            for (int count = 0; count < fre; count++) {
                result.append(character);
            }
        }

        return result.toString();
    }
}