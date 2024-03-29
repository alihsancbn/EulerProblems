/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author alihs
 */
public class Euler3 {
    public static long PrimeFactor(long num){
        long temp = num;
        long div = 2;
        long divMax = 2;
    
        while(div < temp){
            if (num % div == 0) {
                divMax = div;
                num = num/div;
            }
            div++;
            if (div > num) {
                break;
            }
        }
            return divMax;
        }
    public static void main(String[] args) {
        long ans = PrimeFactor(600851475143L);
        System.out.println(ans);
    }
    
}
