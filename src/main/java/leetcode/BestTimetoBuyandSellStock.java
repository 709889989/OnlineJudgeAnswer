package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimetoBuyandSellStock {
    public class Solution {
        public int maxProfit(int[] prices) {
            int minx = Integer.MAX_VALUE;
            int maxx = 0;
            for (int i = 0; i < prices.length; ++i) {
                maxx = Math.max(maxx, prices[i] - minx); //��i��ֵ��ȥ0~i-1����Сֵ���Ƚ�������֪�������Ĵ�С
                minx = Math.min(minx, prices[i]);// ����0~i����Сֵ
            }
            return maxx;
        }
    }
}
