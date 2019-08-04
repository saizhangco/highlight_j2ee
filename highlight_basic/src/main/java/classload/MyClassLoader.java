package classload;

public class MyClassLoader {

	public static void main(String[] args) {
		System.out.println(Class3.value);
	}
}

class Class1 {
	static {
		System.out.println("Class1 Static");
	}

	public Class1() {
		System.out.println("Class1 Construct");
	}
}

class Class2 extends Class1 {
	static {
		System.out.println("Class2 Static");
	}

	public Class2() {
		System.out.println("Class2 Construct");
	}

	static int value = 10;
}

class Class3 extends Class2 {
	static {
		System.out.println("Class3 Static");
	}

	public Class3() {
		System.out.println("Class3 Construct");
	}
}
