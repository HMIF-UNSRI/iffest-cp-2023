package hmif.babak_penyisihan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EgimxPairedBarbellTest {

  @Test
  void test0() {
    int[] arr1 = { 3, 5, 4, 3 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(7, count1);
  }

  @Test
  void test1() {
    int[] arr1 = { 4, 6, 2, 7, 1 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(10, count1);
  }

  @Test
  void test2() {
    int[] arr1 = { 5, 6, 2 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(6, count1);
  }

  @Test
  void test3() {
    int[] arr1 = { 5, 4, 7, 1 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(8, count1);
  }

  @Test
  void test4() {
    int[] arr1 = { 3, 6, 8, 4, 2 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(11, count1);
  }

  @Test
  void test5() {
    int[] arr1 = { 3, 6, 8, 5 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(11, count1);
  }

  @Test
  void test6() {
    int[] arr1 = { 4, 4, 4, 4 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(8, count1);
  }

  @Test
  void test7() {
    int[] arr1 = { 1, 4, 7, 9 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(10, count1);
  }

  @Test
  void test8() {
    int[] arr1 = { 1, 4, 7 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(6, count1);
  }

  @Test
  void test9() {
    int[] arr1 = { 1, 4 };
    int count1 = EgimxPairedBarbell.solution(arr1.length, arr1);
    assertEquals(2, count1);
  }
}
