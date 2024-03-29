
package euler;


public class Euler5 {
    public static int Divisible(){
        int num = 2520;
        boolean div = false;
        while(!div){
          int count = 0;
          
          for (int i = 2; i <= 20; i++) {
              
                if (num % i == 0) {
                    count++;
                    
                }
                
            }
            
            if (count == 19) {
                div = true;
                num--;
            }
            
                num++;
            
            
        }
        
        return num;
        
    }
    
    public static void main(String[] args) {
        int ans = Divisible();
        System.out.println(ans);
    }
    
}
