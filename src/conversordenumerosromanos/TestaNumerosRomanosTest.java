
package conversordenumerosromanos;

import org.junit.Assert;
import org.junit.Test;


public class TestaNumerosRomanosTest {
    @Test
    public void ConverterNumerosRomanosEmInteiros() {
    ConversorDeNumerosRomanos converte = new ConversorDeNumerosRomanos();
    ConversorDeNumerosRomanos converte1 = new ConversorDeNumerosRomanos();
    ConversorDeNumerosRomanos converte2 = new ConversorDeNumerosRomanos();
    int decimal = converte.converte("XX");
    int decimal1 = converte1.converte("VIV");
    int decimal2 = converte2.converte("VVVV");
    //int esperado = 20;	
    //int esperado1 = 9;
    //int esperado2 = 0;
    Assert.assertEquals(20, decimal);
    Assert.assertEquals(9, decimal1);
    Assert.assertEquals(0, decimal2);	
    }
}
