// Brandon Ortega// CST-239// 11.05,2023// I used code from the activity guide given to us
package app;

/**
* Main class to simulate a game using weapons.
* It demonstrates the usage of Weapon, Bomb, and Gun classes.
*/
public class Game {
	
	public static void fireWeapon(WeaponInterface weapon) {
		if(weapon instanceof Bomb) {
			System.out.println("----------> I am a Bomb");
		}
		
		weapon.activate(true);
		weapon.fireWeapon(5);
	}
	
	/**
     * Main method to run the game simulation.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
    	
    	WeaponInterface[] weapon = new WeaponInterface[2];
    	weapon[0] = new Bomb();
    	weapon[1] = new Gun();
    	
    	// For loop for all weapons fire them
    	for(int i = 0; i < weapon.length; i++) {
    		fireWeapon(weapon[i]);
    	}
        
    }
}
