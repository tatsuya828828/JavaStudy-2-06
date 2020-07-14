import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
		 list.add(2);
		 list.add(4);
		 for(Integer i: list) {
			 System.out.println(i*2);
		 }
		 // 上記のコードを、ラムダ式に書き換えた場合
		 // ArrayListやHashSetなどはJava8からstreamメソッドを持つようになった
		 // このメソッドを呼び出すと、各要素に様々な一括処理を行ったり、集計を行うためのメソッドを豊富に持ったStreamインスタンスを得ることができる
		 // Streamインスタンスが持つ代表的なメソッドがforEachである
		 // このメソッドは、引数1つの巻数オブジェクトを受け取り、コレクションの各要素に対して関数を繰り返し実行してくれます
		 list.stream().forEach(i -> System.out.println(i*2));
		 // parallelStreamメソッドを使うとJVMは並列処理を行うようになるため大きく性能が向上することがある
		 list.parallelStream().forEach(i -> System.out.println(i*2));
	 }
}
