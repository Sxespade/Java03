import lesson6.CheckOneOrFour;
import lesson6.ExtractingArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CheckOneOrFourTest {
    private CheckOneOrFour checkOneOrFour;
    @BeforeEach
    public void init() {
        checkOneOrFour = new CheckOneOrFour();
    }
    static Stream<Arguments> yourTest () {
        return Stream.of(
                Arguments.of( new int[]{2, 3, 1}),
                Arguments.of( new int[]{2, 3}),
                Arguments.of( new int[]{4, 3}),
                Arguments.of( new int[]{6, 3, 9})
        );
    }

    @ParameterizedTest
    @MethodSource("yourTest")
    public void extractingArrayTest2(int[] array) {
        Assertions.assertTrue(checkOneOrFour.checkOneOrFour(array));
    }
}
