
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
// 题目链接：http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4398&konwledgeId=41
//    暴力解法 ：排列组合  如果M题要答对N题，列出A(M,N)种可能
//   用DFS来做，时间复杂度是O(N!)
//   动态规划的做法是 保存了暴力解法中的中间结果，用空间换时间 ，时间复杂度为O（N*N）
//    空间复杂度是O（N*N）
//    类似的dp在字符串中常用，关键是递推公式
//  例如字符串是否是回文串，字符串分割为回文串
public class KaoShi {
//    动态规划的做法
//    dp[i][j]  表示i题答对j题的概率
//    初始条件  dp[0][0] = 1 0题答对0题的概率为1
//              dp[i][0] = dp[i-1]*(1-pro[i])
//            i题对0题 = i-1题对0题* 第i题答错
//    递推公式为：
//    dp[i][j] = dp[i-1][j-1]*pro[i] + dp[i-1][j]*(1-pro[i])
//    i题对j题 分为两种情况： （1）第i题答错，前i-1题答对j题
//                            （2）第i题答对，前i-1题对j-1题
    public static double helper(double[] pros){
        double[][] dp = new double[pros.length+1][pros.length+1];
//        初始条件
        dp[0][0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i-1][0]*(1-pros[i-1]);
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i-1][j-1]*pros[i-1] + dp[i-1][j]*(1-pros[i-1]);
            }
        }
        int start = (int) Math.ceil(pros.length*0.6);
        double res = 0;
        for (int i = start; i < dp.length; i++) {
            res += dp[dp.length-1][i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            double[] pros = new double[num];
            for (int i = 0; i < num; i++) {
                pros[i] = in.nextInt()*0.01;
            }
            System.out.printf("%.5f",helper(pros));
        }
    }
}
