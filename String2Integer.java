public class Solution {
    public int atoi(String str) {
        if (str==null || str.length()==0) return 0;
        char arr[] = str.toCharArray();
        int i=0;
        boolean space = false;
        boolean num=false;
        boolean neg = false;
        while (arr[i]==' ' || arr[i]=='+') i++;
        if (arr[i]=='-') {
        neg =true;
        i++;
        }
        long sum = 0;
        for (;i<arr.length;i++){
            if(arr[i]==' '){
                space = true;
            }
            else if (space == true){
                break;
                
            }
            else if (arr[i]>='0' && arr[i]<='9'){
                num=true;
                sum = sum*10+(arr[i]-'0');
                
            }
            else{
                break;
            }
            
                
        }
        if (sum>Integer.MAX_VALUE)
        sum=Integer.MAX_VALUE;
        if (sum<Integer.MIN_VALUE)
        sum=Integer.MAX_VALUE;
       int result = (int) sum;
        return neg?-result:result;
    }
}
