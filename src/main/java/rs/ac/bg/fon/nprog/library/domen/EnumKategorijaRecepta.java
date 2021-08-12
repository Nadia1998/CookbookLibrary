package rs.ac.bg.fon.nprog.library.domen;


import java.io.Serializable;

/**
 *
 * @author Nadia
 */
public enum EnumKategorijaRecepta implements Serializable {

    GOVEDINA, JAGNJETINA, SVINJETINA, RIBA, POVRCE, SALATA, KOLACI, PIZZA, PASTA, MUSAKA, RIBA_I_MORSKI_PLODOVI, TRADICIONALNA_KUHINJA;

    @Override
    public String toString() {
        switch (this) {
            case GOVEDINA:
                return "govedina";
            case JAGNJETINA:
                return "jagnjetina";
            case SVINJETINA:
                return "svinjetina";
            case RIBA:
                return "riba";
            case POVRCE:
                return "povrće";
            case SALATA:
                return "salata";
            case KOLACI:
                return "kolači";
            case PIZZA:
                return "pizza";
            case PASTA:
                return "pasta";
            case MUSAKA:
                return "musaka";
            case RIBA_I_MORSKI_PLODOVI:
                return "riba i morski plodovi";
            case TRADICIONALNA_KUHINJA:
                return "tradicionalna kuhinja";
            default:
                return "N/A";
        }
    }
        
    /**
     *
     * @param kategorija
     * @return
     */
    public static EnumKategorijaRecepta fromStringToEnum(String kategorija) {
        switch (kategorija) {
            case "govedina":
                return GOVEDINA;
            case "jagnjetina":
                return JAGNJETINA;
            case "svinjetina":
                return SVINJETINA;
            case "riba":
                return RIBA;
            case "povrće":
                return POVRCE;
            case "salata":
                return SALATA;
            case "kolači":
                return KOLACI;
            case "pizza":
                return PIZZA;
            case "pasta":
                return PASTA;
            case "musaka":
                return MUSAKA;
            case "riba i morski plodovi":
                return RIBA_I_MORSKI_PLODOVI;
            case "tradicionalna kuhinja":
                return TRADICIONALNA_KUHINJA;
            default:
                return null;
        }
    }


}
