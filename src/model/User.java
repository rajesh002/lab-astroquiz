package model;


public class User{
	private String name;
	private String number;
	private int age;
	private int height;
	private int weight;
	private String country;
	public User(String name, String number, int age, int height, int weight, String country) {
		this.name=name;
		this.number=number;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.country=country;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public void setNumber(String num) {
		this.number=num;
	}
	
	
	public void setAge(int num) {
		this.age=num;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public void setCountry(String cun) {
		this.country=cun;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String getCountry() {
		
		return country;
	}

	
}


