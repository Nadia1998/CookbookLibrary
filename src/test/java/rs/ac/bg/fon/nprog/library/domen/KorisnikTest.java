package rs.ac.bg.fon.nprog.library.domen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KorisnikTest {

	public Korisnik k;

	@BeforeEach
	public void setUp() throws Exception {
		k = new Korisnik(1, "Ana", "Jankovic", "y", "y");
	}

	@AfterEach
	public void tearDown() throws Exception {
		k = null;
	}

	@Test
	public void testKorisnik() {
		k = new Korisnik();
		assertNotNull(k);
	}

	@Test
	public void testKorisnikLongStringStringStringString() {
		k = new Korisnik(1, "Ana", "Jankovic", "y", "y");

		assertNotNull(k);
		assertEquals(1, k.getKorisnikId());
		assertEquals("Ana", k.getIme());
		assertEquals("Jankovic", k.getPrezime());
		assertEquals("y", k.getKorisnickoIme());
		assertEquals("y", k.getLozinka());

	}

	@Test
	public void testSetKorisnikId() {
		k.setKorisnikId(1);
		assertEquals(1, k.getKorisnikId());
	}

	@Test
	public void testSetIme() {
		k.setIme("Ana");
		assertEquals("Ana", k.getIme());
	}

	@Test
	public void testSetPrezime() {
		k.setPrezime("Jankovic");
		assertEquals("Jankovic", k.getPrezime());
	}
	
	@Test
	public void testSetKorisnickoIme() {
		k.setLozinka("y");
		assertEquals("y", k.getLozinka());

	}

	@Test
	public void testSetLozinka() {
		k.setLozinka("y");
		assertEquals("y", k.getLozinka());

	}



}
