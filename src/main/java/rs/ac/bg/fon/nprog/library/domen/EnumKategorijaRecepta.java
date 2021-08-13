package rs.ac.bg.fon.nprog.library.domen;


import java.io.Serializable;

/**
 * Klasa koja predstavlja moguce kategorije recepta kao enumeracija.
 *
 * @author Nadia
 */
public enum EnumKategorijaRecepta implements Serializable {
   /**
    * govedina kao kategorija jela.
    */
    GOVEDINA, 
    /**
     * jagnjetina kao kategorija jela.
     */
    JAGNJETINA,
    /**
     * svinjetina kao kategorija jela.
     */
    SVINJETINA, 
    /**
     * riba kao kategorija jela.
     */
    RIBA, 
    /**
     * povrce kao kategorija jela.
     */
    POVRCE, 
    /**
     * salata kao kategorija jela.
     */
    SALATA,
    /**
     * kolaci kao kategorija jela.
     */
    KOLACI,
    /**
     * pizza kao kategorija jela.
     */
    PIZZA,
    /**
     * pasta kao kategorija jela.
     */
    PASTA,
    /**
     * musaka kao kategorija jela.
     */
    MUSAKA,
    /**
     * riba i morski plodovi kao kategorija jela.
     */
    RIBA_I_MORSKI_PLODOVI,
    /**
     * tradicionalna kuhinja kao kategorija jela
     */
    TRADICIONALNA_KUHINJA;
	
	/**
     * Pretvara enum u String.
     * 
     * @return String Vraca kategoriju recepta kao String.
     * 
     */
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
                return "kolaci";
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
     * Pretvara String koji predstavlja kategoriju recepta u enum.
     *
     * @param kategorija Kategorija recepta kao String.
     * 
     * @return EnumKategorijaRecepta Vraca kategoriju recepta kao EnumKategorijaRecepta.
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
            case "kolaci":
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
