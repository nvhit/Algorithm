package com.algorithm.demo.listed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*
* @author hungnv
*/
public class Generation {
  private int i, n;
  private int[] arrayInt = new int[n];
  private int[] arrayInt1 = new int[n];
  List<int[]> listBinary = new ArrayList<int[]>();
  public void init() {
    n =3;
    arrayInt = new int[n];
    Arrays.fill(arrayInt, 0);
  }

  public void result() {
//    for (int j = 0; j < n ; j++) {
//       System.out.print(arrayInt[j] );
//      
//    }
    arrayInt1 = Arrays.copyOf(arrayInt, arrayInt.length);
    this.listBinary.add(arrayInt1);
   
    // System.out.println();
  }

  public void generBinary() {
    do {
      // in ra kết quả
      result();
      // - để lấy length
      i = n - 1;
      while(this.i >= 0 && arrayInt[i] == 1) {
        i--;
      }
      if (this.i >= 0) {
        arrayInt[i] = 1;
        for (int j = i + 1; j <n ; j++) {
          arrayInt[j] = 0;
        }
      }
    } while (this.i >= 0);
  }

  public static void main(String[] agrs) {
    Generation generbinary = new Generation();
    generbinary.init();
    generbinary.generBinary();
    System.gc();
    for (int[] is : generbinary.listBinary) {
      for (int i : is) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}