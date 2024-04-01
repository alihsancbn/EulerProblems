
package euler;
//Author: Ali Ihsan Coban
public class Euler6 {
    public static double sumSquaresquareSum(){
    double sum1,sum2;                                   //sum1 is for calculating the sum of squares while sum2 is for calculating the square of the sum.
    sum1 = sum2 = 0;
    
        for (int i = 1; i <= 100; i++) {                
            sum1+=Math.pow(i, 2);                       //adds every number's square to sum1 and adds the same numbers directly to sum2.
            sum2+=i;
        }
        sum2 = Math.pow(sum2, 2);                       //calculates the square of the sum after all numbers was added. 
        return Math.abs(sum2 - sum1);                   //returns the difference between sum1 and sum2.
    }
    
    public static void main(String[] args) {
        double ans = sumSquaresquareSum();
        System.out.println((int)ans);
    }
    
}
