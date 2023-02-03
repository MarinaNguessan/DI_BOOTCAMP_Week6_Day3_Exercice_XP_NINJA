package atos;

public class Exercice1 {	
	 public static int warOfNumber(int[] tab) {
	        int sumOfNbrePair = 0, sumOfNbreImpair = 0;
	        for(int i = 0; i < tab.length; i++) {
	            if(tab[i] % 2 == 0) {
	                sumOfNbrePair+=tab[i];
	            }else {
	                sumOfNbreImpair+=tab[i];
	            }
	        }
	        
	        int sumNbreDiff = (sumOfNbreImpair < sumOfNbrePair) ? sumOfNbrePair - sumOfNbreImpair : sumOfNbreImpair - sumOfNbrePair;
	        
	        return sumNbreDiff;
	    }
	 
	 
	 public static void main(String[] args) {
		 int[] area = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
		 System.out.println(warOfNumber(area));
			
	}

}
