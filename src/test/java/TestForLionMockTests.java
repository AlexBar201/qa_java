import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class TestForLionMockTests {

    @Test
    public void testGetKittens(){

        //Создаём мок для Feline
        Feline felineMock = mock(Feline.class);

        //Создаём класс, который будем тестировать
        Lion yourObjectUnderTest = new Lion(felineMock);

        //Предопределённая заглушка для метода getKittens
        int returnGetKittens = 1;
        when(felineMock.getKittens()).thenReturn(returnGetKittens);

        //Вызываем метод тестируемого класса и сравниваем результат
        int result = yourObjectUnderTest.getKittens();
        assertEquals(returnGetKittens, result);

        //Проверяем, что метод getKittens на объекте felineMock был вызван один раз
        verify(felineMock, times(1)).getKittens();

    }

    @Test
    public void testGetFood() throws Exception{

        //Создаём мок для Feline
        Feline felineMock = mock(Feline.class);

        //Создаём объект класса, который хотим тестировать
        Lion yourObjectUnderTest = new Lion(felineMock);

        //Предопределённая заглушка для метода getFood
        String getFoodParam = "Хищник";
        List<String> mockFoodList = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.getFood(getFoodParam)).thenReturn(mockFoodList);

        //Вызываем тестируемый метод и сравниваем результат
        List<String> result = yourObjectUnderTest.getFood();
        assertEquals(mockFoodList, result);

        //Проверяем, что метод getFood на объекте felineMock был вызван с аргументом "Хищник"
        verify(felineMock, times(1)).getFood("Хищник");

    }
}
