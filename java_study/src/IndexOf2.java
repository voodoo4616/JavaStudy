class IndexOf {
	public static void main(String args[]) {
		String str = "Java ������ �缺�� ���� ����������!!";
		int idx = str.indexOf(" ");
		System.out.println(idx);

		int idx2 = str.lastIndexOf(" ");
		System.out.println(idx2);

		idx = str.indexOf(" ", idx + 1);
		System.out.println(idx);

		idx2 = str.lastIndexOf(" ", idx2 - 1);
		System.out.println(idx2);
	}
}