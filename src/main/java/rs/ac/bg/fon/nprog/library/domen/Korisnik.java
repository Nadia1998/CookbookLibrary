package rs.ac.bg.fon.nprog.library.domen;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * Klasa koja predstavlja korisnika aplikacije Cookbook .
 * 
 * Korisnik ima id kao long i ime,prezime, korisnicko ime i lozinku kao String vrednost.
 *
 * @author Nadia
 */
public class Korisnik implements Serializable{
	/**
	 * korisnikID kao long vrednost.
	 */
    private long korisnikId;
    /**
	 * ime kao String vrednost.
	 */
    private String ime;
    /**
	 * prezime kao String vrednost.
	 */
    private String prezime;
    /**
	 * korisnickoIme kao String vrednost.
	 */
    private String korisnickoIme;
    /**
	 * lozinka kao String vrednost.
	 */
    private String lozinka;
    
    /**
     * Konstruktor koji inicijalizuje objekat i nista vise.
     */
    public Korisnik() {
    }
    /**
     * Konstruktor koji inicijalizuje objekat i postavlja vrednosti korisnikID,ime, prezime, korisnickoIme i lozinka na nove vrednosti.
     * 
     * @param korisnikId Id korisnika kao long.
     * @param ime Ime korisnika kao String vrednost.
     * @param prezime Prezime korisnika kao String vrednost.
     * @param korisnickoIme Korisnicko ime korisnika kao String vrednost.
     * @param lozinka Lozinka korisnika kao String vrednost.
     */
    public Korisnik(long korisnikId, String ime, String prezime, String korisnickoIme, String lozinka) {
        this.korisnikId = korisnikId;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }
    
    /**
     * Vraca id korisnika.
     * 
     * @return korisnikId Korisnika kao long vrednost.
     */
    public long getKorisnikId() {
        return korisnikId;
    }
    /**
     * Postavlja id korisnika na novu vrednost.
     * 
     * @param korisnikId Id korisnika kao long vrednost.
     */
    public void setKorisnikId(long korisnikId) {
        this.korisnikId = korisnikId;
    }
    /**
     * Vraca ime korisnika.
     * 
     * @return ime Ime korisnika kao String vrednost.
     */
    public String getIme() {
        return ime;
    }
    /**
     * Postavlja ime korisnika na novu vrednost.
     * 
     * @param ime Ime korisnika kao String vrednost.
     * 
     * @throws java.lang.RuntimeException ukoliko je ime prazan string.
     * @throws java.lang.NullPointerException ukoliko je ime null.
     */
    public void setIme(String ime) {
    	if(ime==null) {
    		throw new NullPointerException("Ime ne sme biti null.");
    	}
    	if(ime.isEmpty()) {
    		throw new RuntimeException("Ime ne sme biti prazan string.");
    	}
        this.ime = ime;
    }
    /**
     * Vraca prezime korisnika.
     * 
     * @return prezime Prezime korisnika kao String vrednost.
     */
    public String getPrezime() {
        return prezime;
    }
    /**
     * Postavlja prezime korisnika na novu vrednost.
     * 
     * @param prezime Prezime korisnika kao String vrednost.
     * 
     * @throws java.lang.RuntimeException ukoliko je prezime prazan string.
     * @throws java.lang.NullPointerException ukoliko je prezime null.
     */
    public void setPrezime(String prezime) {
    	if(prezime==null) {
    		throw new NullPointerException("Prezime ne sme biti null.");
    	}
    	if(prezime.isEmpty()) {
    		throw new RuntimeException("Prezime ne sme biti prazan string.");
    	}
        this.prezime = prezime;
    }
    /**
     * Vraca korisnicko ime korisnika.
     * 
     * @return korisnickoIme Korisnicko ime korisnika kao String vrednost.
     */
    public String getKorisnickoIme() {
        return korisnickoIme;
    }
    /**
     * Postavlja korisnicko ime korisnika na novu vrednost.
     * 
     * @param korisnickoIme Korisnicko ime korisnika kao String vrednost.
     * 
     * @throws java.lang.RuntimeException ukoliko je korisnicko ime prazan string.
     * @throws java.lang.NullPointerException ukoliko je korisnicko ime null.
     */
    public void setKorisnickoIme(String korisnickoIme) {
    	if(korisnickoIme==null) {
    		throw new NullPointerException("Korisnicko ime ne sme biti null.");
    	}
    	if(korisnickoIme.isEmpty()) {
    		throw new RuntimeException("Korisnicko ime ne sme biti prazan string.");
    	}
        this.korisnickoIme = korisnickoIme;
    }
    /**
     * Vraca lozinku korisnika.
     * 
     * @return lozinka Lozinka korisnika kao String vrednost.
     */
    public String getLozinka() {
        return lozinka;
    }
    /**
     * Postavlja lozinku korisnika na novu vrednost.
     * 
     * @param lozinka Lozinka korisnika kao String vrednost.
     * 
     * @throws java.lang.RuntimeException ukoliko je lozinka prazan string.
     * @throws java.lang.NullPointerException ukoliko je lozinka null.
     */
    public void setLozinka(String lozinka) {
    	if(lozinka==null) {
    		throw new NullPointerException("Lozinka ne sme biti null.");
    	}
    	if(lozinka.isEmpty()) {
    		throw new RuntimeException("Lozinka ne sme biti prazan string.");
    	}
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Korisnik other = (Korisnik) obj;
        if (this.korisnikId != other.korisnikId) {
            return false;
        }
        return true;
    }

}
