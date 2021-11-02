import java.util.Date;

/**
 * conte les dades dels pilots i el punts que te
 * @author Raul
 * @version v0.2
 */
public class Pilot {
	private String nom;
	private int nivell;
	private int punts;

	/**
	 * constructor de Pilot
	 * @param nom
	 */
	public Pilot(String nom) {
		this.nom = nom;
	}

	/**
	 * ara tractem els punts de forma diferent
	 * @deprecated
	 * @return
	 */
	//public Pilot(String punts) {
	//	this.punts = punts;
	//}

	/**
	 * retorna el nom del pilot
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * retorna els punts del pilot
	 * @return
	 */
	public int getPunts() {
		return punts;
	}

	/**
	 * introdueix els punts al pilot
	 * @param punts
	 */
	public void setPunts(int punts) {
		this.punts = punts;
	}

	/**
	 * augmente els punts del pilot en p
	 * @param p
	 */
	public void addPunts(int p) {
		punts += p;
	}

	/**
	 * sobrecàrrega que hereta de la classe Object
	 * retorna els valors del pilot com a string
	 * @return
	 */
	public String toString() {
		return "Pilot{" +
				"nom='" + nom + '\'' +
				", punts=" + punts +
				'}';
	}
}
