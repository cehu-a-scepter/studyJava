package 变量使用规则;
/**
 * Java变量使用规则
 * 1、Java中的变量先声明并赋值后才能使用
  *	2、变量每次只能赋一个值，但可多次修改
 * 3、main方法中定义的变量必须先赋值然后才能输出
  *  4、变量名不建议使用中文，虽然语法上没有提示错误，但容易产生安全隐患，例如后期跨平台操作时出现乱码等
 * @author scepter
 * @Date 2018年5月16日 下午6:10:13
 */
public class 变量使用规则 {
	public static void main(String[] args) {
		int a=123;//声明一个int类型变量a并赋值123
		int b;//声明一个int类型变量b
		b=10;//给int类型变量b赋值10
		String abc="测试";//声明一个String类型变量并赋值
		abc="重新赋值";//将已声明的String类型变量abc重新赋值
		System.out.println(a+"\n"+b+"\n"+abc);//输出变量，其中"\n"是换行，\n是换行转义符
	}
}
