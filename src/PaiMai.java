import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
//  题目分析
//    暴力解法：（1）遍历价格数组，找到比当前价格高的个数，价格*个数，得出结果。
//         时间复杂度为o(n*n)
//    第二种解法 （1）价格排序  由数组的下标可知 比当前价格高的个数
//            时间复杂度为 o(n*log(n))
    
public class PaiMai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
//            产品数
            int m = in.nextInt();
//            购买人数
            int n = in.nextInt();
//            出价
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = in.nextInt();
            }
            Arrays.sort(prices);
            int sum = 0;
            int res = 0;
            for (int i = 0; i < prices.length; i++) {
                int tem = prices[i]*Math.min(m,n-i);
                if (tem > sum){
                    sum = tem ;
                    res = prices[i];
                }
            }
            System.out.println(res);
        }
    }
}
