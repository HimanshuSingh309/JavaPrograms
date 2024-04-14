package javaStringhandelingPrograms;

public class DuplicateWordsWithOccurence {

	public static void main(String[] args) 
	{
		
	printDuplicateWithOccurence("Noida is a good city and Is a good very good noida good and well maintained good");		
	printDuplicateWithOccurence("Java Python java python");
	}
	
	public static void printDuplicateWithOccurence(String str1) 
	{
		int count = 1;
		String str2[] = str1.split(" ");
		for(int i = 0; i<str2.length;i++) 
		{
			for(int j = i+1; j<str2.length; j++) 
			{
				
				if(str2[i].equalsIgnoreCase(str2[j])) 
				{
					str2[j] = "_";
					count++;
				}
			}
			if(count>1 && str2[i]!="_") 
			{
				System.out.println(str2[i] +" ---- "+ count);
			}
			count = 1;
		
	  }

	}
}
