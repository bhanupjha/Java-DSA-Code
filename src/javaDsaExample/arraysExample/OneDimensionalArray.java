package javaDsaExample.arraysExample;

   /*Create a one dimensional integer array and insert a number starting from  1 to the maximum number until the end of the array.
    Access the numbers after inserting them and then display them as the output*/

  public class OneDimensionalArray {

			public static void main(String[] args) {
				int[] a1 = new int[8];
				int count = 1;
				for(int i = 0; i <a1.length;i++) {
					a1[i] = count;
					count++;
				}
				  for(int j= 0; j<a1.length; j++) {
					  System.out.println(a1[j]+"");
				  }
		  }
 }


