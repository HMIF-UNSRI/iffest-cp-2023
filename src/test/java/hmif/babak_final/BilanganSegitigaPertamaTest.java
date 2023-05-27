package hmif.babak_final;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BilanganSegitigaPertamaTest {
    @Test
    void test0() {
        int input = 3;
        int result = 6;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test1() {
        int input = 5;
        int result = 28;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test2() {
        int input = 7;
        int result = 36;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test3() {
        int input = 10;
        int result = 120;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test4() {
        int input = 16;
        int result = 300;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test5() {
        int input = 19;
        int result = 528;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test6() {
        int input = 20;
        int result = 630;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test7() {
        int input = 30;
        int result = 2016;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test8() {
        int input = 46;
        int result = 5460;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test9() {
        int input = 77;
        int result = 25200;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }

    @Test
    void test10() {
        int input = 100;
        int result = 73920;
        assertEquals(result, BilanganSegitigaPertama.solution(input));
    }
}
