package com.todo.restmodels;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class StorageSpace {
	
	    
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    int id;
	
		@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(unique = true)
	    Location location;
	    
	    
	    
		@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(unique = true)
	    Information information;


		@JsonProperty("Location")
		public Location getLocation() {
			return location;
		}



		public void setLocation(Location location) {
			this.location = location;
		}


		@JsonProperty("Information")
		public Information getInformation() {
			return information;
		}



		public void setInformation(Information information) {
			this.information = information;
		}



		public StorageSpace(Location location, Information information) {
			
			this.location = location;
			this.information = information;
		}



		public StorageSpace() {
			
		}
	    
		



	
	
	

}
