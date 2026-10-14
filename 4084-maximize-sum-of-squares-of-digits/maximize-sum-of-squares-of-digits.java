
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }

        StringBuilder str = new StringBuilder();

        while (sum >= 9) {
            str.append('9');
            sum -= 9;
        }

        if (sum > 0) {
            str.append((char) (sum + '0'));
        }

        while (str.length() < num) {
            str.append('0');
        }

        return str.toString();
    }
}
