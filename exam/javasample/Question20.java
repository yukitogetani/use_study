
class Question20 {
	int a ;
	
	public Question20(int a) {
		this.a = a;
	}
	public Question20() {
		this.a = 200;
	}
	public int sum() {
		a = a + 10;
		return a;
	}
	public static void main(String[] args) {
		Question20 que = new Question20();
		int a = que.sum();
		System.out.println(a);
	}
}
