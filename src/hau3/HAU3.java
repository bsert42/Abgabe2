package hau3;

public class HAU3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=140;
		int j=150;
		int k=6;
		if (i>j && !(i>200) && !(j>100)) {
			k=1;
		} else if (i>j && i>200 && !(j>100)) {
			k=2;
		} 
		else if (i>j && i>200 && j>100) {
			k=3;
		} 
		else if (!(i>j) && !(i>200) && !(j>100)) {
			k=4;
		}
		else {
			k=-10;
		}
		System.out.println (k);
	}

}
