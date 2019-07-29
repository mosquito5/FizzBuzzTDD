import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzConverterLeaveNormalNumberAlone() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzBuzzConverter.convert(1));
        Assert.assertEquals("2", fizzBuzzConverter.convert(2));
        Assert.assertEquals("4", fizzBuzzConverter.convert(4));
    }

    @Test
    public void fizzBuzzConverterLeaveBuzz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(5));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(10));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(20));
        Assert.assertEquals("Buzz", fizzBuzzConverter.convert(25));
    }


    @Test
    public void fizzBuzzConverterLeaveFizz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(3));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(6));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(9));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(18));
        Assert.assertEquals("Fizz", fizzBuzzConverter.convert(33));
    }

    @Test
    public void fizzBuzzConverterLeaveFizzBuzz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(60));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.convert(90));
    }
}
