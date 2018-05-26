package 循环语句;
/**
 * Java循环语句之while语句
 * 语法格式：
 * while(表达式){代码}
 * 解析：判断表达式是否为true
 * 若为true则执行代码，直到表达式为false时停止
 * @author scepter
 *	@Date 2018年5月20日 下午3:22:25
 */
public class while语句 {
	public static void main(String[] args) {
		int a=1;//定义一个变量a
		while(a<10) {//判断a是否小于10，若为true则执行，直到为false时停止
			System.out.println("当前a的值为："+a);
			a++;//a自增1
		}
	}
}