package hw;
/*輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。

 * 
 * Date: 2016/11/14
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
//		System.out.println(C(m));
		System.out.println(C(m)/(C(n)*C(m-n)));
	}
	public static int C(int m){
		// TODO Auto-generated method stub
		if(m==1){
			return 1;
		}
		else{
		
		return m*C(m-1);
		}
	}

}