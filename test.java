import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void _min() {
        int[] test = {2, 4, 7, 11, 10, 109, 17};
        Assert.assertEquals(2, Main._min(test));
    }

    @Test
    public void _max() {
        int[] test = {12, 4, 47, 116, 10, 109, 17};
        Assert.assertEquals(116, Main._max(test));
    }

    @Test
    public void _sum() {
        int[] test = {1, 4, 7, 3, 10, 2, 5};
        Assert.assertEquals(32, Main._sum(test));
    }

    @Test
    public void _mult() {
        int[] test = {1, 4, 2, 3, 10};
        Assert.assertEquals(240, Main._mult(test));
    }
}
