import java.util.ArrayList;

public class Word {
	private ArrayList<String> W = new ArrayList<String>();

	public void add(String w) {
		W.add(w);
	}

	public String getResult() {	
		int distance = 0;
		String w1 = null, w2 = null;
		if (W.size() < 2)	//���������� "���" ���� ���� ������ ����
			return "���";
		else{			
			// ----------����� ���� ���� � ���������� ����������----------
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
			if (distance == 0){	//���� ��� ����� ����������, 
				w1 = W.get(0);	//�� ���������� ������ ���
				w2 = W.get(1);
			}
			// ----------����� ���� ���� � ���������� ����������----------
		}
		return w1 + " " + w2;
	}

	private int getDistance(String w1, String w2) {
		// ----------������������ ���-�� ������������ ������� � ������ (���������)----------
		int distance = 0;
		for (int i = 0; i < w1.length(); i++) {
			if (w1.charAt(i) != w2.charAt(i))
				distance++;
		}
		return distance;
		// ----------������������ ���-�� ������������ ������� � ������ (���������)----------
	}

}
