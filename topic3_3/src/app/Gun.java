// Brandon Ortega// CST-239// 11.05,2023// I used code from the activity guide given to us

package app;

/**
 * Class representing a gun
 * Also extends Weapon class that has special implementation
 */
public class Gun implements WeaponInterface {
	
	/**
     * Fires the gun with the specified power.
     * 
     * @param power the intensity of the gun's shot
     */
    public void fireWeapon(int power) {
        System.out.println("In Gun.fireWeapon() with a power of " + power);
    }
    
    /**
     * Overloaded method with no parameters which fires the gun with a default power.
     */
    public void fireWeapon(){
        System.out.println("In overloaded Gun.fireWeapon()");        
    }
    
    /**
     * Activates or deactivates the gun.
     * 
     * @param enable true to activate, false to deactivate
     */
	@Override
	public void activate(boolean enable) {
		System.out.println("In the Gun.activate() with an enable of " + enable);
		
	}
}
