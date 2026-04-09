class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.isBlank()){
            return word2;
        }else if(word2.isBlank()){
            return word1;
        }
        
        int i=0,j=0;
        int n=word1.length();
        int m=word2.length();
        String resp="";
        while(i<n && j<m){
            resp=resp+word1.charAt(i)+word2.charAt(j);
            i++;j++;
        }

        if(i<n){
            resp=resp+word1.substring(i,n);
        }

        if(j<m){
            resp=resp+word2.substring(j,m);
        }

        return resp;
    }
}