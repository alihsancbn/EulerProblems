
package euler;
    //Author: Ali Ihsan Coban

public class Euler2 {
    public static int Fibonacci(int num1, int num2, int sum){
        int num3 = num1 + num2;                     //defines "num3" variable according to Fibonacci sequence rule
        
        if (num3 <= 4000000) {                      //checking if the number doesn't exceed 4000000
            if (num3 % 2 == 0) {
                sum+=num3;                          //if num3 is even, adds num3 to sum
            }
            
            return Fibonacci(num2, num3, sum);      //runs the function again with new parameters   
        }
        else{
            return sum;                             //if num3 exceeds 4000000, breaks the loop and returns the result
        }
        
        
    }
    
    public static void main(String[] args) {
        int ans = Fibonacci(0, 1, 0);
        System.out.println(ans);
    }
    
}
