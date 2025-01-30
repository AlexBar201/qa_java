import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestForCat {

    @Test
    public void testGetFood() throws Exception{
        //Создаем мок для класса
        Feline mockFeline = mock(Feline.class);

        //Тестируемый класс где есть метод getFood
        Cat yourObjectUnderTest = new Cat(mockFeline);

        //Предопределённая заглушка для метода eatMeet
        List<String> mockFoodList = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.eatMeat()).thenReturn(mockFoodList);

        //Вызываем метод getFood
        List<String> result = yourObjectUnderTest.getFood();

        //Проверяем результат
        assertEquals(mockFoodList, result);
    }

    @Test
    public void testSound(){
        String exception = "Мяу";
        Cat cat = new Cat();
        String result = cat.getSound();
        assertEquals(exception, result);
    }
}
