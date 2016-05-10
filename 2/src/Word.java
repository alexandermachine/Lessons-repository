import java.util.ArrayList;

public class Word {
	private ArrayList<String> W = new ArrayList<String>();

	public void add(String w) {
		W.add(w);
	}

	public String getResult() {	
		int distance = 0;
		String w1 = null, w2 = null;
		if (W.size() < 2)	//возвращаем "НЕТ" если слов меньше двух
			return "НЕТ";
		else{			
			// ----------отбор двух слов с наибольшей дистанцией----------
			for (int i = 0; i < W.size(); i++) {
				for (int k = i + 1; k < W.size(); k++) {

					int d = getDistance(W.get(i), W.get(k));
					if (d > distance) {
						distance = d;
						w1 = W.get(i);
						w2 = W.get(k);
					}
				}
			}
			if (distance == 0){	//если все слова одинаковые, 
				w1 = W.get(0);	//то возвращаем первые два
				w2 = W.get(1);
			}
			// ----------отбор двух слов с наибольшей дистанцией----------
		}
		return w1 + " " + w2;
	}

	private int getDistance(String w1, String w2) {
		// ----------подсчитываем кол-во неодинаковых позиций в словах (дистанцию)----------
		int distance = 0;
		for (int i = 0; i < w1.length(); i++) {
			if (w1.charAt(i) != w2.charAt(i))
				distance++;
		}
		return distance;
		// ----------подсчитываем кол-во неодинаковых позиций в словах (дистанцию)----------
	}

}
