public class Solution {
    public int romanToInt(String s) {
        int result=0;
     
     
     for (int i=0;i<s.length();i++){
         result+=convert(s.toCharArray()[i]);
     }
     return result;
    
        
    }
    public static int convert(char c){
        int result;
        switch (c) {
            case 'M' : result=1000;return result;
             case 'D' : result=500;return result;
             case 'C' : result=100;return result;
              case 'L' : result=50;return result;
               case 'X' : result=10;return result;
                case 'V' : result=5;return result;
                 case 'I' : result=1;return result;
        default: result=0;}
        return result;
        
    }
}
