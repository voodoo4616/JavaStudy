public class Exam12_3 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		
		int s_idx = 0; // ������ġ
		int e_idx = 0; // ��������ġ
		while(true ) {
			e_idx = str.indexOf(" ", s_idx + 1);
			if ( e_idx == -1) {
			System.out.println(str);
			break;
			}
			String s1 = str.substring(0, e_idx);
			System.out.println(s1);
			
			s_idx = e_idx;
		}
	}
}