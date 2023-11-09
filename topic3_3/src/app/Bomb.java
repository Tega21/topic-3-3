// Brandon Ortega// CST-239// 11.05,2023// I used code from the activity guide given to us

package app;

/**
 * Bomb class represents a weapon thats a bomb
 * Exntends Weapon class with specific implementation for bomb
 */
public class Bomb implements WeaponInterface{
	 /**
     * Fires the bomb with the specified power.
     * 
     * @param power the intensity of the bomb's explosion
     */
    public void fireWeapon(int power){
        System.out.println("In Bomb.fireWeapon() with a power of " + power);
    }
    
    /**
     * Overloaded method with no parameters which fires the bomb with a default power.
     */
    public void fireWeapon(){
        System.out.println("In overloaded Bomb.fireWeapon()");        
    }
    
    /**
     * Activates or deactivates the bomb.
     * 
     * @param enable true to activate, false to deactivate
     */
    
	@Override
	public void activate(boolean enable) {
		System.out.println("In the Bomb.activate() with an enable of " + enable);
	}
}
