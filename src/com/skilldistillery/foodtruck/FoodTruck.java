package com.skilldistillery.foodtruck;

public class FoodTruck {
	private static int nextTruckId = 1;
	private int truckId;
	private String truckName;
	private String foodType;
	private int rating;
	
	
	public FoodTruck(String name, String type, int rating) {
		truckName = name;
		foodType = type;
		this.rating = rating;
		truckId = nextTruckId;
	}


	@Override
	public String toString() {
		return "FoodTruck [Id= " + truckId + ", Name= " + truckName + ", Type of food= " + foodType + ", has a rating of= "
				+ rating + "]";
	}


	public static int getNextTruckId() {
		return nextTruckId;
	}


	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}


	public int getTruckId() {
		return truckId;
	}


	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}


	public String getTruckName() {
		return truckName;
	}


	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
}
