class Solution {
    public int reverse(int x) {
        int i=1;

        int temp = x;
        int ans = 0 ;

        while((temp/10)!=0){
            i++;
            temp=temp/10;
        }
        int[] a = new int[i];
        for(int j=0;j<i;j++){
            a[i-j-1] = x%10;
            x = x/10;
        }
        for(int j=0;j<i;j++){
            if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && a[i-1]>7)) return 0;
            if(ans<Integer.MIN_VALUE/10 || (ans==Integer.MIN_VALUE/10 && a[i-1]<-8)) return 0;
            ans = ans*10 + a[i-j-1];
        }
        return ans;
        }
    
}