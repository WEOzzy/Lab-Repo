package Chapter4.Challenges.Fibonacci;

public class Fibonacci {
    /**
     * return the nth number of fibonacci sequence
     * the sequence is: the nth number is the sum of n-1 and n-2
     * n0 = 0
     * n1 = 1
     * so.. the sequence is:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){
        int fibSeq = n;

        if (n <= 1){
            return n;
        }else{
            int n0 = 0;
            int n1 = 1;
            n = n0 + n1;
            int nTemp;
            for (int i = 3; i <= fibSeq; i++){
                nTemp = n;
                n = n + n1;
                n1 = nTemp;
            }
            return n;
        }
    }
}
