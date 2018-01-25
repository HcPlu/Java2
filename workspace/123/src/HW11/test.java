package HW11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import HW10.Students;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input how many polygons we prepare to create");
		int n = input.nextInt();
		System.out.println("please input how mangy polygons we must be created");
		int m = input.nextInt();
		Polygon [] a = new Polygon[n];
		for(int i=0;i<n;i++ ){
			System.out.println("Please input polygon type: 1 or 2");
			int k=input.nextInt();
			if(k==1) a[i]=new Square();
			else if(k==2) a[i]=new Triangle();
			else a[i]=new Polygon();
		}
		if(m>n){
		 ArrayList<Polygon> list = new ArrayList<>(Arrays.asList(a));
		  for(int j=0;j<m-n;j++){
			  System.out.println("Please input polygon type: 1 or 2");
				int k=input.nextInt();
				if(k==1) list.add(new Square());
				else if(k==2) list.add(new Triangle());
				else list.add(new Polygon());
		  }
		  Polygon[] b= new Polygon[list.size()];
		  list.toArray(b);
		  for(int t=0;t<m;t++) {
				if(b[t].numberRan==0)
					continue;
				System.out.println(b[t].toString());

			}

		}else{
			for(int t=0;t<n;t++) {
				if(a[t].numberRan==0)
					continue;
				System.out.println(a[t].toString());
			}
		}

	}

}
