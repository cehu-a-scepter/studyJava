package 循环跳转语句;
/**
 * Java循环跳转语句之break
 * break语句用于退出指定循环
 * @author scepter
 *	@Date 2018年5月20日 下午10:52:06
 */
public class break语句 {
	public static void main(String[] args) {
		System.out.println("使用for循环输出100以内所有2的倍数");
		for(int a=1;a<100;a++) {//循环输出100以内所有整数
			for(int b=a%2;b==0;) {//判断输出的整数是否为2的倍数
				System.out.println(a);//满足条件则输出
				break;//输出完毕，跳出到上级循环
				//若不使用break则会一直在此循环，因为括号中的表达式结果是true并没有变化
			}
		}
		System.out.println("100以内2的倍数已输出完毕！");
	}
}
