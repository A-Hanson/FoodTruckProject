package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	private static Scanner input = new Scanner(System.in);
	private final int MAX_ENTRIES = 5;
	private FoodTruck[] listOfFoodTrucks = new FoodTruck[MAX_ENTRIES];
	private boolean keepGoing = true;

	public static void main(String[] args) {

		FoodTruckApp fta = new FoodTruckApp();
		fta.collectUserInput();
		fta.runMenu();
//		FoodTruckApp ftt = new FoodTruckApp();
//		ftt.listOfFoodTrucks[0] = new FoodTruck("Sally", "tacos", 3);
//		ftt.listOfFoodTrucks[1] = new FoodTruck("Terry", "tacos", 4);
//		ftt.listOfFoodTrucks[2] = new FoodTruck("Juan", "sausage", 5);
//		ftt.listOfFoodTrucks[3] = new FoodTruck("Martas", "meats", 2);
//		ftt.listOfFoodTrucks[4] = new FoodTruck("billy bob's", "burgers", 1);
//		ftt.printListOfFoodTrucks();
//		ftt.printAverageRating();
//		ftt.printHighestRatedTruck();

	}

	public FoodTruckApp() {

	}

	public void collectUserInput() {
		System.out.println("You are going to enter information for up to 5 food trucks.\n"
				+ "Type 'quit' between entries to exit");
		System.out.println("------------------------------");
		while (keepGoing) {
			for (int i = 1; i <= MAX_ENTRIES; i++) {
				System.out.println("Please enter the following information for truck #" + i);
				String truckName = getFoodTruckName();
				String truckType = getFoodTruckType();
				int truckRating = getUserRating();
				listOfFoodTrucks[i - 1] = new FoodTruck(truckName, truckType, truckRating);
				FoodTruck.setNextTruckId(i + 1);
				System.out.println("Entry accepted. Enter 'C' to continue or 'exit' to quit");
				String checkPoint = input.nextLine();
				System.out.println("------------------------------");
				if (checkPoint.toLowerCase().equals("exit") || i == MAX_ENTRIES) {
					keepGoing = false;
					break;
				}
			}
		}
	}

	public String getFoodTruckName() {
		System.out.print("What is the name of the food truck? ");
		String name = input.nextLine();
		System.out.println();
		return name;
	}

	public String getFoodTruckType() {
		System.out.print("What type of food does the truck serve? ");
		String type = input.nextLine();
		System.out.println();
		return type;
	}

	public int getUserRating() {
		System.out.print("On a scale of 1 (worst) to 5 (best), how would you rate this truck? ");
		int rating = input.nextInt();
		System.out.println();
		input.nextLine();
		return rating;
	}

	public void runMenu() {
		int userChoice = 0;
		keepGoing = true;
		while (keepGoing) {
			printMenu();
			userChoice = input.nextInt();
			switch (userChoice) {
			case 1:
				printListOfFoodTrucks();
				System.out.println();
				break;
			case 2:
				printAverageRating();
				System.out.println();
				break;
			case 3:
				printHighestRatedTruck();
				System.out.println();
				break;
			case 4:
				System.out.println("Quitting program");
				keepGoing = false;
				break;
			default:
				System.out.println("Invalid input, please try again.");
				System.out.println();
			}

		}
	}

	public void printMenu() {
		System.out.println("************ Menu ************");
		System.out.println("| 1. List all trucks         |");
		System.out.println("| 2. See average rating      |");
		System.out.println("| 3. See highest rated truck |");
		System.out.println("| 4. Quit                    |");
		System.out.println("******************************");
		System.out.println();
		System.out.print("Which number would you like to select? ");
	}

	public void printListOfFoodTrucks() {
		// see all existing food trucks
		System.out.println("The food trucks that have been rated are: ");
		for (int i = 0; i < MAX_ENTRIES; i++) {
			if (listOfFoodTrucks[i] != null) {
				System.out.println(listOfFoodTrucks[i]);
			}
		}
	}

	public void printAverageRating() {
		// print the average rating of the food trucks
		double averageRating = 0.0;
		int numNotNull = 0;
		for (int i = 0; i < MAX_ENTRIES; i++) {
			if (listOfFoodTrucks[i] != null) {
				averageRating += listOfFoodTrucks[i].getRating();
				numNotNull++;
			}
		}
		averageRating /= numNotNull;
		System.out.printf("The average food truck rating is %.1f", averageRating);
		System.out.println();
	}

	public void printHighestRatedTruck() {
		// prints the highest-rated food truck
		int highestRating = 0;
		int indexOfHighestRated = 0;
		for (int i = 0; i < MAX_ENTRIES; i++) {
			if (listOfFoodTrucks[i] != null) {
				if (highestRating < listOfFoodTrucks[i].getRating()) {
					highestRating = listOfFoodTrucks[i].getRating();
					indexOfHighestRated = i;
				}
			}
		}
		System.out.printf("The highest rated food truck is %s with a rating of %d",
				listOfFoodTrucks[indexOfHighestRated].getTruckName(),
				listOfFoodTrucks[indexOfHighestRated].getRating());
		System.out.println();
	}

	public void setListOfFoodTrucks(FoodTruck[] listOfFoodTrucks) {
		this.listOfFoodTrucks = listOfFoodTrucks;
	}

	public boolean isKeepGoing() {
		return keepGoing;
	}

	public void setKeepGoing(boolean keepGoing) {
		this.keepGoing = keepGoing;
	}

}
