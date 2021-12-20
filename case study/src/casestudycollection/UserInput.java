package casestudycollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
public class UserInput {
		public void display(HashSet songList) {
			Iterator iterator = songList.iterator();
			for (Object x : songList) {
				System.out.println(x);
			}

		}
		public static void main(String[] args) {
			String song;
			Scanner sc = new Scanner(System.in);
			Multiplayer multiplayer = new Multiplayer();
			UserInput userInput = new UserInput();
			HashSet songList = new HashSet<String>();
			String option;
			songList.add("Stay");
			songList.add("Save your Tears the Weeknd");
			songList.add("cold heart");
			songList.add("Mayday");
			songList.add("Bad Habbits");
			songList.add("one...");
			songList.add("Hey jude");
			songList.add("one day at a time");
			songList.add("Believe");
			ArrayList arraylist = new ArrayList(songList);
			
			System.out.println("Type the option you want: play, search, add ,delete,display");
			option = sc.next();
			switch (option) {
			case "search": {
				System.out.println("Enter the song that you want to search");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.search(arraylist, song);
				main(args);
				break;
			}
			case "play": {
				System.out.println("Enter the song that you want to play");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.search(arraylist, song);
				multiplayer.Play(arraylist, song);
				main(args);
				break;

			}
			case "add": {
				System.out.println("enter the song that you want to add");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.addSong(songList, song);
				System.out.println("**Song List**");
				userInput.display(songList);
				main(args);
				break;

			}
			case "delete": {
				System.out.println("Enter the song that you want to delete");
				sc.nextLine();
				song = sc.nextLine();
				multiplayer.delete(songList, song);
				System.out.println("**Song List**");
				userInput.display(songList);
				main(args);
				break;

			}
			case "display":{
				System.out.println("**Song List**");
				userInput.display(songList);
				System.out.println("*******");
				main(args);
			}
				
			}

			}

		}