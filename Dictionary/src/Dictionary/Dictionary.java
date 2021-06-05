package Dictionary;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Dictionary {
	static String word="";
	static String output="";
	static String semantic = "";
	static String mean="";
	static String example="";
	static String TreeSemantic="";
	static Scanner sc=new Scanner(System.in);
	
	
	

		public static void main(String args[])throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int ch=0;	
		
		while(ch!=3)
		{
			System.out.println("Press 1 to create a Dictinory");
			System.out.println("Press 2 to load a Dictinory");
			System.out.println("Press 3 exit");
			File f=null;
			for(;;)
			{
				try
				{
					ch = Integer.parseInt(br.readLine());
					break;
				}
				catch(NumberFormatException e)
				{
					System.out.println("Enter NUmber Boss");
				}
			}
			
try
{
			
switch(ch)
{
case 1: 
	
	
	System.out.println("Enter the Dictinory Name you want to Load");
	boolean fileExitflag1=false;
	String dicName1="";
	while(fileExitflag1==false)
	{
		
		
		try
			{
			
			
			
			
			dicName1 = br.readLine();
			
			for (int i = 0; i < dicName1.length(); i++) {
				if(Character.isLetter(dicName1.charAt(i)))
				{
					break;
				}
				else
				{
					System.out.println("boss u give only letters only");
					throw new Exception();
				}
			}
			
			f = new File(dicName1);
			
				if(!f.exists())
				{
					
							boolean flag11=false;
							System.out.println("Second menu is Open ");
							while(flag11==false)
							{
								
								
									System.out.println("Press 1 to AddWord to Dictinory");
									System.out.println("Press 2 to ListWord from Dictinory");
									System.out.println("Press 3 to SearchWord from Dictinory");
									System.out.println("Press 4 to EditWord from Dictinory");
									System.out.println("Press 5 to DeleteWord from Dictinory");
									System.out.println("Press 6 to Exit");
									System.out.println("Enter your choice");
										for(;;)
										{
											try
											{
												ch = Integer.parseInt(br.readLine());
												break;
											}
											catch(NumberFormatException e)
											{
												System.out.println("Enter NUmber Boss");
											}
										}
										
									
										try
										{
											switch (ch)
											{
												case 1: 
													System.out
															.println("Enter any Word");
													String s="";
																									
													try
													{
													
													
													
														s=sc.next();
	
														for (int i = 0; i < s.length(); i++) 
														{
															if(Character.isLetter(s.charAt(i)))
															{
																break;
															}
															else
															{
																System.out.println("boss u give only letters only");
																throw new Exception();
															}
														}
													}
													catch (Exception e) {

													}
													
													
														addWord(f,s);
														break;
												case 2: listWord(f);
														break;
												case 3: searchWord(f);
														break;
												case 4:EditWord(f);
												break;
												case 5:  deleteWord(f);
														break;
												case 6:System.out.println("Exiting is successfully from second menu goto first menu");
													flag11=true;
													fileExitflag1=true;
														break;
											default:throw new Exception();
											}	
										}
										catch(Exception e)
										{
											System.out.println("Boss u give in Between 1 to 5");
										}
									
									
							}
				}
				
				else
				{
					System.out.println("this file is already exit in ur System");
					System.out.println("Again u try and give the dic name (with not exting name u can give only) ");
					throw new Exception();
				}
			}
		
		catch(Exception e)
		{
			e.getMessage();
			
		}
	}
			
break;
	

					
									
 case 2:
				
				
	 System.out.println("Enter the Dictinory Name you want to Load");
		boolean fileExitflag=false;
		while(fileExitflag==false)
		{
				String dicName = br.readLine();
				f = new File(dicName);
				try
				{
					if(f.exists())
					{
						try
						{
							if(f.isFile())
							{
							
								
								boolean flag11=false;
								System.out.println("Second menu is Open ");
								while(flag11==false)
								{
									
									
										System.out.println("Press 1 to AddWord to Dictinory");
										System.out.println("Press 2 to ListWord from Dictinory");
										System.out.println("Press 3 to SearchWord from Dictinory");
										System.out.println("Press 4 to EditWord from Dictinory");
										System.out.println("Press 5 to DeleteWord from Dictinory");
										System.out.println("Press 6 to Exit");
										System.out.println("Enter your choice");
											for(;;)
											{
												try
												{
													ch = Integer.parseInt(br.readLine());
													break;
												}
												catch(NumberFormatException e)
												{
													System.out.println("Enter NUmber Boss");
												}
											}
											
										
											try
											{
												switch (ch)
												{
													case 1: 
														System.out
																.println("Enter any Word");
														String s=sc.next();
															addWord(f,s);
															break;
													case 2: listWord(f);
															break;
													case 3: searchWord(f);
															break;
													case 4:EditWord(f);
													break;
													case 5:  deleteWord(f);
															break;
													case 6:System.out.println("Exiting is successfully from second menu goto first menu");
														flag11=true;
														fileExitflag=true;
															break;
												default:throw new Exception();
												}	
											}
											catch(Exception e)
											{
												System.out.println("Boss u give in Between 1 to 5");
											}
										
										
								}
								
							}
							 
							else
							{
								throw new Exception();
							}
							}
							catch(Exception e)
							{
								System.out.println("It is a Directiory so it is not go in side");
								System.out.println("Again u try and give the dic name (with exting name and that have file structure also) ");
							}
					}
					else
					{
						throw new Exception();
					}
				}
			
			catch(Exception e)
			{
				
				System.out.println("this file is not exit in ur System");
				System.out.println("Again u try and give the dic name (with exting name only) ");
			}
		}
				
break;
case 3: 
	System.exit(0);	
	break;
default:throw new Exception();
				}
			}
			catch(Exception e)
			{	
				System.out.println("Boss U give Only Numbers in Between 1 to 3 ");
				
			}
			}
		}

			

			public static void addWord(File f,String word1) throws IOException
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
				TreeSet ts=new TreeSet();
				Iterator it=null;
				
				word=word1;
				for(;;)
				{
					
					System.out.println("First U can Select Semantic i am given below that can be choose only");
					System.out.println("Press 1 :select Noun");
					System.out.println("Press 2 :select ProNoun");
					System.out.println("Press 3 :select Verb");
					System.out.println("Press 4 :select Adverb");
					System.out.println("exit third Menu open second menu");
					System.out.println("Enter Your Choice");
					int choice=0;
					
					for(;;){	
						try
						{
							choice=Integer.parseInt(sc.next());
							
							break;
						}
						catch(Exception e)
						{
							System.out.println("BOSS U GIVE NUMBERS ONLY");
							System.out.println("............~~~~~~~......");
						}
					}
				try{
					switch(choice)
					{
					case 1:
						System.out.println("Press 1 :select Noun");
						semantic=semantic+","+"Noun";
						
						mean();
						output=word+";"+semantic+";"+mean+";"+example;
					
						break;
					case 2:
						System.out.println("Press 2 :select ProNoun");
						semantic=semantic+","+"ProNoun";
						
						mean();
						output=word+";"+semantic+";"+mean+";"+example;
					
						
						break;
					case 3:
						System.out.println("Press 3 :select Verb");
						semantic=semantic+","+"Verb";
						
						mean();
						output=word+";"+semantic+";"+mean+";"+example;
					
						
						break;
					case 4:
						System.out.println("Press 4 :select AdVerb");
						semantic=semantic+","+"AdVerb";
						
						mean();
						output=word+";"+semantic+";"+mean+";"+example;
					
						
						break;
					case 5:
						System.out.println("Press 5 :Go Back From This Menu");
						writeDic(output, f)	;
					
						return;
					default:throw new Exception();
					
					}
				}
				catch (Exception e) {
					System.out.println("BOSS U GIVE IN BETWEEN 1 TO 5 ONLY");
					System.out.println(".......................~~~~~~~.....");
				}
				}
			}

			public static void writeDic(String str, File f)throws IOException
			{
				FileWriter fstream = new FileWriter(f,true);
				BufferedWriter out= new BufferedWriter(fstream);
				TreeSet t=new TreeSet();
				String []s=str.split(";");
				for (int i = 0; i < s.length; i++) {
					t.add(s[i]);
				}
				out.write(str);
				out.newLine();
				out.close();
			}
			private static void deleteWord(File f)throws IOException
			{
				BufferedReader br  = new BufferedReader(new FileReader(f));
				String str ="";
				Iterator<String> it=null;
				ArrayList<String> al = new ArrayList<String>();
				while ((str=br.readLine())!=null) 
				{
					al.add(str);
					
				}
				br.close();
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter word to delete");
				String deleteWord = br1.readLine();
				it = al.iterator();
				boolean found = false;
				while (it.hasNext()) 
				{
					str =(String)it.next();
					String[] strar= str.split(";");
					if(strar[0].equals(deleteWord))
					{
						found = true;
						deleteWord = str;
						break;
					}
					
				}
				al.remove(str);
				if(found==true)
				{

				System.out.println("word  suceesFully deleted \t"+deleteWord);
				FileWriter fstream = new FileWriter(f);
				BufferedWriter out= new BufferedWriter(fstream);
				it = al.iterator();

				while (it.hasNext()) 
				{
					str =(String)it.next();
					out.write(str);
					out.newLine();				
				}
				
				out.close();
				}
				else
				{
					System.out.println("word not in the Dictionary");
				}
				
				
			}


				
			

			private static void searchWord(File fo)throws IOException
			{
				
				
				File f=fo;
				FileReader fw=new FileReader(f);
				BufferedReader br=new BufferedReader(fw);
				
				
				String s1=null;
				String r1=null;
				ArrayList<String> a=new ArrayList<String>();
				while((s1=br.readLine())!=null){	
					a.add(s1);
				}
				
			
				
				Iterator<String> it=a.iterator();
				
				System.out.println("enter searching word");
				r1=sc.next();
				String[] splitArray=null;
				String str1;
				int index=0;
				int count=0;
				while(it.hasNext())
				{
					str1=(String)it.next();
					
					splitArray= str1.split(";");
					
					
				
						
					for (int i = 0; i < splitArray.length; i++) 
					{
						
						while((index=splitArray[i].indexOf(r1, index))!=-1)
						{
							index++;
							count++;
							
						}
							
					}

					
					
				}
				
					System.out.println("number of :"+count );
				
				
	
				
			}

			private static void listWord(File f) throws IOException
			{

				BufferedReader br  = new BufferedReader(new FileReader(f));
				System.out.println("u have all Meanings Press 1.");
				System.out.println("u don't have duplicate Meanings and sorting order Press 2.");
				
				System.out.println("Enter ur choice");
				int i=sc.nextInt();
				
				try
				{
				switch(i)
				{
				case 1:
					String str1 ="";
					ArrayList<String> al = new ArrayList<String>();
					while ((str1=br.readLine())!=null) 
						{
							al.add(str1);				
						}
					Word w1=new Word();
					w1.display(al);
					break;
				case 2:
					String str ="";
					TreeSet<String> t = new TreeSet<String>();
					while ((str=br.readLine())!=null) 
						{
							t.add(str);				
						}
					Word w=new Word();
					w.display(t);
					break;
				default:
					throw new Exception();
					
				}
				}
				catch (Exception e) {
						System.out.println("ru select in between 1 to 3 only");
				}
	
				
			}
			public static String mean()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Meaning");
				 mean=mean+","+sc.nextLine();
				System.out.println("Enter Example");
				example=example+","+sc.nextLine();
				
				return mean+";"+example;
				
			}
			
			public static void EditWord(File f1)
			{
				BufferedWriter bw=null;
				try
				{
				boolean fo =false;
				
				File f=f1;
				FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				
				
				String s1=null;
				
				TreeSet<String> t=new TreeSet<String>();
				while((s1=br.readLine())!=null)
				{	
					t.add(s1);
				}
				
				System.out.println(t);
				
				Iterator<String> it=t.iterator();
				
			
	
				
				String si=null;
				
				System.out.println("Search Word and after this word is editable in this file ");
				String searchword=sc.next();
				String edit=searchword;
				String[] strar=null;
				boolean found=false;
				while (it.hasNext()) 
				{
					si =(String)it.next();
					strar= si.split(";");
					if(strar[0].equals(searchword))
					{
						
						found = true;
						searchword = si;
						break;
					}
					else
					{
						System.out.println("word is not found");
					}
					
				}
			t.remove(si);
				
				if(found==true)
				{
					
					word=strar[0];
					for(;;)
					{
						
						System.out.println("First U can Select Semantic i am given below that can be choose only");
						System.out.println("Press 1 :select Noun");
						System.out.println("Press 2 :select ProNoun");
						System.out.println("Press 3 :select Verb");
						System.out.println("Press 4 :select Adverb");
						System.out.println("exit third Menu open second menu");
						System.out.println("Enter Your Choice");
						int choice=0;
						
						for(;;){	
							try
							{
								choice=Integer.parseInt(sc.next());
								
								break;
							}
							catch(Exception e)
							{
								System.out.println("BOSS U GIVE NUMBERS ONLY");
								System.out.println("............~~~~~~~......");
							}
						}
					try{
						switch(choice)
						{
						case 1:
							System.out.println("Press 1 :select Noun");
							semantic=semantic+","+"Noun";
							
							mean();
							output=word+";"+semantic+";"+mean+";"+example;
						
							break;
						case 2:
							System.out.println("Press 2 :select ProNoun");
							semantic=semantic+","+"ProNoun";
							
							mean();
							output=word+";"+semantic+";"+mean+";"+example;
						
							
							break;
						case 3:
							System.out.println("Press 3 :select Verb");
							semantic=semantic+","+"Verb";
							
							mean();
							output=word+";"+semantic+";"+mean+";"+example;
						
							
							break;
						case 4:
							System.out.println("Press 4 :select AdVerb");
							semantic=semantic+","+"AdVerb";
							
							mean();
							output=word+";"+semantic+";"+mean+";"+example;
						
							
							break;
						case 5:
							System.out.println("Press 5 :Go Back From This Menu");
							writeDic(output, f)	;
						
							return;
						default:throw new Exception();
						
						}
					}
					catch (Exception e) {
						System.out.println("BOSS U GIVE IN BETWEEN 1 TO 5 ONLY");
						System.out.println(".......................~~~~~~~.....");
					}
					}
					
				}	
				else
					System.out.println("that Word Is not Found");
				}
				catch (Exception e) {
					System.out.println("any wrong input ru given that purpose i go back from this menu");
				}
					
				}
			public static void writeDic1(String str, File f)throws IOException
			{
				FileWriter fstream = new FileWriter(f);
				BufferedWriter out= new BufferedWriter(fstream);
				TreeSet t=new TreeSet();
				String []s=str.split(";");
				for (int i = 0; i < s.length; i++) {
					t.add(s[i]);
				}
				out.write(str);
				out.newLine();
				out.close();
			}
				

}
			
