/*Number Guessing Game :In this game the player have to guess a random number 
 * 1. The player is given five attempts to guess the number in a single round
  2.  The player can play as multiple rounds */
package codsoft;
import java.util.*;
public class NumberGuess {
	int n,level = 0,attempt =1,score = 0;
	 int randomNumber = (int)(Math.random()*100); //generating random number
      Scanner sc = new Scanner(System.in);
	 
	   
	void input()                          //function to take user input
	{
		System.out.println("enter a number between 1 to 100");
		n=sc.nextInt();
	}
	
	
	void guess()
	{ 
		 while(attempt<=5)
		   {
			  input();
			  if(n>randomNumber)
			
		     {
			   System.out.println("too high,guess low");
		    }
		    else if(n<randomNumber)
		    {
			 System.out.println("too Low,guess High");
		    }
		    else if(n==randomNumber)
		    {
			  score++;
			  System.out.println("Congrats ,YOU WON ");
			  System.out.println("enter 1 for next round and 0 to stop");
			  replay();
			 break;
		    } 
			attempt++;
	      } 
		
	  }
	
	
    void round()         // round function to maintain the  number of attempts by the user
     {           
	    level++;;
	
     	for(int i=1;i<=5;i++)
	     {
		    guess();
		    if(n==randomNumber)
			 break;
	     }
	     if(attempt>5)
	     {
		   System.out.println("YOU LOST ");
		   System.out.println("enter 1 for next round and 0 to stop and see the scores");
		   replay();
	     }
	
      }
    
    
     void replay()   // replay function to restart the game
     {
	   int ch = sc.nextInt();
	  
	     if(ch==1)
	       { attempt=1;
	         randomNumber = (int)(Math.random()*100);
	          round(); 
	        }
	      else
		   result();
      }
     
     
       void result()   // result function to display the final scoreboard
   {
	  System.out.println("Rounds Played ==>"+ level + "\nYour Score ==>"+ score);
    }
public static void main(String[] args) {
		
		 NumberGuess ob = new NumberGuess();
		System.out.println("Welcome to number guess game");
		 System.out.println("you are given five attempts in a single round");
		  ob.round();
		 	 
	}

}
