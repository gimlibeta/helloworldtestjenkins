package sample;
import org.junit.Assert;
import org.junit.Test;

public class TestConstantes {
    @Test
    public void testHelloWorld(){
        Assert.assertEquals("YDOB-ON", Constantes.WHO);
        System.out.println("Hello "+Constantes.WHO);
    }
}
