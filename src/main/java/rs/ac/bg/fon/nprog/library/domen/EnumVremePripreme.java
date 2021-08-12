package rs.ac.bg.fon.nprog.library.domen;

	import java.io.Serializable;

	/**
	 *
	 * @author Nadia
	 */
	public enum EnumVremePripreme implements Serializable {

	    BRZO, SREDNJE_BRZO, ZAHTEVA_VREME;

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


