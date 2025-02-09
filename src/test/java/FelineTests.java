import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTests {

    @Test
    public void getKittensNoNumTest() {
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals(expected,feline.getKittens());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals(expected,feline.getFamily());
    }

    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(feline.eatMeat(),expected);
    }
}
