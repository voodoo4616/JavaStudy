package collection;

import java.util.HashSet;

public class LottoExam {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		lotto.add(6);
		lotto.add(10);
		lotto.add(16);
		lotto.add(28);
		lotto.add(34);
		lotto.add(38);
		
		HashSet<Integer> my = new HashSet<>();

		int cnt = 0;
		while(true) {
			cnt++;
			my.clear();  // set�� ������ ����
			// �������� �ζǹ�ȣ 6�� �����ϱ�
			while(true) {
				int n = (int) (Math.random() * 45 + 1);
				my.add(n);
				if(my.size() == 6) break;
			}
			System.out.println(cnt);
			if(lotto.containsAll(my)) {
				break;
			}
		}
		System.out.println("���� �õ� Ƚ�� : " + cnt);
	}
}
