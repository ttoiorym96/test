
public class CheckLoadJDBC {

	/*InstantiationExceptionは、アプリケーションがClassクラスのnewInstanceメソッドを使って
	 * クラスのインスタンスを生成しようとしたときに、指定されたクラス・オブジェクトのインスタンスを
	 * 生成できない場合にスロー。
	 * IllegalAccessExceptionは、クラスまたはその引数なしのコンストラクタにアクセスできない場合スロー。
	 */
	public static void main(String[] args)throws InstantiationException,IllegalAccessException {
		// TODO 自動生成されたメソッド・スタブ
		String msg="";

		//Classは、元々あるクラス。forNameはドライバを探すのメソッド。
		//catchは、for文でいうelseifに当たるイメージで、(  )内の内容はエラーの内容を書く。
		//ClassNotFoundExceptionは、forNameの(  )内のドライバ名が見つからない場合・・・という意味。
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバのロードに成功しました";
		} catch(ClassNotFoundException e) {
			msg = "ドライバのロードに失敗しました";
		}
		System.out.println(msg);

	}

}
