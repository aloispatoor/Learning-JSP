package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstName = "Jean-Michel";
	private String lastName = "Lambda";
	private String city;
	private String favouriteLanguage;
	private String[] favouriteLanguages;

	private List<String> cities;
	
	public Student() {
		cities = new ArrayList<>();
		cities.add("Lyon");
		cities.add("Paris");
		cities.add("Goedevarsvelde");
		cities.add("Bordeaux");
		cities.add("Javerlhac-et-la-chappelle-saint-robert");
	}
	
	public List<String> getCities() {
		return cities;
	}
	
	/* public void setCities(List<String> cities) {
		this.cities = cities;
	} */
	
	public String getCity() {
		return city;
	}

	public String[] getFavouriteLanguages() {
		return favouriteLanguages;
	}

	public void setFavouriteLanguages(String[] favouriteLanguages) {
		this.favouriteLanguages = favouriteLanguages;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
