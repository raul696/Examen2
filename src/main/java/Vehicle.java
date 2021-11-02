/**
 * Vehicle es una clase que conte la celocitat maxima i un pilot
 * @author Raul
 * @version v0.2
 */
public abstract class Vehicle {
	private int velocitatMAX;
	private Pilot pilot;

	/**
	 * constructor del vehicle
	 * @param vel
	 */
	public Vehicle(int vel) {
		velocitatMAX = vel;
	}

	/**
	 * @deprecated "tipus" en desús
	 * @return
	 */
	//public Vehicle(int vel, int tipus) {
	//	velocitatMAX = vel;
	//}

	/**
	 * reotrna el pilot
	 * @return
	 */
	public Pilot getPilot() {
		return pilot;
	}

	/**
	 * asigan un valor a pilot
	 * @param pilot
	 */
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	/**
	 * retorna la velocitat maxima
	 * @return
	 */
	public int getVelocitatMAX() {
		return velocitatMAX;
	}

	/**
	 * asigna un valor a la velocitat maxima
	 * @param velocitatMAX
	 */
	public void setVelocitatMAX(int velocitatMAX) {
		this.velocitatMAX = velocitatMAX;
	}
}
