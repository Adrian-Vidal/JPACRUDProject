package com.skilldistillery.skiresorts.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "ski_resort")
public class SkiResort {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String description;
	@Column(name = "year_founded")
	private int yearFounded;
	private String founder;
	@Column(name = "base_elevation")
	private int baseElevation;
	@Column(name = "highest_elevation")
	private int highestElevation;
	@Column(name = "skiable_terrain")
	private int skiableTerrain;
	@Column(name = "number_of_trails")
	private int numberOfTrails;
	@Column(name = "number_of_lifts")
	private int numberOfLifts;
	@Column(name = "longest_run")
	private int longestRun;
	@Column(name = "image_url")
	private String imageURL;
	
	public SkiResort() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public int getBaseElevation() {
		return baseElevation;
	}

	public void setBaseElevation(int baseElevation) {
		this.baseElevation = baseElevation;
	}

	public int getHighestElevation() {
		return highestElevation;
	}

	public void setHighestElevation(int highestElevation) {
		this.highestElevation = highestElevation;
	}

	public int getSkiableTerrain() {
		return skiableTerrain;
	}

	public void setSkiableTerrain(int skiableTerrain) {
		this.skiableTerrain = skiableTerrain;
	}

	public int getNumberOfTrails() {
		return numberOfTrails;
	}

	public void setNumberOfTrails(int numberOfTrails) {
		this.numberOfTrails = numberOfTrails;
	}

	public int getNumberOfLifts() {
		return numberOfLifts;
	}

	public void setNumberOfLifts(int numberOfLifts) {
		this.numberOfLifts = numberOfLifts;
	}

	public int getLongestRun() {
		return longestRun;
	}

	public void setLongestRun(int longestRun) {
		this.longestRun = longestRun;
	}


	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "SkiResort [id=" + id + ", name=" + name + ", description=" + description + ", yearFounded="
				+ yearFounded + ", founder=" + founder + ", baseElevation=" + baseElevation + ", highestElevation="
				+ highestElevation + ", skiableTerrain=" + skiableTerrain + ", numberOfTrails=" + numberOfTrails
				+ ", numberOfLifts=" + numberOfLifts + ", longestRun=" + longestRun + ", imageURL=" + imageURL + "]";
	}


	

}
