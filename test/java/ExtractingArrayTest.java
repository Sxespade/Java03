import lesson6.ExtractingArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class ExtractingArrayTest {
    private ExtractingArray extractingArray;
    @BeforeEach
    public void init() {
        extractingArray = new ExtractingArray();
    }
    static Stream<Arguments> yourTest () {
        return Stream.of(
                Arguments.of((Object) new int[]{2, 3, 1})
        );
    }
    static Stream<Arguments> yourTest2 () {
        return Stream.of(
                Arguments.of((new int[]{2, 4, 3, 1}), new int[]{3, 1})
        );
    }
    @ParameterizedTest
    @MethodSource("yourTest")
    public void extractingArrayTest(int[] array) {
        Assertions.assertThrows(RuntimeException.class, () -> extractingArray.extractingArray(array));
    }
    @ParameterizedTest
    @MethodSource("yourTest2")
    public void extractingArrayTest2(int[] array, int[] expected) {
        Assertions.assertArrayEquals(expected,extractingArray.extractingArray(array));
    }

}
