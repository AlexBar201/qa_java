import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestForFeline {

    @Test
    public void testEatMeat() throws Exception {
        // Создаем мок для Animal
        Animal animalMock = mock(Animal.class);

        // Создаем экземпляр класса, содержащего метод eatMeat
        Feline yourObjectUnderTest = new Feline(animalMock);

        // Предопределенная заглушка для метода getFood
        List<String> mockFoodList = List.of("Животные", "Птицы", "Рыба");
        when(animalMock.getFood("Хищник")).thenReturn(mockFoodList);

        // Вызываем метод eatMeat вашего класса
        List<String> result = yourObjectUnderTest.eatMeat();

        // Проверяем результат
        assertEquals(mockFoodList, result);

        // Проверяем, что метод getFood на объекте animalMock был вызван с аргументом "Хищник"
        verify(animalMock, times(1)).getFood("Хищник");
    }

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String result = feline.getFamily();
        assertEquals(expected, result);
    }

    @Test
    public void testGetKittensYesArg(){
        Feline feline = new Feline();
        int expected = 1;
        int kittensCount = 1;
        int result = feline.getKittens(kittensCount);
        assertEquals(expected, result);
    }

    @Spy
    private Feline feline;

    @Test
    public void testGetKittenNoArgInvoke(){
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

}