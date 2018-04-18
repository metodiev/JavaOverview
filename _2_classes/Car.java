package _2_classes;

import java.util.Iterator;

//parent class
public class Car {

	// fields of car Class
	private String tires;
	private String sensorDarts;
	private int engine;
	private String color;
	private String model;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTires() {
		return tires;
	}

	public void setTires(String tires) {
		this.tires = tires;
	}

	public String getSensorDarts() {
		return sensorDarts;
	}

	public void setSensorDarts(String sensorDarts) {
		this.sensorDarts = sensorDarts;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public void startEngine() {
		System.out.println("The engine i start");
	}

	public void printCurrentSpeed() {

		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
