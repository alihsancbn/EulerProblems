
package euler;
//Author: ALi Ihsan Coban

/* 8*49*81*52 = 52*81*49*8 => as shown on the example, product of multiplying 4 adjacent numbers in low direction of 8 equals to up direction of 52,
 * so only looking at 1 direction is enough, and we will check only rigth,down and lower right and left diagonals.  */

public class Eulerr11 {
    
	
	public static int calcRight(int[][] mat) {								//the function that calculates the product of 4 adjacent numbers of right direction for every number in grid.
		int maxProd = 0;
		
		for(int i = 0; i < mat.length; i++) {
			
			for(int j = 0; j < mat.length-3; j++) {
				
				int prod = 1;
				
				for(int k = 0; k < 4; k++) {
					
					prod *= mat[i][j+k];
					
				}
				
				if(prod > maxProd) {
					maxProd = prod;
				}
			}
			
			
		}
		return maxProd;
		
	}
	
	
	public static int calcDown(int[][] mat) {								//the function that calculates the product of 4 adjacent numbers of right direction for every number in grid.
		
		int maxProd = 0;
		
		for(int i = 0; i < mat.length-3; i++) {
			for(int j = 0; j < mat.length; j++) {
				
				int prod = 1;
				for(int k = 0; k < 4; k++) {
					prod *= mat[i+k][j];
					
				}
				if(prod > maxProd) {
					maxProd = prod;
				}
			}
			
			
		}
		return maxProd;
		
		
	}
	
	
	public static int calcDiag(int[][] mat) {								//the function that calculates the product of 4 adjacent numbers of lower diagonals for every number in grid.
		int maxProd = 0;
		
		for(int i = 0; i < mat.length-3; i++) {
			for(int j = 0; j < mat.length-3; j++) {
				int prod = 1;
				int prodL = 1;
				int prodR = 1;
				
				for(int k = 0; k < 4; k++) {
					
					if(i < 3 || j < 3 ) {
						prod *= mat[i+k][j+k];
					}
					
					else if((i >= 3 && i < 18) || (j >= 3 && j < 18)) {
						
						prodL *= mat[i+k][j-k];
						prodR *=mat[i+k][j+k];
						
						if(prodL >= prodR) {
							prod = prodL;
						}
						else {
							prod = prodR;
						}
					}
					
					else {
						prod *= mat[i+k][j-k];
					}
					
				}
				if(prod > maxProd) {
					maxProd = prod;
				}
			}
			
			
		}
		return maxProd;
		
		
	}
	
	
    public static int maxProdGrid(){
        int prod1, prod2, prod3; 											//defining 3 variables for the calculations of every direction.
        prod1 = prod2 = prod3 = 0;
        int maxProd = 0;
        int[][] grid = {
            { 8, 2,22,97,38,15, 0,40, 0,75, 4, 5, 7,78,52,12,50,77,91, 8},
            {49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48, 4,56,62, 0},
            {81,49,31,73,55,79,14,29,93,71,40,67,53,88,30, 3,49,13,36,65},
            {52,70,95,23, 4,60,11,42,69,24,68,56, 1,32,56,71,37, 2,36,91},
            {22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80},
            {24,47,32,60,99, 3,45, 2,44,75,33,53,78,36,84,20,35,17,12,50},
            {32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70},
            {67,26,20,68, 2,62,12,20,95,63,94,39,63, 8,40,91,66,49,94,21},
            {24,55,58, 5,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72},
            {21,36,23, 9,75, 0,76,44,20,45,35,14, 0,61,33,97,34,31,33,95},
            {78,17,53,28,22,75,31,67,15,94, 3,80, 4,62,16,14, 9,53,56,92},
            {16,39, 5,42,96,35,31,47,55,58,88,24, 0,17,54,24,36,29,85,57},
            {86,56, 0,48,35,71,89, 7, 5,44,44,37,44,60,21,58,51,54,17,58},
            {19,80,81,68, 5,94,47,69,28,73,92,13,86,52,17,77, 4,89,55,40},
            { 4,52, 8,83,97,35,99,16, 7,97,57,32,16,26,26,79,33,27,98,66},
            {88,36,68,87,57,62,20,72, 3,46,33,67,46,55,12,32,63,93,53,69},
            { 4,42,16,73,38,25,39,11,24,94,72,18, 8,46,29,32,40,62,76,36},
            {20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74, 4,36,16},
            {20,73,35,29,78,31,90,01,74,31,49,71,48,86,81,16,23,57,05,54},
            { 1,70,54,71,83,51,54,69,16,92,33,48,61,43,52, 1,89,19,67,48}      
    };
        
        prod1 = calcRight(grid);
        prod2 = calcDown(grid);												//First, calculate right and down directions.
        
        if(prod2 >= prod1) {
        	maxProd = prod2;												//choose the greater one as maxProd.
        }
        else{
        	maxProd = prod1;
        }
        
        prod3 = calcDiag(grid);												//Then, calculate the lower diagonals.
        
        if(prod3 > maxProd) {
        	maxProd = prod3;												//choose as maxProd if the result is greater than other directions' results. 
        }
    
        return maxProd;    													//return the final result.
    }
    
    public static void main(String[] args) {
        int ans = maxProdGrid();
        System.out.println(ans);
    }
    
}
