class Solution {
    public int getSum(int a, int b) {
        int sum = 0; int carry = 0; int mask = 0xFFFFFFFF;
        for(int i = 0; i < 32; i++){
            int ab = (a>>i)&1;
            int bb = (b>>i)&1;
            int cb = ab^bb^carry;
            carry = (ab+bb+carry)>=2?1:0;
            if(cb != 0) sum |= (1<<i);
        }

        if(sum > 0x7FFFFFFF) sum = ~(sum^mask);
        return sum;
    }

}
