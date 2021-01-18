package com.algorithm.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Kỹ thuật sinh nhị phân là: Xét từ cuối dãy về đầu, nếu gặp số 0 đầu tiên thì thay bằng số 1 những phần tử sau nó thay bằng 0
 * <p>
 * Ví dụ: nhập vào số tự nhiên >0 n, in ra toàn bộ chuỗi nhị phân có độ dài n
 */
public class Generation {
  public static void main(String[] args) {
    List<String> a = genBinary(10);

  }

  private static List<String> genBinary(int n) {
    String beginBinary;
    int[] beginArray = new int[n];
    Arrays.fill(beginArray, 0); // Integer[] arr = Collections.nCopies(3, 42).toArray(new Integer[0]);
    System.out.printf(beginArray.toString());

    return null;


  }
}
