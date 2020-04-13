package com.todo.restmodels;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Location implements Serializable{


    /**
	 * 
	 */
	private static final long serialVersionUID = 5379818150582036032L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	
	
	double longitude;
	
	

	double latitude;
	
	
	@OneToOne(mappedBy = "location")
   private StorageSpace loc;
	
	
	@JsonProperty("Longitude")
	public String getLongitude() {
		
		return Double.toString(longitude);
	}
	
	
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	@JsonProperty("Latitude")
	public String getLatitude() {
		
		return Double.toString(latitude);
	}
	
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public Location(double longitude, double latitude) {
	
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public Location() {
		
	}
	
	
	
	
	
	
}
