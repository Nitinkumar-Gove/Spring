package com.reservationsystem.api.flight;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity           // used to_location specify entity to_location JPA
public class Flight {
		
	    @Id                // used to_location specify primary key for the table
	    private String number; // Each flight has a unique flight number.
	    private int price;
	    private String from_location;
	    private String to_location;
	    private Date departureTime;     
	    private Date arrivalTime;
	    private int seatsLeft; 
	    private String description;
		
	    public Flight(){
	    	
	    }
	    
	    public Flight(String number, int price, String from_location, String to_location, Date departureTime, Date arrivalTime,
				int seatsLeft, String description) {
			super();
			this.number = number;
			this.price = price;
			this.from_location = from_location;
			this.to_location = to_location;
			this.departureTime = departureTime;
			this.arrivalTime = arrivalTime;
			this.seatsLeft = seatsLeft;
			this.description = description;
		}
	    
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public String getfrom_location() {
			return from_location;
		}
		public void setfrom_location(String from_location) {
			this.from_location = from_location;
		}
		
		public String getto_location() {
			return to_location;
		}
		public void setto_location(String to_location) {
			this.to_location = to_location;
		}
		
		public Date getDepartureTime() {
			return departureTime;
		}
		public void setDepartureTime(Date departureTime) {
			this.departureTime = departureTime;
		}
		
		public Date getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(Date arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		
		public int getSeatsLeft() {
			return seatsLeft;
		}
		public void setSeatsLeft(int seatsLeft) {
			this.seatsLeft = seatsLeft;
		}
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		@Override
		public String toString() {
		// to_locationDO Auto_location-generated method stub
				return this.number + " " + this.to_location + " " + this.from_location;
		}
	        
}
