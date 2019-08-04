package string;

public class FinalString {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final StringBuilder a = new StringBuilder("aaa");
		final StringBuilder b = new StringBuilder("bbb");
		// a = b; // 此句编译不通过
		a.append("bbb");
		final String c = "1234";
		// c = "5678"; // 此句编译不通过
	}
}
