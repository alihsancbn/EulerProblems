
package euler;
//Author: Ali İhsan Çoban

public class Eulerr10 {
    
    public static long primeSum(){
        long sum = 2;                                   //This is the current summary.
        long num = 3;                                   //This is the current number.
        
        while(num < 2000000){
            int count = 0;                              //This is the count of factors.
            if (num % 2 != 0) {                         //If the current number is even, skips the current number. 
                
                for (int i = 1; i <= num; i++) {        //Checks every number below the current number if it's factor.
 
                    if (num % i == 0) {                 
                        count++;                        //Increases the count if number is a factor.
                        
                        if (count > 2) {
                            break;                      //If the currnet number's factor count is more than 2, skips to the next number.
                        }
                        
                    }
                
                    
                }
            
                if (count == 2) {
                    sum+=num;                           //If the current number has only 2 factor which are 1 and the current number itself, adds the number to sum.
                
                }
            
            }

            num++;                                      //Goes to the next number.
        }
    
    
        
        return sum;
    }
    
    public static void main(String[] args) {
        long ans = primeSum();
        System.out.println(ans);
    }
    
}
