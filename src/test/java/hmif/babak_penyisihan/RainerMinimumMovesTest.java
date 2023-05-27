package hmif.babak_penyisihan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RainerMinimumMovesTest {

  @Test
  void test0() {
    int minMoves1 = RainerMinimumMoves.solution(4, 1, 1, 4, 4);
    assertEquals(2, minMoves1);
  }

  @Test
  void test1() {
    int minMoves1 = RainerMinimumMoves.solution(8, 2, 2, 8, 8);
    assertEquals(4, minMoves1);
  }

  @Test
  void test2() {
    int minMoves1 = RainerMinimumMoves.solution(8, 1, 1, 7, 8);
    assertEquals(5, minMoves1);
  }

  @Test
  void test3() {
    int minMoves1 = RainerMinimumMoves.solution(5, 1, 2, 4, 5);
    assertEquals(2, minMoves1);
  }

  @Test
  void test4() {
    int minMoves1 = RainerMinimumMoves.solution(12, 5, 5, 9, 12);
    assertEquals(5, minMoves1);
  }

  @Test
  void test5() {
    int minMoves1 = RainerMinimumMoves.solution(9, 2, 2, 7, 9);
    assertEquals(4, minMoves1);
  }

  @Test
  void test6() {
    int minMoves1 = RainerMinimumMoves.solution(5, 1, 4, 5, 5);
    assertEquals(3, minMoves1);
  }

  @Test
  void test7() {
    int minMoves1 = RainerMinimumMoves.solution(7, 3, 4, 5, 7);
    assertEquals(3, minMoves1);
  }

  @Test
  void test8() {
    int minMoves1 = RainerMinimumMoves.solution(9, 4, 5, 7, 9);
    assertEquals(3, minMoves1);
  }

  @Test
  void test9() {
    int minMoves1 = RainerMinimumMoves.solution(10, 1, 2, 8, 10);
    assertEquals(5, minMoves1);
  }
}
