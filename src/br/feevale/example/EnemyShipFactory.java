package br.feevale.example;

import br.feevale.example.abstracts.EnemyShip;
// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

/**
 * @author Ricardo Machado
 *
 */
public class EnemyShipFactory{
	
	// This could be used as a static method if we
	// are willing to give up subclassing it
	
	/**
	 * @param newShipType
	 * @return
	 */
	public EnemyShip makeEnemyShip(String newShipType){
		
		if (newShipType.equals("U")){
			
			return new UFOEnemyShip();
			
		} else 
		
		if (newShipType.equals("R")){
			
			return new RocketEnemyShip();
			
		} else 
		
		if (newShipType.equals("B")){
			
			return new BigUFOEnemyShip();
			
		} else return null;
		
	}
	
}