package hmif.babak_penyisihan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UsernameProblemTest {
    @Test
    void test0() {
        String username = "fazaAzzahra";
        assertEquals("Valid", UsernameProblem.solution(username));
    }

    @Test
    void test1() {
        String username = "8ballpool";
        assertEquals("Invalid", UsernameProblem.solution(username));
    }

    @Test
    void test2() {
        String username = "Julia";
        assertEquals("Invalid", UsernameProblem.solution(username));
    }

    @Test
    void test3() {
        String username = "Samantha_21";
        assertEquals("Valid", UsernameProblem.solution(username));
    }
    @Test
    void test4() {
        String username = "1Samantha";
        assertEquals("Invalid", UsernameProblem.solution(username));
    }
    @Test
    void test5() {
        String username = "Samantha?10_2A";
        assertEquals("Invalid", UsernameProblem.solution(username));
    }
    @Test
    void test6() {
        String username = "JuliaZ007";
        assertEquals("Valid", UsernameProblem.solution(username));
    }
    @Test
    void test7() {
        String username = "Julia@007";
        assertEquals("Invalid", UsernameProblem.solution(username));
    }
    @Test
    void test8() {
        String username = "_Julia007";
        assertEquals("Invalid", UsernameProblem.solution(username));
    }
    void test9() {
        String username = "FazaAzzahra_020323";
        assertEquals("Valid", UsernameProblem.solution(username));
    }
}
