/**
 * clase amb la configuracio del game
 * @author Raul
 * @version v0.2
 */
public class ConfigGame {
    private String username;
    private int numRunners;
    private int numTracks;

    /**
     * retorna el numero de Tracks
     * @return int
     */
    public int getNumTracks() {
        return numTracks;
    }

    /**
     * asigna un valor a numTracks
     * @param numTracks  numero de tracks
     */
    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    /**
     * asigna els valors per default
     */
    public ConfigGame() {
        numRunners = 5;
        numTracks = 3;
        username = "player";
    }

    /**
     * introdueix el nom del usuari
     * @param username nom del usuari
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * retorna el nom del usuari
     * @return String
     */
    public String getUserName() {
        return username;
    }

    /**
     * retorna el numeor de Runners
     * @return int
     */
    public int getNumRunners() {
        return numRunners;
    }

    /**
     * asigna el numero de Runners
     * @param numRunners numero de runners
     */
    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }


    /**
     * retorna la configuracio
     * sobrecàrrega que hereta de la classe Object
     * @return String
     */
    public String toString() {
        return "ConfigGame{" +
                "username='" + username + '\'' +
                ", numRunners=" + numRunners +
                ", numTracks=" + numTracks +
                '}';
    }
}
