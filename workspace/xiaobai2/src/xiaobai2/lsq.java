package xiaobai2;

public class lsq {

	public static void array1(int[] array)
	{
	  for(int i = 0;i<array.length-1;i++)
	  {
		  
		  if(array[i]>=array[i+1])
		  {
			  int exp =array[i];
			 array[i]  = array[i+1];
			  array [i+1] = exp;
		  }
	  }
	  for(int a:array)
		  System.out.println(a);

	}
	public static void main(String[] args) {
        int [] array = {4,3,5,6,7,2,};
        array1(array);
	}

}
