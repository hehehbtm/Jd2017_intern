import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 2017/4/8.
 */
//  ��Ŀ����
//    �����ⷨ����1�������۸����飬�ҵ��ȵ�ǰ�۸�ߵĸ������۸�*�������ó������
//         ʱ�临�Ӷ�Ϊo(n*n)
//    �ڶ��ֽⷨ ��1���۸�����  ��������±��֪ �ȵ�ǰ�۸�ߵĸ���
//            ʱ�临�Ӷ�Ϊ o(n*log(n))
    
public class PaiMai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
//            ��Ʒ��
            int m = in.nextInt();
//            ��������
            int n = in.nextInt();
//            ����
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
