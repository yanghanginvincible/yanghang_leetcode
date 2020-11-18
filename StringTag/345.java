class Solution {
    public String reverseVowels(String s) {
        char[] ss = s.toCharArray();
        int j=ss.length-1;
        int i=0;
        List li = Arrays.asList('a','o','e','u','i','A','E','I','O','U');
        while(i<j){
            if(li.contains(ss[i])&&li.contains(ss[j])){
                char temp=ss[i];
                ss[i]=ss[j];
                ss[j]=temp;
                i++;
                j--;
            }
            if(!li.contains(ss[i])){
                i++;
            }
            if(!li.contains(ss[j])){
                j--;
            }

        }
        return String.valueOf(ss);
    }
}