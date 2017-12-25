package ua.saniok.web.shop.model.entity;

public class Country {
	private int id;
	private String leterCode;
	private String name;
	private String iso3;
	private int number;
	private Continent continent;
	public int getId() {
		return id;
	}
	public String getLeterCode() {
		return leterCode;
	}
	public String getName() {
		return name;
	}
	public String getIso3() {
		return iso3;
	}
	public int getNumber() {
		return number;
	}
	public Continent getContinent() {
		return continent;
	}
	public void setId(int country_id) {
		this.id = country_id;
	}
	public void setLeterCode(String leterCode) {
		this.leterCode = leterCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
