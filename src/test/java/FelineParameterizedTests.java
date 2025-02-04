import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTests {
    private final int kittensCount;
    private final int expectedCount;
    Feline feline = new Feline();

    public FelineParameterizedTests(int kittensCount, int expectedCount) {
        this.kittensCount = kittensCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCountData() {
        return new Object[][] {
                {5,5},
                {8,8},
                {1,1},
                {0,0},
        };
    }

    @Test
    public void getKittensCount() {
        Assert.assertEquals(expectedCount, feline.getKittens(kittensCount));
    }

}
