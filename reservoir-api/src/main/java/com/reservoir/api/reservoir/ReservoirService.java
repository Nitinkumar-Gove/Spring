package com.reservoir.api.reservoir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ReservoirService {
	
	List<Reservoir> all_reservoirs = new ArrayList<Reservoir>(Arrays.asList(new Reservoir("1", "Trinity Lake",5000, 50,30),
			new Reservoir("2", "Shasta Reservoir",4000, 50,50),
			new Reservoir("3", "Lake Oroville",3000, 50,20),
			
			new Reservoir("4", "Folsom Lake",2000, 30,20),
			new Reservoir("5", "New Melones",4000, 40,10),
			new Reservoir("6", "Don Pedro Reservoir",2500, 40,15),
			
			new Reservoir("7", "Exchequer Reservoir",6000, 30,20),
			new Reservoir("8", "San Luis Reservoir",4000, 50,50),
			new Reservoir("9", "Millerton Lake",3000, 50,20),
			
			new Reservoir("10", "Pine Flat Reservoir",2000, 60,30),
			new Reservoir("11", "Perris Lake",7000, 50,60),
			new Reservoir("12", "Castair Lake",6000, 40,20)));
	
	public List<Reservoir> getReservoirs(){
		return all_reservoirs;
	}
	
	public Reservoir getReservoir(String id){
		Reservoir temp = all_reservoirs.stream().filter(r -> r.getId().equalsIgnoreCase(id)).findFirst().get();
		temp.setPer_capacity(new Random().nextInt(100-20) + 10);
		return temp;
	}

}
