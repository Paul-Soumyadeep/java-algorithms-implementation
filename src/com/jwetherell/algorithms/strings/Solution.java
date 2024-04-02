class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for (int i = 0; i < s.length; i++) {
            String a="",b="";
            char c = s.charAt(i);
            char c2=s.charAt(i+1);
            a+=c;
            b+=c2;
            if(a.equals("I")){
                if(b.equals("V")||b.equals("X"))
                {
                    sum+=-1;
                }
                else {
                    sum+=1;
                }
            }
            else if(a.equals("X")){
                if(b.equals("L")||b.equals("C"))
                {
                    sum+=-10;
                }
                else{
                    sum+=10;
                }
            }
            else if(a.equals("C")){
                if(b.equals("D")||b.equals("M")){
                    sum+=-100;
                }
                else{
                    sum+=100;
                }
            }
            else if()
        }
    }
}