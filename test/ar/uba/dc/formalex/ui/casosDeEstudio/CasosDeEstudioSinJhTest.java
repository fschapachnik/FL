package ar.uba.dc.formalex.ui.casosDeEstudio;

import org.junit.Test;

import ar.uba.dc.formalex.fl.regulation.formula.LTLTranslationType;
import ar.uba.dc.formalex.fl.utils.FlTest;
import ar.uba.dc.formalex.fl.utils.TestUtils;

public class CasosDeEstudioSinJhTest extends FlTest {

	private static final String ROOT_CDE_REDUCTOR = ROOT_RESOURCES + "CasosDeEstudioReductor/";

	/*  Ejs con reductor tienen menos JH en la formula                         */
	@Test
	public void casoDeEstudioVipMemberPassConTresPps() throws Exception {
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "casoDeEstudioVipMemberPassConTresPps.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_NEXT_FOR_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas1WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio1NroDeClausulas1WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas5WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio1NroDeClausulas5WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas15WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio1NroDeClausulas15WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas25WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio1NroDeClausulas25WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas60WithDefaultIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio1NroDeClausulas60.txt", FlTest.CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}

	@Test
	public void testCasoDeEstudio2NroDeClausulas1WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio2NroDeClausulas1WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio2NroDeClausulas5WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio2NroDeClausulas5WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio2NroDeClausulas15WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio2NroDeClausulas15WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio2NroDeClausulas25WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio2NroDeClausulas25WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio2NroDeClausulas28WithDefaultIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio2NroDeClausulas28.txt", FlTest.CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas1WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio3NroDeClausulas1WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_NEXT_FOR_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas5WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio3NroDeClausulas5WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas15WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio3NroDeClausulas15WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas25WithIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(ROOT_CDE_REDUCTOR + "CasoDeEstudio3NroDeClausulas25WithIsHappening.txt", CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
		
	@Test
	public void testCasoDeEstudio3NroDeClausulas32WithDefaultIsHappening() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio3NroDeClausulas32.txt", FlTest.CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, CORRER_CON_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	/*  Ejs sin reductor tienen más JH en la formula                         */
	
	@Test
	public void testCasoDeEstudioVipMemberPass() throws Exception  {
		//Este ejemplo tiene un PP con excepcion
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "casoDeEstudioVipMemberPass.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudioVipMemberPassFull() throws Exception  {
		//Este ejemplo tiene dos PP con excepcion
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "casoDeEstudioVipMemberPassFull.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas1() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio1NroDeClausulas1.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas5() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio1NroDeClausulas5.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas15() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio1NroDeClausulas15.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio1NroDeClausulas25() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio1NroDeClausulas25.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
		
	@Test
	public void testCasoDeEstudio1NroDeClausulas60() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio1NroDeClausulas60.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
		
	@Test
	public void testCasoDeEstudio2NroDeClausulas1() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio2NroDeClausulas1.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio2NroDeClausulas5() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio2NroDeClausulas5.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio2NroDeClausulas15() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio2NroDeClausulas15.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio2NroDeClausulas25() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio2NroDeClausulas25.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
		
	@Test
	public void testCasoDeEstudio2NroDeClausulas28() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio2NroDeClausulas28.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas1() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio3NroDeClausulas1.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_NEXT_FOR_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas5() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio3NroDeClausulas5.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas15() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio3NroDeClausulas15.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void testCasoDeEstudio3NroDeClausulas25() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio3NroDeClausulas25.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	@Test
	public void testCasoDeEstudio3NroDeClausulas32() throws Exception  {
		
		TestUtils.corridaDeFormaLex(FlTest.ROOT_CDE_FILTRADO + "CasoDeEstudio3NroDeClausulas32.txt", FlTest.CORRER_CON_MODEL_CHECKER, true, CORRER_SIN_REDUCTOR, LTLTranslationType.WITH_JH);
	}
	
	
}
