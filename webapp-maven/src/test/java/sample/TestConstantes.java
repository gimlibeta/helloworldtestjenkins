package sample;
import org.junit.Assert;
import org.junit.Test;

public class TestConstantes {
    @Test
    public void testHelloWorld(){
        Assert.assertEquals("NO-BODY", Constantes.WHO);
        System.out.println("Hello "+Constantes.WHO);

	Assert.assertEquals("NO-BODY", Constantes2.WHO);
        System.out.println("Hello "+Constantes2.WHO);
    }
}
