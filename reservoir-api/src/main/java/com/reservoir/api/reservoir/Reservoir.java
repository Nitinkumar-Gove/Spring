package com.reservoir.api.reservoir;

public class Reservoir {
	
	String id;
	String name;
	int capacity;
	int historical_average;
	int per_capacity;
		
	public Reservoir(String id, String name, int capacity, int historical_average, int per_capacity) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.historical_average = historical_average;
		this.per_capacity = per_capacity;
	}
		
	public Reservoir(){
		
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getHistorical_average() {
		return historical_average;
	}
	public void setHistorical_average(int historical_average) {
		this.historical_average = historical_average;
	}
	
	public int getPer_capacity() {
		return per_capacity;
	}
	public void setPer_capacity(int per_capacity) {
		this.per_capacity = per_capacity;
	}
	
	

}
