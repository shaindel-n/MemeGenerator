import java.awt.*;
import java.util.Locale;
import java.util.Scanner;
import java.io.*;
 

public class Main {

	//shouldnt write throws...
	public static void main(String[] args) throws IOException{
		
		Scanner keyboard = new Scanner(System.in);
		//Can we display all this at once as a form?
		//can we show a sample
		
		System.out.println("\nWelcome to the wonderful Meme Generator, where all your "
				+ "memes come true!");
		
		System.out.println("--------------------------------------------------------------------------");
		
		  String fileURL;
		  String text;
		  int fontNum;
		  String font;
		  int fontSize;
		  int colorNum;
		  Color color;
		  String newFileName;
		
		System.out.println("What file image do you want to use?");
		System.out.println("Please enter the full URL");
		System.out.print("URL: ");
		fileURL = keyboard.nextLine();
		
		//VALIDATE!!
		
		
		System.out.print("Enter your meme text: ");
		text = keyboard.nextLine();
		
		System.out.println("What font would you like to use for the meme?");
		System.out.println("1. Arial");
		System.out.println("2. Forte");
		System.out.println("3. Freestyle Script");
		System.out.println("4. Georgia");
		System.out.println("5. Rod");
		System.out.println("6. Stencil");
		
		System.out.println("Please see pop up image to see the sample fonts");
		DisplayImage fontChoices = new DisplayImage("Font_Choices.PNG");
		
		System.out.print("Please enter a choice 1 -6:");
		fontNum = keyboard.nextInt();

		while(fontNum < 1 || fontNum > 6) {
			System.out.print("Please enter a choice 1 - 6:");
			fontNum = keyboard.nextInt();
		}
		

		
		switch(fontNum) {
		
			case 1:
				font = "Arial";
				break;
			case 2:
				font = "Forte";
				break;
			case 3:
				font = "Freestyle Script";
				break;
			case 4:
				font = "Georgia";
				break;
			case 5:
				font = "Rod";
				break;
			default:
				font = "Stencil";
				break;
		}
		
		//big, medium, small font size
		//for now- hard coded
		fontSize = 75;
		
		//maybe change bold?
		
		System.out.println("What color would you like the text to be? ");
		System.out.println("1. Red");
		System.out.println("2. Blue");
		System.out.println("3. Green");
		System.out.println("4. Black");
		System.out.println("5. Yellow");
		System.out.println("6. White");
		System.out.print("Enter your choice: ");
		
		colorNum = keyboard.nextInt();
		
		while(colorNum < 1 || colorNum > 6) {
			System.out.print("Please enter a choice 1 - 6:");
			colorNum = keyboard.nextInt();
		}
		
		
		switch(colorNum) {
		
		case 1:
			color = Color.RED;
			break;
		case 2:
			color = Color.BLUE;
			break;
		case 3:
			color = Color.GREEN;
			break;
		case 4:
			color = Color.BLACK;
			break;
		case 5:
			color = Color.YELLOW;
			break;
		default:
			color = Color.WHITE;
			break;
	}
		
		//keyboard.nextLine();
		
		//make sure have a .png, should we add this back in?
		//System.out.print("Enter the name of your new meme file: ");
		//newFileName = keyboard.nextLine();
		
		//maybe add this so that the user can see the meme before it saves to see if they want to change anything?
		//DisplayImage fontChoices = new DisplayImage("Font_Choices.PNG");
		
		//change constructor that all these are methods in the MemeGenerator class
		MemeGenerator meme = new MemeGenerator(fileURL, text, font, fontSize, color);
		
		//while loop to see if want to make a new meme
		//add to cahnge position of the file
		
		System.out.print("Check your image file to see your new meme!!");
		System.exit(0);
		
	}
	
 }


