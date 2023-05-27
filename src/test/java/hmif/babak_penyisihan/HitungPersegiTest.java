package hmif.babak_penyisihan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HitungPersegiTest {

  @Test
  void test0() {
    int P = 1;
    int Q = 10;
    int expectedOutput = 10;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test1() {
    int P = 2;
    int Q = 10;
    int expectedOutput = 29;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test2() {
    int P = 3;
    int Q = 4;
    int expectedOutput = 20;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test3() {
    int P = 0;
    int Q = 10;
    int expectedOutput = 0;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test4() {
    int P = 10;
    int Q = 20;
    int expectedOutput = 935;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test5() {
    int P = 0;
    int Q = 0;
    int expectedOutput = 0;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test6() {
    int P = 7;
    int Q = 7;
    int expectedOutput = 140;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test7() {
    int P = 1;
    int Q = 1;
    int expectedOutput = 1;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test8() {
    int P = 9;
    int Q = 12;
    int expectedOutput = 420;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void test9() {
    int P = 2;
    int Q = 100;
    int expectedOutput = 299;
    int actualOutput = HitungPersegi.solution(P, Q);
    assertEquals(expectedOutput, actualOutput);
  }
}
