/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return myGuess(1,n);
    }
    
    private int myGuess(int low, int high) {
        if(low == high) return low; 
        int mid = low+(high-low)/2;
        int guess = guess(mid);
        if(guess == 0) {
            return mid;
        } else if(guess<0) {
            return myGuess(low,mid-1);
        }
        return myGuess(mid+1,high);
    }
}
