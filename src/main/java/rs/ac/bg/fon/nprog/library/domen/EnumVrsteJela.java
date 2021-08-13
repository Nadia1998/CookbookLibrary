package rs.ac.bg.fon.nprog.library.domen;

import java.io.Serializable;

/**
 *
 * Klasa koja predstavlja vrstu jela iz recepta kao enumeracija.
 *
 * @author Nadia
 */
public enum EnumVrsteJela implements Serializable {
    /**
      * Predjelo kao vrsta jela.
      */
	PREDJELO,
   /**
	 * Supa kao vrsta jela.
	 */
	SUPA, 
   /**
	 * Glavno jelo kao vrsta jela.
	 */
	GLAVNO_JELO, 
   /**
	 * Prilog kao vrsta jela.
     */
	PRILOG, 
   /**
	 * Predjelo kao vrsta jela.
	 */
	SALATA, 
   /**
	 * Desert kao vrsta jela.
	 */
	DESERT, 
   /**
	 * Hleb kao vrsta jela.
	 */
	HLEB, 
   /**
	 * Pecivo kao vrsta jela.
	 */
	PECIVO;
	/**
     * Pretvara enum u String.
     * 
     * @return String Vraca vrstu jela kao String.
     * 
     */
	@Override
	public String toString() {

		switch (this) {
		case PREDJELO:
			return "predjelo";
		case SUPA:
			return "supa";
		case GLAVNO_JELO:
			return "glavno jelo";
		case PRILOG:
			return "prilog";
		case SALATA:
			return "salata";
		case DESERT:
			return "desert";
		case HLEB:
			return "hleb";
		case PECIVO:
			return "pecivo";
		default:
			return "N/A";
		}
	}
	 /**
     * Pretvara String koji predstavlja vrstu jela u enum.
     *
     * @param vrsta Vrsta jela kao String.
     * 
     * @return EnumVrstaJela Vraca vrstu jela kao EnumVrstaJela.
     */
	public static EnumVrsteJela fromStringToEnum(String vrsta) {
		switch (vrsta) {
		case "predjelo":
			return PREDJELO;
		case "supa":
			return SUPA;
		case "glavno jelo":
			return GLAVNO_JELO;
		case "prilog":
			return PRILOG;
		case "salata":
			return SALATA;
		case "desert":
			return DESERT;
		case "hleb":
			return HLEB;
		case "pecivo":
			return PECIVO;
		default:
			return null;
		}
	}

}
