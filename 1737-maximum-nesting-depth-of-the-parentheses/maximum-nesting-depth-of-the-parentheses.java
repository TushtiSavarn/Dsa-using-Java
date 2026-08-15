class Solution {
    public int maxDepth(String s) {
        int maxcount=0;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
                left++;
            if(c==')')
                right++;
            maxcount=Math.max(maxcount,left-right);
        }
        return maxcount;
    }
}