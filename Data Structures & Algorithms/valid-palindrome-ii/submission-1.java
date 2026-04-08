class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1,deletion=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                String leftSubString=s.substring(i,j);
                String rightSubString=s.substring(i+1,j+1);
                return isStrictPalindrome(leftSubString)|| isStrictPalindrome(rightSubString);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isStrictPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}