package rs.ac.bg.fon.nprog.library.domen;

import java.io.Serializable;

/**
 * Klasa koja predstavlja moguce nivoe tezine recepta kao enumeracija.
 *
 * @author Nadia
 */
public enum EnumNivoTezine implements Serializable{
	/**
	 * pocetnicko kuvanje.
	 */
    POCETNICKO,
    /**
	 * hobby kuvanje.
	 */
    HOBBY_KUVANJE, 
    /**
	 * profesionalno kuvanje.
	 */
    PROFESIONALNO;
	/**
     * Pretvara enum u String.
     * 
     * @return String Vraca nivo tezine recepta kao String.
     * 
     */
    @Override
    public String toString() {
        switch (this) {
            case POCETNICKO:
                return "pocetnicko";
            case HOBBY_KUVANJE:
                return "hobby kuvanje";
            case PROFESIONALNO:
                return "profesionalno";
            default:
                return "N/A";

        }

    }
    
    /**
     * Pretvara String koji predstavlja nivo tezine recepta u enum.
     *
     * @param nivo Nivo tezine recepta kao String.
     * 
     * @return EnumNivoTezine Vraca nivo tezine recepta recepta kao EnumNivoTezine.
     */
    public static EnumNivoTezine fromStringToEnum(String nivo){
        switch (nivo) {
            case "pocetnicko":
                return POCETNICKO;
            case "hobby kuvanje":
                return HOBBY_KUVANJE;
            case "profesionalno":
                return PROFESIONALNO;
            default:
                return null;

        }
    }
}
