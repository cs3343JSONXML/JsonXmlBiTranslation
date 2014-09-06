package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import component.Translator;

public class TestTranslator {

	@Test
	public void test() {
	 Translator translator = new Translator();
	 try{
		 translator.main(null);
	 }catch(Exception e){
		 
		 e.printStackTrace();
	 }
	}

}
