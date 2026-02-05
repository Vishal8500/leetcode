class Solution {
    public int[] plusOne(int[] digits) {
        
        int size;
        boolean nines=true;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){
                nines=false;
                break;
            }
        }
        
        if(nines){
            size=digits.length+1;
        }
        else{
            size=digits.length;
        }
        int[] res=new int[size];
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            res[i]=(digits[i]+carry)%10;
            carry=(digits[i]+carry)/10;
        }

        if(nines){
            res[0]=1;
        }
        return res;

    }
}
