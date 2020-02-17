package helpers;

import java.util.Random;

import org.testng.annotations.DataProvider;

public class SetDatos {
	public static String[] generateRandomWords(int numberOfWords)
	{
	    String[] randomStrings = new String[numberOfWords];
	    Random random = new Random();
	    for(int i = 0; i < numberOfWords; i++)
	    {
	        char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
	        for(int j = 0; j < word.length; j++)
	        {
	            word[j] = (char)('a' + random.nextInt(26));
	        }
	        randomStrings[i] = new String(word);
	    }
	    return randomStrings;
	}
	
	@DataProvider(name = "Set_Datos_Test_EBAY04")
	public Object[][] getData() {
		Object[][]data = new Object[1][6];
		//Usuario
		data[0][0] = "pepegrillo@mail.com";
		//Contraseña
		data[0][1] = "12345asd";
		//Producto
		data[0][2] = "Notebook";
		//Titulo
		data[0][3] = "Vendo mi notebok";
		//Cuerpo
		data[0][4] = "Funciona Perfecto, ningun daño";
		//Precio
		data[0][5] = "122233";
		return data;
	}
	
	@DataProvider(name = "Set_Datos_Test_EBAY01")
	public Object[][] getData2() {
		SetDatos randomGen = new SetDatos();
		
		Object[][]data = new Object[1][6];
		//Nombre
		data[0][0] = randomGen.generateRandomWords(5);
		//Apellido
		data[0][1] = randomGen.generateRandomWords(5);
		//Email
		data[0][2] = randomGen.generateRandomWords(5)+"@mail.com";
		//Contraseña
		data[0][3] = "12345asd";
	
		return data;
	}
	
	@DataProvider(name = "Set_Datos_Test_EBAY05")
	public Object[][] getData5() {
		Object[][]data = new Object[1][6];
		//Usuario
		data[0][0] = "pepegrillo@mail.com";
		//Contraseña
		data[0][1] = "12345asd";
		//Producto
		data[0][2] = "Notebook";
		//Card number
		data[0][3] = "1234123412341234";
		//Date card number
		data[0][4] = "12/20";
		//Security Code
		data[0][5] = "123";
		return data;
	}
}
