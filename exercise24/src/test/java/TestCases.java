import org.junit.jupiter.api.Test;

import static baseline.Solution24.isAnagram;
import static baseline.Solution24.lengthChecker;
import static org.junit.jupiter.api.Assertions.*;

class TestCases {

    @Test
    void TestIsAnagram(){

        String word1 = "note";
        String word2 = "tone";

        boolean ExpectedIsAnagram = true;
        boolean ActualIsAnagram = isAnagram(word1, word2);

        assertEquals(ExpectedIsAnagram, ActualIsAnagram);
    }

    @Test
    void TestLengthChecker(){

        String word1 = "note";
        String word2 = "tone";

        boolean ExpectedLengthCheck = true;
        boolean ActualLengthCheck = lengthChecker(word1, word2);

        assertEquals(ExpectedLengthCheck, ActualLengthCheck);
    }
}
