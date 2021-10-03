import org.junit.jupiter.api.Test;

import static baseline.Solution25.*;
import static org.junit.jupiter.api.Assertions.*;

class TestCases {

    @Test
    void testLengthChecker(){

        String password = "123456789";

        boolean expectedLength = true;
        boolean actualLength = lengthChecker(password);

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void testNumberChecker(){

        String password = "12n45";

        boolean expectedCheck = false;
        boolean actualCheck = numberChecker(password);

        assertEquals(expectedCheck, actualCheck);

    }

    @Test
    void testLetterChecker(){

        String password = "12n45";

        boolean expectedCheck = false;
        boolean actualCheck = letterChecker(password);

        assertEquals(expectedCheck, actualCheck);

    }

    @Test
    void testNumberAndLetterChecker() {

        String password = "1234576789a";

        boolean expectedCheck = true;
        boolean actualCheck = letterAndNumberChecker(password);

        assertEquals(expectedCheck, actualCheck);
    }

    @Test
    void testSpecialChecker() {

        String password = "1%2345";

        boolean expectedCheck = true;
        boolean actualCheck = specialChecker(password);

        assertEquals(expectedCheck, actualCheck);
    }
}
