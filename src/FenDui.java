import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
// �ֶ�
//    ��Ŀ����
//    http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4410&konwledgeId=41
//    k k+1 k k+1
//   �ԣ�2*k+1��Ϊһ�飬 ���µĴ���k��+1
public class FenDui {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            int pair = m/(2*n+1);
            int res = 2*pair;
            if (m%(2*n+1)>=n){
                res++;
            }
            System.out.println(res);
        }
    }
}
