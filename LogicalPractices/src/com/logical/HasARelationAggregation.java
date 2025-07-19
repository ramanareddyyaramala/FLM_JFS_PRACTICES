package com.logical;

class Engine1{
	private String engineStatus;
	
	Engine1(String engineStatus){
		this.engineStatus=engineStatus;
	}
	
	public String getEngineStatus() {
		return engineStatus;
	}
	
	
}


class Car1{
	private Engine1 engine;
	private String carStatus;
	
	Car1(String carStatus,Engine1 engine){
		this.carStatus=carStatus;
		this.engine=engine;
	}
	
	void carStatus() {
		System.out.println("engine status: "+engine.getEngineStatus());
		System.out.println("car status: "+carStatus);
	}
	
	
}

public class HasARelationAggregation {
	
	 
	 public static void main(String[] args) {
		 Engine1 enginestatus=new Engine1("Engine Started");
		 Car1 car=new Car1("started",enginestatus);
		 car.carStatus();
	}
	
}

/*
 * Aggregation: A weaker relationship where the contained object can exist
 * independently of the container. If the container is destroyed, the contained
 * object may still exist.
 */
