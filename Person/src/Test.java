
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person p = new Person(); //Person()でコンストラクタを呼び出している。

		Person a = new Person();
		a.name = "taro";
		a.age = 18;
		System.out.println(a.name);
		System.out.println(a.age);

		Person b = new Person("jiro", 20);
		System.out.println(b.name);
		System.out.println(b.age);

		Person c = new Person("saburo", 0);
			System.out.println(c.name);
			System.out.println(c.age);

		Person d = new Person(25);
		System.out.println(d.name);
		System.out.println(d.age);

		Person e = new Person("hanako", 17);
		System.out.println(e.name);
		System.out.println(e.age);


	}

}
