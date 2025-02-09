import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    private Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка",feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(expected,lion.getFood());
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionThrowsException() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class,() -> {
            Lion lion = new Lion("Мужской", feline);
        });
        String expectedException = "Используйте допустимые значения пола животного - самец или самка";
        Assert.assertEquals(expectedException,exception.getMessage());
    }

    @Test
    public void getKittensTest () throws Exception {
        Lion lion = new Lion("Самка",feline);
        int expected = 0;
        Assert.assertEquals(expected,lion.getKittens());
    }
}
