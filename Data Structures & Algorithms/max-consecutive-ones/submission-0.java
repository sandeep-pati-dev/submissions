class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0 ;
        int c = 0 ;
        for(int num : nums){
            if(num == 0){
                maxCount = Math.max(c,maxCount) ;
                c = 0 ;
            }else{
                c++ ;

            }
        }
        return Math.max(maxCount , c) ;
    }
}