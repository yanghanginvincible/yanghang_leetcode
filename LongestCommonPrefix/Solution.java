class Solution {
    public String longestCommonPrefix(String[] strs) {
        char a ;
        if(strs.length==0) return "";
        String firstString = strs[0];
        String ans = "";
        boolean b = true;
        for(int i = 0;i<firstString.length();i++){
            a = firstString.charAt(i);
            for(int j = 0;j<strs.length;j++){
                if(strs[j].length()<=i) return ans;
                if((strs[j].charAt(i))!=a) return ans;
            }
            ans = ans + a;
        }
        return ans;
    }
}