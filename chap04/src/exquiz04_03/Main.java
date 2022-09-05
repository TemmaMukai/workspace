package exquiz04_03;

public class Main {
	public static void main(String[] args) {
		int[][] scores = {{30,68,55,95,77},{80,72,48,64,69}};
		int[] sums = new int[2];
		int[] avgs = new int[2];
		String[] names = {"佐藤　栄作","鈴木　一郎"};
		for(int i = 0; i < scores.length;i++) {
			for(int score:scores[i]) {
				sums[i] += score;
			}
			avgs[i] = sums[i] / scores[i].length;
			System.out.println(names[i]+"の合計点："+sums[i]);
			System.out.println(names[i]+"の平均点："+avgs[i]);
		}
		// １：上記の合計点、平均点がいくつになるか答えなさい

		// ２：上記の拡張for文の部分を従来のfor文に書き換えて同じ結果を出しなさい
		/*for(int i = 0; i < scores.length;i++) {
			sums[i]=0;
			avgs[i]=0;
			// ここに従来のfor文を入れる
			for (int a = 0; a < scores[i].length; a++) {
				sums[i] += scores[i][a];

			}

			avgs[i] = sums[i] / scores[i].length;
			System.out.println(names[i]+"の合計点："+sums[i]);
			System.out.println(names[i]+"の平均点："+avgs[i]);
		}*/

		// ３：30以下の点数を出した生徒の名前を表示するコードに書き換えなさい
			/*for (int i = 0; i < scores.length; i++) {
				for (int n  = 0; n < scores[i].length; n++) {
					
					if (i >= 30) {
						System.out.println(names[n]);
						break;
					}
				}
			}*/
			for (int i = 0; i < scores.length; i++) {
				/*for (int a : scores[i]) {
					System.out.println(names[i]);
					break;
					
				}*/
				for (int a = 0; a < scores[i].length; a++) {
					System.out.println(names[i]);
					break;
				}
			}
			
	}

}
