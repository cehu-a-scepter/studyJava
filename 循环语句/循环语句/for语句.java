package 循环语句;
/**
 * Java循环语句之for
 * 语法结构：for(循环变量初始化；循环条件；循环变量变化){代码}
 * 解析：循环变量初始化可以理解为定义一个变量并赋值
 * 循环条件通常由比较运算符组成，如a<10
 * 循环变量变化通常由算术运算符组成，如a++
 * 当不满足循环条件时则停止执行
 * @author scepter
 *	@Date 2018年5月20日 下午4:56:53
 */
public class for语句 {
	public static void main(String[] args) {
		for(int a=1;a<10;a++) {
			System.out.println("a的值为："+a);
		}
	}
}
