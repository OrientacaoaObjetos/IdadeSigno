

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestePessoa {

	@Test
	public void test() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Pessoa pessoa = null;
		try {
			pessoa = new Pessoa(sdf.parse("03/01/1988"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getSigno());
	}

}
