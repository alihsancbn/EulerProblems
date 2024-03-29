/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;
    

public class Euler2 {
    public static int Fibonacci(int num1, int num2, int sum){
        int num3 = num1 + num2;
        
        if (num3 <= 4000000) {
            if (num3 % 2 == 0) {
                sum+=num3;
            }
            
            return Fibonacci(num2, num3, sum);
        }
        else{
            return sum;
        }
        
        
    }
    
    public static void main(String[] args) {
        int ans = Fibonacci(0, 1, 0);
        System.out.println(ans);
    }
    
}
