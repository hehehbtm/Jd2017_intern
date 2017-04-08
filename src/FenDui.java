import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
// 分堆
//    题目链接
//    http://exercise.acmcoder.com/online/online_judge_ques?ques_id=4410&konwledgeId=41
//    k k+1 k k+1
//   以（2*k+1）为一组， 余下的大于k则+1
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
