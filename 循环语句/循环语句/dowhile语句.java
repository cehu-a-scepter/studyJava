package 循环语句;
/**
 * do...while语句同while语句一样
 * 但do...while则是先执行一次再判断是否满足条件
 * @author scepter
 *	@Date 2018年5月20日 下午3:52:52
 */
public class dowhile语句 {
	public static void main(String[] args) {
		int a=1;
		do {
			System.out.println("a的值为："+a);
			a++;
		}while(a<10);
	}
}