package com.Interface;

public class NewCar {
	
	private Engine engine;
	private Media player = new MusicPlayer();
	
	public NewCar() 
	{
		engine = new PowerEngine();
	}

	public NewCar(Engine engine) 
	{
		this.engine = engine;
	}
	
	public void startEngine() 
	{
		engine.start();
	}
	
	public void stopEngine() 
	{
		engine.stop();
	}
	
	public void startMusic()
	{
		player.start();
	}
	
	public void stopMusic()
	{
		player.stop();
	}
	
	public void updateEngine(Engine engine) 
	{
		this.engine = engine;
	}
}
