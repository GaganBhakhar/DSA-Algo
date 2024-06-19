package Patterns;

// Problem - https://www.naukri.com/code360/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
// Output: 

//   *
//  ***
// *****

public class starTriangle {

  public static void nStarTriangle(int n) {
    // Write your code here
    // number of stars = k*2-1
    // number of white spaces = n - k
    int k = 1, flag = k * 2 - 1;

    for (int i = 1; i <= 2 * n - 1; i++) {

      if (i <= n - k)
        System.out.print(" ");
      else {
        if (flag > 0) {
          System.out.print("*");
          flag = flag - 1;
        } else
          System.out.print(" ");
      }

      if (i == ((n - k) + ((k * 2) - 1))) {
        k++;
        flag = k * 2 - 1;
        System.out.print("\n");

        // Since for nth row we have
        // 2 * n- 1 columns
        if (k > n)
          break;

        // Reinitializing i as 0,
        // for next row
        i = 0;
      }

    }

  }

}
