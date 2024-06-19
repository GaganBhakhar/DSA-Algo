package Patterns;

// Problem- https://www.naukri.com/code360/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
// Output: 
// * * *
// * *
// *

public class seeding {
  public static void solution(int n) {
    // Write your code here
    for (int i = n; i >= 1; i--) {
        for (int j = i; j >= 1; j--) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}
}
