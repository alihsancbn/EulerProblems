
package euler;

public class Euler4 {
    
    
    public static int Palindrome(){
        String num,numRev;
        int palMax = 0;
        int mult;
        
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100 ; j--) {
                
                mult = i*j;
                num = String.valueOf(mult);
                StringBuilder numBuild = new StringBuilder(num);
                numRev = String.valueOf(numBuild.reverse());
                
                if (numRev.equals(num)) {
                    
                    if (mult > palMax) {
                        palMax = mult;
                    }
 
                } 
                
            }
        }
        return palMax;
    }
    
    public static void main(String[] args) {
        int ans = Palindrome();
        System.out.println(ans);
        
    
}

}