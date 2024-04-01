
package euler;
//Author: Ali Ihsan Coban

public class Euler7 {
    
    public static int findPrime(){
        int primeCount = 0;                     //this is for keeping the count of prime numbers we've found.
        int num = 2;                            //this is the current number we check.
        while(primeCount < 10001){
            int count = 0;                      //this is the count of factors.
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;                    //increases the count as the current number is divisible.
                }
            }
            if (count == 2) {
                primeCount++;                   //increases the count if the current number has only 2 factor which are 1 and the number itself.
            }
            num++;                              //switches to the next number.
        }
        return num-1;                           //when we reach to the 10001st prime number, the loop ends, then returns the number below,so the last wrong increment is neutralized.  
    
    }
    
    public static void main(String[] args) {
        int ans = findPrime();
        System.out.println(ans);
    }
    
}
