class Solution {
    public int minAddToMakeValid(String s) {
        int openparen = 0;
        int closeparen = 0;

        for (char a : s.toCharArray()) {

            if (a == '(') {
                openparen++;
            }
            else if (a == ')' && openparen > 0) {
                openparen--;
            }
            else {
                closeparen++;
            }
        }

        return openparen + closeparen;
    }
}