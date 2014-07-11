
class Question19 {
	int a ;
	
	public Question19(int a) {
		this.a = a;
	}
	public int sum() {
		a = a + 10;
		return a;
	}
	public static void main(String[] args) {
		Question19 que = new Question19(100);
		int a = que.sum();
		System.out.println(a);
	}
}
