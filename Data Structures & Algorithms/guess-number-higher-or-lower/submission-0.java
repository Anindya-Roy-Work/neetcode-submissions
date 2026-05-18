/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return guessNumber(1,n);
    }

    private int guessNumber(int st, int en){
        int mid = st+(en-st)/2;
        if(guess(mid) == 0) return mid;
        if(guess(mid) == -1) return guessNumber(st,mid-1);
        return guessNumber(mid+1,en);
    }
}