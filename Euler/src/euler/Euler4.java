
package euler;
//Author: Ali Ihsan Coban

public class Euler4 {
    
    
    public static int Palindrome(){
        
        String num,numRev;                                          //"num" is the String type of the current number, numRev is reverse of num. 
        int palMax = 0;                                             //"palMax" is the greatest palindrome number we've found.
        int mult;                                                   //"mult" is the current number found by multiplying two of any 3-digit numbers.
        
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100 ; j--) {
                
                mult = i*j;                                         
                num = String.valueOf(mult);                         //multiplies every 3-digit number with each other, then converts the result to String.
                
                StringBuilder numBuild = new StringBuilder(num);    //defining a StringBuilder to reverse "mult" and assigning it to numRev.
                numRev = String.valueOf(numBuild.reverse());
                
                if (numRev.equals(num) && mult > palMax) {
                    
                     palMax = mult;                                 //if the current result is equal to its reversed and greater than current "palMax", assigns current result to "palMax"
                                                     
                } 
                
            }
        }
        return palMax;                                              //returns the maximum palindrome number after all 3-digit numbers are multiplied by each other.
    }
    
    public static void main(String[] args) {
        int ans = Palindrome();
        System.out.println(ans);
        
    
}

}