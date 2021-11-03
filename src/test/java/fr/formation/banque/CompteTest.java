package fr.formation.banque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CompteTest {

	//reference de l'objet à tester
	private Compte compte;
	
	@Before
	public void setup() {
		//creer l'objet à tester
		compte = new Compte(45654,1234,"blabl@bla.fr");
		
		
	}
	
	@Test 
	public void testGetNumero() {
		assertEquals(45654, compte.getNumero());	
	}
	
	@Test
	public void testSetNumero() {
		compte.setNumero(123456);
		assertEquals(123456, compte.getNumero());
	}
	
	@Test
	public void testGetSolde() {
		assertEquals(1234, compte.getSolde(),0);
	}
	
	
	@Test
	public void testSetSolde() {
		
		compte.setSolde(11123);;
		assertEquals(11123, compte.getSolde(),0);
	}
	
	
	@Test
	public void testGetReferenceClient() {
		assertEquals("blabl@bla.fr", compte.getReferenceClient());
		
	}
	
	@Test
	public void testSetReferencelient() {
		compte.setReferenceClient("lalala");
		assertEquals("lalala", compte.getReferenceClient());
	}
	
	@Test
	public void testCompte(){
		//test du constructeur sans parametre
		Compte compte2 = new Compte();
		assertNotNull(compte2);
		
	}
	
	@Test
	public void testCompteParam(){
		//test du constructeur sans parametre
		Compte compte3 = new Compte(4533654,11234,"blablbla.fr");
		assertNotNull(compte3);
		assertEquals(4533654, compte3.getNumero());
		assertEquals(11234, compte3.getSolde(),0);
		assertEquals("blablbla.fr", compte3.getReferenceClient());
		
	}
	
}
