package hmif.babak_penyisihan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KartuBelanjaTest {
    @Test
    void test0() {
        int p = 0;
        int n = 6;
        String output = "[5, 1, 0]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test1() {
        int p = 35;
        int n = 2;
        String output = "[0, 2, 25]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test2() {
        int p = 3;
        int n = 3;
        String output = "[2, 1, 0]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test3() {
        int p = 36;
        int n = 27;
        String output = "[17, 10, 3]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test4() {
        int p = 40;
        int n = 121;
        String output = "[95, 26, 5]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test5() {
        int p = 13;
        int n = 54;
        String output = "[43, 11, 1]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test6() {
        int p = 389;
        int n = 332;
        String output = "[212, 120, 1]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test7() {
        int p = 186;
        int n = 70;
        String output = "[28, 42, 4]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test8() {
        int p = 96;
        int n = 749;
        String output = "[609, 140, 5]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test9() {
        int p = 607;
        int n = 526;
        String output = "[338, 188, 5]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test10() {
        int p = 283;
        int n = 736;
        String output = "[567, 169, 5]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }

    @Test
    void test11() {
        int p = 912;
        int n = 265;
        String output = "[69, 196, 1]";
        assertEquals(output, KartuBelanja.solution(p, n));
    }
}
