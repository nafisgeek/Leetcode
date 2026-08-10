class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char cleft = Character.toLowerCase(s.charAt(left));
            char cright = Character.toLowerCase(s.charAt(right));

            if(cleft!=cright)   return false;
            left++;
            right--;
        }
    return true;
    }
}