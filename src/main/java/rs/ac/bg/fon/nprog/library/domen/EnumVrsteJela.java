package rs.ac.bg.fon.nprog.library.domen;

import java.io.Serializable;

/**
 *
 * @author Nadia
 */
public enum EnumVrsteJela implements Serializable {

	PREDJELO, SUPA, GLAVNO_JELO, PRILOG, SALATA, DESERT, HLEB, PECIVO;

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
