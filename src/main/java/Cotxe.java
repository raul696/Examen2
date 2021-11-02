/**
 * clase qeu conte la informacio dels cotxes
 * @author Raul
 * @version v0.2
 */
public class Cotxe extends Vehicle {
	private String Marca;
	private String Model;

	/**
	 * constructor de l'objecte Cotxe
	 * @param vel velocitat dle cotxe
	 */
	public Cotxe(int vel) {
		super(vel);
	}

	/**
	 * retorna la marca del cotxe
	 * @return String
	 */
	public String getMarca() {
		return Marca;
	}

	/**
	 * asigan un valor a marca
	 * @param marca marca del cotxe
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}

	/**
	 * retorna el model
	 * @return String
	 */
	public String getModel() {
		return Model;
	}

	/**
	 * asigna el model
	 * @param model modle del cotxe
	 */
	public void setModel(String model) {
		Model = model;
	}



}
