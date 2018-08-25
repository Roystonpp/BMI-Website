package classes;

public class recipe {
	private String Rname;
	private String ingredients;
	private String Cooking_Time;
	private String Directions;
	private String Fat;
	private String Protein;
	private String Carbohydrates;
	private String Sugar;

	public void setRname(String Rname) {
		this.Rname = Rname;
	}
	public String getRname() {
		return Rname;
	}
	public void setIndgredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setCookingTime(String CookingTime) {
		this.Cooking_Time = CookingTime;
	}
	public String getCookingTime() {
		return Cooking_Time;
	}
	public void setDirectons(String directions) {
		this.Directions = directions;
	}
	public String getDirections() {
		return Directions;
	}
	public void setFat(String fat) {
		this.Fat = fat;
	}
	public String getFat() {
		return  Fat;
	}
	public void setProtein(String protein) {
		this.Protein = protein;
	}
	public String getProtein() {
		return Protein;
	}
	public void setCarbohydrates(String carbohydrates) {
		this.Carbohydrates = carbohydrates;
	}
	public String getCarbohydrates() {
		return Carbohydrates;
	}
	public void setSugar(String sugar) {
		this.Sugar = sugar;
	}
	public String getSugar() {
		return Sugar;
	}
}
