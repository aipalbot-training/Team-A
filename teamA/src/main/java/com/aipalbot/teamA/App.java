package com.aipalbot.teamA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	int row ;
    	int col ;
    	int row2 ;
    	int  col2;
        
      Scanner input = new Scanner(System.in);
		System.out.println("Enter the first no of row:-");
		 row = input.nextInt();
		
		System.out.println("Enter the first no of col:-");
		 col = input.nextInt();
		
		
		System.out.println("print the result out:-");
    	 row2 = input.nextInt();
    	
    	 System.out.println("print the result out:-");
    	 col2 = input.nextInt();
    	 
    	 if(row==col)
    	 {
    	int matrixA[][]= new  int[row][col];
    	int matrixB[][] = new int[row2][col2];
    	int result[][]  = new int[row][col2];
    	
    System.out.println("Enter the element of matrix:-");
   
    	
    	for(int i = 0; i< row; i++) 
    	{
			for(int j = 0; j < col; j++) 
			
				matrixA[i][j] = input.nextInt();
				
			}
			
			System.out.println("Enter the element of matrix2:-");
			
			for(int i = 0; i< row2; i++) 
	    	{
				for(int j = 0; j < col2; j++) 
				
					matrixB[i][j] = input.nextInt();
			}
			
			 System.out.println("\n\noutput matrix:-");
			
			for(int i = 0; i< row; i++) 
	    	
			for(int j = 0; j < col2; j++) 
				{
				int sum = 0;
					
			for(int k = 0; k < row2; k++) {
					
				sum += matrixA[i][k] * matrixB[k][j];
				}
				
		result[i][j] =sum;
				
	}
			for(int i = 0; i< row; i++) {
		    	
				for(int j = 0; j < col2; j++) 
					
					 System.out.print(result[i][j] + " ");
					
				System.out.println();
	}
    }
    	 else 
    		 System.out.print("multiplication does not exist in the matrix");
}
}