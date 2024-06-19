package Patterns;

//Problem- https://www.naukri.com/code360/problems/triangle_6573690?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
// Output: 
// 1
// 2 2 
// 3 3 3

public class triangle {
  
  public static void nTriangle(int n) {
    // Write your code here
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }
  }
  
}
