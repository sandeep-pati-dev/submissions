class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0 ; 
        for(int j = 0 ; j < s.length() ; j++){
            if (i < t.length() && s.charAt(j) == t.charAt(i)) {
                i++;
            }
        }
                return t.length() - i;

    }
}