package Patterns;

//Problem- https://www.naukri.com/code360/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
// Output: 
// 1
// 1 2 
// 1 2 3

public class nTriangle {

  public static void solution(int n) {
    // Write your code here
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j+" ");
        }
        System.out.print("\n");
    }
}
  
}
