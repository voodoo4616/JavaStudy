public class Exam12_3 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		
		int s_idx = 0; // 시작위치
		int e_idx = 0; // 마지막위치
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