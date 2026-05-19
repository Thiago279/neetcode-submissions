
class Solution {
    public boolean isPalindrome(String s) {
        // two pointers
        //compare : if equal -> move both to center
        //else return false
        //while left < right
        String transformed = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = transformed.length()-1;

        while (left < right){
            if(transformed.charAt(left) != transformed.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
