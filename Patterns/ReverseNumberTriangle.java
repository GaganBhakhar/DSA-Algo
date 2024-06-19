package Patterns;

// Problem - https://www.naukri.com/code360/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
// Output: 

// 1 2 3
// 1 2
// 1

public class ReverseNumberTriangle {

  public static void nNumberTriangle(int n) {
    // Write your code here
    for(int i = n; i >= 1; i--) {
        for(int j = 1; j <= i; j++) {
            System.out.print(j +" ");
        }
        System.out.print("\n");
    }
}
  
}
