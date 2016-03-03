package zorkproject;

import java.util.Scanner;
import java.util.Random;
public class zorkprojectold {
	static Scanner darkly = new Scanner(System.in);
	int number;

	private static void roomDescribe(String where, String[] stuff, String directions)
	{
		System.out.println("You are in " + where);
		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}
		System.out.println("You can go " + directions);
	}

	public static void room1()
	{
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		String direct = " to the north (n) or the south (s)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room2();
			}
			else if (choice.equals("s"))
			{
				System.out.println("game over");
				ghost();
				System.exit(0);
				break;
				
				
			}

			else 
			{
				System.out.println("invalid choice");
			}
			
		} while (1==1);
	}

	public static void room2()
	{
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a phone";
		String direct = " to the east (e), the south (s) or the west (w)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room1();
			} 
			else if (choice.equals("e")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room3();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		} while (1==1);
	}

	public static void room3()
	{
		String place = "library";
		String[] things = new String[1];
		things[0] = "spiders";
		String direct = " to the north (n) or the east(e)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room5();
			}
			else if (choice.equals("e"))
			{
				room2();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		} while (1==1);
	}

	public static void room4()
	{
		String place = "kitchen";
		String[] things = new String[1];
		things[0] = "a bats";
		String direct = " to the north (n) or the west (w))";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room7();
			}
			else if (choice.equals("w"))
			{
				room2();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		} while (1==1);
	}

	public static void room5()
	{
		String place = "diningroom";
		String[] things = new String[1];
		things[0] = "dust & empty space";
		String direct = " to the south (s)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room3();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		} while (1==1);
	}

	public static void room6()
	{
		String place = "vault";
		String[] things = new String[1];
		things[0] = "3 walking skelectons";
		String direct = " to the east(e)";
		int number, guess;
		Random rnd = new Random ();
		number = rnd.nextInt(4);
		do
		{
			roomDescribe(place, things, direct);
			String choice = darkly.next();
			if (choice.equals("e")) 
			{
				System.out.println("Guess a number between 1 and 4");
				guess = darkly.nextInt();
				if (guess == number)
				{
					room8();
				}
				else 
				{
					room7();
				}

			} 

		} while (1 == 1);

	}


	public static void room7()
	{
		String place = "parlor";
		String[] things = new String[1];
		things[0] = "treasure chest";
		String direct = " to the west(w) or the south (s)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("w")) 
			{
				room6();
			}
			else if (choice.equals("s"))
			{
				room4();
			}
			else 
			{
				System.out.println("invalid choice");
			}

		} while (1==1);
	}

	public static void room8()
	{
		String place = "the secret room";
		String[] things = new String[1];
		things[0] = "piles of gold";
		String direct = " to the west(w))";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("w")) 
			{
				room6();
			}
			else 
			{
				System.out.println("invalid choice");
			}
		} while (1==1);
	}
	
	public static void ghost()
    {
        Random rnd = new Random();
        int rand = rnd.nextInt(4);
        if(rand == 5)
            System.out.println("You are being followed: "+rand);
        else
            System.out.println("You are Safe!!");
        
        
    }

	public static void main(String[] args) {
		room1();

	}



}