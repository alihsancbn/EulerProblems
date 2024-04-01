
package euler;

/*  Author: Ali İhsan Çoban

    a^2 + b^2 = c^2
    a + b + c = 1000           c = 1000 - a - b
    a^2 + b^2 = (1000 - a - b)^2     = 1000000 + a^2 + b^2 + 2(- 1000a - 1000b + ab)      = a^2 + 2ab - 2000a - 2000b + b^2 + 1000000,
    2000(a + b) = 2ab + 1000000
    1000(a + b) - ab = 500000
    
*/
public class Euler9 {
    public static int Pythagorean() {
      
       boolean found = false;
       int a = 0, b = 0;
       
        
        for (int i = 0; i < 500; i++) {                                     // to avoid solution by just one variable being 500, the both variables must be less than 500.
            a = i;
             
            for (int j = i+1; j < 500; j++) {     
                 
                b = j;
                
                 
                if (1000*(a+b) - a*b == 500000 ) {  
                    found = true;                                           //if current values of a and b satisfies the equality, "found" bool switches to true.          
                    break;
                }
                
            }
            if (found) {
                break;                                                      //if the values of a and b has been found, breaks the loop
            }
        }
       int c = (int)Math.sqrt((int)Math.pow(a, 2)+ (int)Math.pow(b, 2));    //equals c to a^2 + b^2.
        
        return a*b*c;                                                       //returns the product of a*b*c
        
    }
    
    public static void main(String[] args) {
      int ans = Pythagorean();
      System.out.println(ans);
        
    
    }
    
}
