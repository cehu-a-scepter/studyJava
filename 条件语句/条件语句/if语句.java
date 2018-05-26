package 条件语句;
/**
 * Java条件语句之if...else
 * 语句格式：
 * if(表达式1){代码1}else if(表达式2){代码2}else{代码3}
 * 解析：如果'表达式1'正确则执行代码1，若错误则判断表达式2，正确则执行代码2，反之执行代码3
 * @author scepter
 *	@Date 2018年5月20日 下午2:57:52
 */
public class if语句 {
	public static void main(String[] args) {
		int a=12,b=43;//定义变量a、b并赋值
		if(a>b) {//判断a是否大于b，返回true则执行花括号内语句
			System.out.println("a大于b");
		}else if(a==b) {//判断a是否等于b
			System.out.println("a等于b");
		}else if(a<b) {//判断a是否小于b
			System.out.println("a小于b");
		}
	}
}