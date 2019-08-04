package string;

public class MyString {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc"; // 对象可能并没有创建!而可能是指向一个先前已经创建的对象
		System.out.println(s1 == s2); // true
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3 == s4); // false
		System.out.println(s2 == s3); // false
	}
}
