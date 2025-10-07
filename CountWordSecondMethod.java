package day7assignments;


public class CountWordSecondMethod {

	public static void main(String[] args) {
		
			  String str = "   The world is so beautiful!   ";
			  str = str.trim();
			  //str= str.stripLeading();
			  //str =str.stripTrailing();		
		      String[] words = str.split("\\s+");
		      
		      
		      int wordcount = words.length;
		    
		      System.out.println(" the words in string str are  "+wordcount);
			}

		}
		
		
		