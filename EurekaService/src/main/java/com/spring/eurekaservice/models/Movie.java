package com.spring.eurekaservice.models;

public class Movie {
	private Integer id;

	private String name;

	private String synopsis;

	private double rating;

	public Movie() {

	}

	public Movie(Integer id, String name, String synopsis, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.synopsis = synopsis;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
