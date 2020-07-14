public class Main {
	 public static void main(String[] args) {
		 // この行が実行された瞬間関数の実態が生み出される
		 // この構文は、ラムダ式構文という
		 // 引数の方を省略することもできる
		 MyFunction func = (a, b) -> {
			 return a-b;
		};
		 // 変数funcに格納されている処理ロジックを、引数5と3で実行する
		 // インタフェースのメソッドで呼び出し
		 int a = func.call(5, 3);
		 System.out.println("5-3は"+a);
	 }
}
