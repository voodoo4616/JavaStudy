public class Substring {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		
		int s_idx = 0; // ������ġ
		int e_idx = 0; // ��������ġ
		while(true ) {
			e_idx = str.indexOf(" ", s_idx + 1);
			if ( e_idx == -1) break;
			String s1 = str.substring(s_idx, e_idx); // Java
			System.out.println(s1);
			
			s_idx = e_idx;
		}

	}
}