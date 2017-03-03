package sample;
import org.junit.Assert;
import org.junit.Test;

public class TestConstantes {
    @Test
    public void testHelloWorld(){
        Assert.assertEquals("YDOB-ON", Constantes.WHO);
        System.out.println("Hello "+Constantes.WHO);

	Assert.assertEquals("NO-BODY", Constantes2.WHO2);
        System.out.println("Hello "+Constantes2.WHO2);
    }
}
