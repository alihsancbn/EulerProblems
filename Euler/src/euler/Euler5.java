
package euler;
//Author: Ali Ihsan Coban

public class Euler5 {
    public static int Divisible(){
        int num = 2520;                             //this is the current number.
        boolean div = false;                        //this bool checks if the current number is divisible to the numbers below and equal to 20.
        
        
        while(!div){                                //The loop will end when the current number is divisible by the numbers below and equal to 20.
          int count = 0;                            //this will count the factors of the current number.
          
          for (int i = 1; i <= 20; i++) {
              
                if (num % i == 0) {
                    count++;                        //if the number is divisible to the current factor, increases the count.
                    
                }
                
            }
            
            if (count == 20) {                      
                div = true;                         //if count is 20, switches the bool to "true".
                num--;                              //decreases the current number to neutralize the increment at the end of the loop.
            }
            
                num++;
            
        }
        
        return num;                                 //returns the divisible number.
        
    }
    
    public static void main(String[] args) {
        
        int ans = Divisible();
        System.out.println(ans);
    }
    
}
