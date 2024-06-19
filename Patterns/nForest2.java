package Patterns;

// Problem - https://www.naukri.com/code360/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
// Output: 
// * 
// * *
// * * *

public class nForest2 {
  public static void nForest(int n) {
      // Write your code here
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.print("\n");
      }
  }
}