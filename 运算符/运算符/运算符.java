package 运算符;
/**
 * Java中常用的运算符有：
 * 算术运算符、赋值运算符、比较运算符、逻辑运算符、条件运算符
 * @author scepter
 *	@Date 2018年5月19日 下午1:57:41
 */
public class 运算符 {
	int a=10,b=20;
	public static void main(String[] args) {
		运算符 x = new 运算符();//创建对象
		System.out.println("算术/赋值运算符之加法："+x.q());//调用方法并输出
		System.out.println("比较运算符："+x.w());
		System.out.println("逻辑/条件运算符："+x.e());
	}
	public int q() {//创建一个int类型方法q
		int c=a+b;
		/*
		 * 其中+是算术运算符，=是赋值运算符
		 * 定义一个int类型变量c，将a加b的值赋值给c
		 */
		return c;//返回变量c
	}
	public boolean w() {//创建一个boolean类型方法w
		boolean g=a>b;//定义一个boolean类型变量g，并将a>b的运算值赋值给g
		return g;//返回g
	}
	public String e() {
		String h= a>b ?"变量a的值大于变量b的值":"变量a的值小于变量b的值";
		/*
		 * ?为条件运算符，语法格式为：
		 * 表达式1 ? 表达式2 : 表达式3
		 * 解析：
		 * 判断表达式1的值，若为true则返回表达式2，若为false则返回表达式3
		 * 定义一个String类型变量h，条件运算符判断a>b，返回false
		 * 将表达式3的值赋值给h，运算完成
		 * 返回(return)h
		 */
		return h;
	}
}