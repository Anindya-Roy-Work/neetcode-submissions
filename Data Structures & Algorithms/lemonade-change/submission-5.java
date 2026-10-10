class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0;
        for(int b : bills){
            if(b == 5){
                count5++;
            }
            else if(b == 10){
                count10++;
                if(count5 > 0) count5--;
                else return false;
            }
            else{
                int ret = 15;
                if(count10 > 0){
                    count10--;
                    ret = 5;
                }
                if(ret == 5){
                    if(count5 > 0){
                        count5--;
                    }else{
                        return false;
                    }
                }
                else{
                    if(count5 >=3) count5-=3;
                    else return false;
                }
            }
        }
        return true;
    }
}