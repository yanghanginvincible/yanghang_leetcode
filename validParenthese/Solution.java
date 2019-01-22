class Solution {
    public boolean isValid(String s) {
        boolean b = false;
        int j = s.length()/2;
        if(s.length()==0)return b=true;
        for(int i = 0;i<j;i++){
            s = s.replace("[]","");
            s = s.replace("{}","");
            s = s.replace("()","");
        }
        b=(s.length()==0)?true:false;
        return b;
    }
}