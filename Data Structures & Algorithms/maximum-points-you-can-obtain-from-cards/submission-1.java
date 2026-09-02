class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int curr = 0;
        for(int i = 0; i < k; i++) curr+=cardPoints[i];
        int score = curr;
        for(int i = 1; i <=k; i++){
            curr = curr-cardPoints[k-i]+cardPoints[n-i];
            score=Math.max(score,curr);
        }
        return score;
    }
}