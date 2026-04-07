class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        String str="";
        if(strs.length==0){
            return str;
        }else if(strs.length==1){
            return strs[0];
        }

        while(i>=0){
            if(i>=strs[0].length()){
                break;
            }
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()){
                    i=-1;
                    break;
                }
                char chh=strs[j].charAt(i);
                if(chh!=ch){
                    i=-1;
                    break;
                }
            }
            if(i<0){
                break;
            }else{
                str+=ch;
            }
            i++;
        }
        return str;
    }
}


//str="",i=0
//ch=b,chh=b,b,b; str="b", i=1
//ch=a,chh=a,a,a; str="ba",i=2
//ch=t,chh=g, i=-1; str="ba"