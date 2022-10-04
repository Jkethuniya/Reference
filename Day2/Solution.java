#Uses less space but more time.

class Solution {
    public String intToRoman(int num) {
        String ans="";
        while(num>=1000){
            ans+="M";
            num-=1000;
        }
        if(num>=900){
            ans+="CM";
            num = num-900;
        }
        if(num>=500){
            ans+="D";
            num = num-500;
        }
        if(num>=400){
            ans+="CD";
            num = num-400;
        }
        while(num>=100){
           ans+="C";
           num = num-100;
        }
        if(num>=90){
            ans+="XC";
            num = num-90;
        }
        if(num>=50){
            ans+="L";
            num = num-50;
        }
        if(num>=40){
            ans+="XL";
            num = num-40;
        }
        while(num>=10){
            ans+="X";
            num = num-10;
        }
        if(num>=9){
            ans+="IX";
            num = num-9;
        }
        if(num>=5){
            ans+="V";
            num = num-5;            
        }
        if(num>=4){
            ans+="IV";
            num = num-4;
        }
        while(num>=1){
            ans+="I";
            num-=1;
        }
    return ans;
    }
}
