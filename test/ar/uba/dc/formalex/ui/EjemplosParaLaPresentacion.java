package ar.uba.dc.formalex.ui;

import org.junit.Test;

import ar.uba.dc.formalex.fl.Formalex;
import ar.uba.dc.formalex.fl.regulation.formula.LTLTranslationType;
import ar.uba.dc.formalex.fl.utils.FlTest;

/**
 * Incluí ejemplos que se van a usar en la presentación
 * @author cfaciano
 *
 */
public class EjemplosParaLaPresentacion extends FlTest {

	private static final String EJ_PARA_LA_PRESENTACION_TXT = "ejParaLaPresentacion.txt";

	@Test
	public void conFiltrado() throws Exception {
		
		Formalex.run(ROOT_RESOURCES + "ejParaLaPresentacionLenguajeFl.txt", CORRER_CON_MODEL_CHECKER , CORRER_CON_FILTRADO, false, LTLTranslationType.WITH_JH);
	}
	
	
	/******************* EJS para el REDUCTOR y el REEMPLAZO DE JH **********/
	@Test
	public void conFiltradoSinReductor() throws Exception {
		
		Formalex.run(ROOT_EJS_PARA_EL_REDUCTOR + EJ_PARA_LA_PRESENTACION_TXT, CORRER_CON_MODEL_CHECKER , CORRER_CON_FILTRADO, false, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void conFiltradoConReductor() throws Exception {
		
		Formalex.run(ROOT_EJS_PARA_EL_REDUCTOR + EJ_PARA_LA_PRESENTACION_TXT, CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, true, LTLTranslationType.WITH_JH);
	}
	
	@Test
	public void conFiltradoSinReductorConReemplazoDeJH() throws Exception {
		
		Formalex.run(ROOT_EJS_PARA_EL_REDUCTOR + EJ_PARA_LA_PRESENTACION_TXT, CORRER_CON_MODEL_CHECKER, CORRER_CON_FILTRADO, true, LTLTranslationType.WITH_NEXT_FOR_JH);
	}
	
}
