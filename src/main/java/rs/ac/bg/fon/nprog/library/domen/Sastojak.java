package rs.ac.bg.fon.nprog.library.domen;

import java.io.Serializable;

/**
 *
 * Klasa koja predstavlja sastojak koji sadrzi jedan recept.
 * 
 * Sastojak sadrzi id, nazic, kolicinu, meru i instancu klase Recept kom pripada.
 * 
 * @author Nadia
 */
public class Sastojak implements Serializable {
	/**
	 * Id sastojka kao int.
	 */
    private int sastojakId;
    /**
     * Naziv sastojka kao String.
     */
    private String naziv;
    /**
     * Kolicina sastojka kao int.
     */
    private int kolicina;
    /**
     * Mera sastojka kao EnumMera.
     */
    private EnumMera mera;
    /**
     * Recept kom sastojak pripada kao Recept.
     */
    private Recept recept;
    /**
     * Konstruktor koji inicijalizuje objekat i nista vise.
     */
    public Sastojak() {
    }
    /**
     * Konstruktor koji inicijalizuje objekat i postavlja vrednosti .
     * 
     * @param sastojakId Id sastojka kao int vrednost.
     * @param naziv Naziv sastojka kao String vrednost.
     * @param kolicina Kolicina sastojka kao int vrednost.
     * @param mera Mera sastojka kao EnumMera.
     * @param recept Recept kom pripada sastojak kao Recept.
     * 
     */
    public Sastojak(int sastojakId, String naziv, int kolicina, EnumMera mera, Recept recept) {
        this.sastojakId = sastojakId;
        this.naziv = naziv;
        this.kolicina = kolicina;
        this.mera = mera;
        this.recept = recept;
    }
    /**
     * Vraca id sastojka.
     * 
     * @return receptId Id sastojka kao int vrednost.
     */
    public int getSastojakId() {
        return sastojakId;
    }
    /**
     * Vraca naziv sastojka.
     * 
     * @return naziv Naziv sastojka kao String vrednost.
     */
    public String getNaziv() {
        return naziv;
    }
    /**
     * Vraca kolicinu sastojka.
     * 
     * @return kolicina Kolicina sastojka kao int vrednost.
     */
    public int getKolicina() {
        return kolicina;
    }
    /**
     * Vraca meru sastojka.
     * 
     * @return mera Mera sastojka kao EnumMera vrednost.
     */
    public EnumMera getMera() {
        return mera;
    }
    /**
     * Vraca recept.
     * 
     * @return recept Recept kao Recept.
     */
    public Recept getRecept() {
        return recept;
    }
    /**
     * Postavlja id sastojka na novu vrednost.
     * 
     * @param sastojakId Id sastojka kao int.
     */
    public void setSastojakId(int sastojakId) {
        this.sastojakId = sastojakId;
    }
    /**
     * Postavlja naziv sastojka na novu vrednost.
     * 
     * @param naziv Naziv sastojka kao String.
     * 
     * @throws java.lang.NullPointerException ukoliko je naziv sastojka null.
     * @throws java.lang.RuntimeException ukoliko je naziv sastojka prazan string.
     */
    public void setNaziv(String naziv) {
    	if(naziv==null) {
    		throw new NullPointerException("Naziv ne sme biti null.");
    	}
    	if(naziv.isEmpty()) {
    		throw new RuntimeException("Naziv ne sme biti prazan string.");
    	}
        this.naziv = naziv;
    }
    /**
     * Postavlja kolicinu sastojka na novu vrednost.
     * 
     * @param kolicina Kolicina sastojka kao int.
     */
    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
    /**
     * Postavlja meru sastojka na novu vrednost.
     *@param mera Mera kao EnumMera.
     *@throws java.lang.NullPointerException ukoliko je enum mera sastojka null.
     *
     */
    public void setMera(EnumMera mera) {
    	if(mera==null) {
    		throw new NullPointerException("Enum mera ne sme biti null.");
    	}
    	
        this.mera = mera;
    }
    /**
     * Postavlja recept sastojka na novu vrednost.
     * 
     * @param recept Recept kao Recept.
     */
    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    @Override
    public String toString() {
        return naziv+" "+mera+" "+kolicina+" ";

    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sastojak other = (Sastojak) obj;
        if (this.sastojakId != other.sastojakId) {
            return false;
        }
        return true;
    }

}

