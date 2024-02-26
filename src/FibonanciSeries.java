
public class FibonanciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,..
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i =2; i<=10;i++) {
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
