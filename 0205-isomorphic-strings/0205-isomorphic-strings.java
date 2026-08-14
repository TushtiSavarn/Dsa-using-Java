class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Character> countS = new HashMap<>();
        HashMap<Character, Character> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(countS.containsKey(a)&&countS.get(a)!=b)
                return false;
            if(countT.containsKey(b)&&countT.get(b)!=a)
                return false;
            countS.put(a,b);
            countT.put(b,a);
        } 
        return true;
    }
}