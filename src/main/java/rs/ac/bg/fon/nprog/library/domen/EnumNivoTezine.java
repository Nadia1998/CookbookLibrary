package rs.ac.bg.fon.nprog.library.domen;

import java.io.Serializable;

/**
 *
 * @author Nadia
 */
public enum EnumNivoTezine implements Serializable{

    POCETNICKO, HOBBY_KUVANJE, PROFESIONALNO;

    @Override
    public String toString() {
        switch (this) {
            case POCETNICKO:
                return "početničko";
            case HOBBY_KUVANJE:
                return "hobby kuvanje";
            case PROFESIONALNO:
                return "profesionalno";
            default:
                return "N/A";

        }

    }
    public static EnumNivoTezine fromStringToEnum(String nivo){
        switch (nivo) {
            case "početničko":
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
