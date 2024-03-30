
package euler;
//Author: Ali Ihsan Coban

public class Euler3 {
    public static long PrimeFactor(long num){
        long temp = num;            //"temp" is for checking state, this will not change but "num" will.
        long div = 2;               //this is the current factor.
        long divMax = 2;            //this is the greatest prime factor we've found.
    
        while(div < temp){
            if (num % div == 0) {       
                divMax = div;
                                    //if the number is divisible by the current factor, divMax becomes the current factor and the number gets divided by the factor.
                num = num/div;
            }
            div++;                  //increases the current div to keep the loop running.
            if (div > num) {
                break;              //breaks the loop if the current factor becomes greater than the remaining number.
            }
        }
            return divMax;          //returns the greatest prime factor as result.
        }
    public static void main(String[] args) {
        long ans = PrimeFactor(600851475143L);
        System.out.println(ans);
    }
    
}
