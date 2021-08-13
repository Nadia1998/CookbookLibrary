package rs.ac.bg.fon.nprog.library.domen;

	import java.io.Serializable;

	/**
	 * Klasa koja predstavlja moguce vreme pripreme recepta kao enumeracija.
     *
	 * @author Nadia
	 */
	public enum EnumVremePripreme implements Serializable {
        /**
         * brzo se priprema.
         */
	    BRZO,
	    /**
	     * Srednje brzo se priprema.
	     */
	    SREDNJE_BRZO,
	    /**
	     * Priprema zahteva vreme.
	     */
	    ZAHTEVA_VREME;
		/**
	     * Pretvara enum u String.
	     * 
	     * @return String Vraca vreme pripreme recepta kao String.
	     * 
	     */
	    @Override
	    public String toString() {
	        switch (this) {
	            case BRZO:
	                return "brzo";
	            case SREDNJE_BRZO:
	                return "srednje brzo";
	            case ZAHTEVA_VREME:
	                return "zahteva vreme";
	            default:
	                return "N/A";
	        }
	    }
	    /**
	     * Pretvara String koji predstavlja vreme pripreme recepta u enum.
	     *
	     * @param vreme Vreme pripreme recepta kao String.
	     * 
	     * @return EnumVremePripreme Vraca vreme pripreme recepta kao EnumVremePripreme.
	     */
	    public static EnumVremePripreme fromStringToEnum(String vreme) {
	        switch (vreme) {
	            case "brzo":
	                return BRZO;
	            case "srednje brzo":
	                return SREDNJE_BRZO;
	            case "zahteva vreme":
	                return ZAHTEVA_VREME;
	            default:
	                return null;
	        }
	    }

	}


