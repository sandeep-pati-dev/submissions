class Solution {
    public int scoreOfString(String s) {
        int sum = 0 ;
        for(int i = 0 ; i < s.length()-1 ; i++){
            int l = s.charAt(i) ; 
            int r = s.charAt(i+1) ; 
            sum = sum+Math.abs(r-l) ;
        }
        return sum ;
    }
}