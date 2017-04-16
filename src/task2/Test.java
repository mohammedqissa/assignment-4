package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, CloneNotSupportedException  {
		// TODO Auto-generated method stub

		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String[]> array2 = new ArrayList<String[]>();
		
		File file = new File("movies.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine())
			array1.add(scan.nextLine());
		
		for (int i = 0; i < array1.size(); i++) {
			array2.add(array1.get(i).split("[:,.]"));
		}
		
		array2 = fix(array2);
		
	

		Movie[] movies = new Movie[array2.size()];
		
		for (int i = 0; i < movies.length; i++) {
			if(array2.get(i)[0].equals("Action"))
				movies[i] = new Action(array2.get(i)[1],array2.get(i)[2],Integer.parseInt(array2.get(i)[3]),array2.get(i)[4],array2.get(i)[5]);
			
			else if(array2.get(i)[0].equals("Comedy"))
				movies[i] = new Comedy(array2.get(i)[1],array2.get(i)[2],Integer.parseInt(array2.get(i)[3]),array2.get(i)[4],array2.get(i)[5]);
			
			else if(array2.get(i)[0].equals("Hollywood Blockbuster"))
				movies[i] = new Hollywood_Blockbuster(array2.get(i)[1],array2.get(i)[2],Integer.parseInt(array2.get(i)[3]),array2.get(i)[4],array2.get(i)[5]);
			
			else if(array2.get(i)[0].equals("Mystery"))
				movies[i] = new Mystrey(array2.get(i)[1],array2.get(i)[2],Integer.parseInt(array2.get(i)[3]),array2.get(i)[4],array2.get(i)[5]);
			
			else if(array2.get(i)[0].equals("Rescue"))
				movies[i] = new Rescue(array2.get(i)[1],array2.get(i)[2],Integer.parseInt(array2.get(i)[3]),array2.get(i)[4],array2.get(i)[5]);
			
			else if(array2.get(i)[0].equals("Romance"))
				movies[i] = new Romance(array2.get(i)[1],array2.get(i)[2],Integer.parseInt(array2.get(i)[3]),array2.get(i)[4],array2.get(i)[5]);
			
			else if(array2.get(i)[0].equals("Romantic Comedy"))
					movies[i] = new Romantic_Comedy(array2.get(i)[1],array2.get(i)[2],Integer.parseInt(array2.get(i)[3]),array2.get(i)[4],array2.get(i)[5]);
			
		}
		
		bubbleSort(movies);
		
		//Arrays.sort(movies);
		
		for (int i = 0; i < movies.length; i++) {
			System.out.println(movies[i].getName());
		}
		
		
		
		
		
	}

	private static ArrayList<String[]> fix (ArrayList<String[]> a){
		
		ArrayList<String[]> newAr = new ArrayList<String[]>();
		
		String s ="";
		int j;
		
		for (int i = 0; i < a.size(); i++) {
			for (j = 2; j < a.get(i).length; j++) {
				s=s+a.get(i)[j]+",";
				if(a.get(i)[j].endsWith("]"))
					break;
				
			}


			String[] f = new String[6];



			f[0] = "" + a.get(i)[0];
			f[1] = "" + a.get(i)[1];
			f[2] = "" + s;
			f[3] = "" + a.get(i)[j+1];
			f[4] = "" + a.get(i)[j+2];
			f[5] = "" + a.get(i)[j+3];

			s = "";

		for (int k = 0; k < f.length; k++) {
			if(f[k].endsWith(","))
				f[k] = f[k].substring(0, f[k].length()-1);
			if(f[k].startsWith(" "))
				f[k] = f[k].substring(1, f[k].length());
		}
		
		newAr.add(f);
			
			
		}
		
		return newAr;
		
	}
	
	public static void bubbleSort(Movie[] array) throws CloneNotSupportedException
	{
	    for(int i=(array.length); i>0; i--)
	    {    
	        for(int j=1; j<(array.length-i); j++) 
	        {
	            if( array[j].getName().compareTo(array[j+1].getName())<0)    
	            {


	                Movie Temp =   array[j].clone();
	               System.out.println(array[j]+"\n");
	                array[j] = null;
	                array[j] =	array[j+1].clone();
	               System.out.println(array[j+1]+"\t\n");
	                
	                array[j+1] =null;
	                array[j+1] =Temp;
	            }    
	        }
	    }
	}
	
	
	

	
	
	
	
}
