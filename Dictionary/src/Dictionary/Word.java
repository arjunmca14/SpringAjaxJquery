package Dictionary;

import java.util.ArrayList;
import java.util.*;
public class Word implements Comparable
{

	private String meaning="";
	private String semantic="";
	private String example="";
	private String word="";
	
	
	
	public String getWord() {
		return word;
	}

	
	

	
	
	public String toString()
	{
		
		return word+"="+semantic+";"+meaning+";"+example;
	}
	
	
	
	
	public boolean equals(Object o)
	{
		Word wd =(Word)o;
		if(this.word.equals(wd.getWord()))
			return true;
      	else
			return false;
	}
	
	
	
	
	public int compareTo(Object o)
	{
		Word w =(Word)o;
		if((this.word!=null)&&(w!=null))
			return word.compareTo(w.getWord());
      	else
			return 0;
	}
	
	
	
	public int hashCode()
	{
		return this.word.length();
	}
	
	
	
	
	public static void display(Object obj)
	{
		Iterator<Word> it = null;
		
		
		
		if(obj instanceof ArrayList)
		{
			ArrayList al =(ArrayList)obj;
			it = al.iterator();
		}
		
	 	else if(obj instanceof TreeSet)
		{
			TreeSet  ts = (TreeSet)obj;
			it = ts.iterator();		
		}
		System.out.println("Word;Semantic;menaing; example->this is a formate ");
		System.out.println("-------;--------;--------;--------");
		while(it.hasNext())
		{	
			System.out.println(it.next());
		}
	}
	
}