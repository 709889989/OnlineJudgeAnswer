package leetcode;

/**
 * Created by TedHakcer on 2015/8/10 0010.
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public class Solution {
        public int climbStairs(int n) {
            if (n < 0) return 0;
            int[] dp = new int[n + 1 > 3 ? n + 1 : 3];
            dp[0] = 0;//0��̨�ף�0������
            dp[1] = 1;//1��̨�ף�1������
            dp[2] = 2;//2��̨�ף�2������
            for (int i = 3; i <= n; ++i) {
                dp[i] = dp[i - 1] + dp[i - 2];//i��̨�׵ķ�������i-2��̨��(��2��̨�׵�i)��i-1��̨��(��1��̨�׵�i)֮��
            }
            return dp[n];
        }
    }
}
