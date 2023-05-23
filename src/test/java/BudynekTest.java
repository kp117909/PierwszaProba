import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BudynekTest {

    @ParameterizedTest
    @MethodSource("data")

    void obliczPole(Pomieszczenie p1, int result) {
        Pomieszczenie pomieszczenie = p1;
        int wynik = result;
        int calculatedResult = pomieszczenie.obliczPole();
        assertEquals(wynik, calculatedResult);
    }

    private static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {new Pomieszczenie(1, 5, 3, "p1"), 15},
                {new Pomieszczenie(1, 5, 5, "p2"), 25},
                {new Pomieszczenie(1, 10, 3, "p3"), 30},
        };

        return Arrays.asList(data);
    }

}