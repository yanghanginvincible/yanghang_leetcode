class Solution {
    public int romanToInt(String s) {
        char s1;
        String s2;
        int i = s.length();
        int j = 0;
        int temp1 =0;
        int temp2 = 0;
        int ans = 0;
        Map<String,Integer> romanmap = new HashMap<String,Integer>();
        romanmap.put("I",1);
        romanmap.put("V",5);
        romanmap.put("X",10);
        romanmap.put("L",50);
        romanmap.put("C",100);
        romanmap.put("D",500);
        romanmap.put("M",1000);
        while(j<i){
            s1 = s.charAt(j);
            s2 = String.valueOf(s1);
            temp1 = (romanmap.get(s2)).intValue();
            if(j<i-1){
                char s3 = s.charAt(j+1);
                String s4 = String.valueOf(s3);
                temp2 = (romanmap.get(s4)).intValue();
                if(temp1<temp2) ans = ans - temp1;
                else ans = ans + temp1;
            }else{
            ans = ans + temp1;
        }
            j++;
        }
        return ans;
    }
}