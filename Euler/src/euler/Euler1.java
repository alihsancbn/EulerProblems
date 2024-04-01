
package euler;
//Author: Ali Ihsan Coban

public class Euler1 {

    
    public static void main(String[] args) {
        int sum = 0;                            //defines integer named "sum"
        
        for (int i = 1; i < 1000; i++) {        //checking numbers below 
            
            if (i % 3 ==0 || i % 5 ==0) {       //checking if the number is divisible by 3 or 5
                
                sum+=i;                         //if the number is divisible to 3 or 5, adds the number to the sum 
                
            }
        }
        System.out.println(sum);
    }
    
}
