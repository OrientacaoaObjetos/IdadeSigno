

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class TestePessoa {

	@Test
	public void signoCapricornio() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa	pessoa = new Pessoa(sdf.parse("03/01/1988"));
		assertEquals("Capricórnio", pessoa.getSigno());
	}
	
	@Test
	public void signoSargitario() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa	pessoa = new Pessoa(sdf.parse("16/12/19991"));
		assertEquals("Sargitário", pessoa.getSigno());
	}
	
	@Test
	public void signoTouro() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa	pessoa = new Pessoa(sdf.parse("02/05/19991"));
		assertEquals("Touro", pessoa.getSigno());
	}
	
	@Test
	public void idade28anos() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa pessoa = new Pessoa(sdf.parse("03/01/1988"));
		assertEquals(28L, pessoa.getIdade().longValue());
	}
	
	@Test
	public void idade25anos() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa pessoa = new Pessoa(sdf.parse("02/05/1991"));
		assertEquals(25L, pessoa.getIdade().longValue());
	}
	
	@Test
	public void idade20anos() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa pessoa = new Pessoa(sdf.parse("18/03/1996"));
		assertEquals(20L, pessoa.getIdade().longValue());
	}

}
