
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
// ��Ŀ���ӣ�http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4398&konwledgeId=41
//    �����ⷨ ���������  ���M��Ҫ���N�⣬�г�A(M,N)�ֿ���
//   ��DFS������ʱ�临�Ӷ���O(N!)
//   ��̬�滮�������� �����˱����ⷨ�е��м������ÿռ任ʱ�� ��ʱ�临�Ӷ�ΪO��N*N��
//    �ռ临�Ӷ���O��N*N��
//    ���Ƶ�dp���ַ����г��ã��ؼ��ǵ��ƹ�ʽ
//  �����ַ����Ƿ��ǻ��Ĵ����ַ����ָ�Ϊ���Ĵ�
public class KaoShi {
//    ��̬�滮������
//    dp[i][j]  ��ʾi����j��ĸ���
//    ��ʼ����  dp[0][0] = 1 0����0��ĸ���Ϊ1
//              dp[i][0] = dp[i-1]*(1-pro[i])
//            i���0�� = i-1���0��* ��i����
//    ���ƹ�ʽΪ��
//    dp[i][j] = dp[i-1][j-1]*pro[i] + dp[i-1][j]*(1-pro[i])
//    i���j�� ��Ϊ��������� ��1����i����ǰi-1����j��
//                            ��2����i���ԣ�ǰi-1���j-1��
    public static double helper(double[] pros){
        double[][] dp = new double[pros.length+1][pros.length+1];
//        ��ʼ����
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
