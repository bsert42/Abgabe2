package hau2;

public class HAU2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 3;
        int j = 6;
        int k = 14;
        int min = 0;
        int max = 0;
        if (i<j && i<k) {
        	min=i;
        }
        else {
        	if (j<k && j<i) {
        		min=j;
        	}
        	else {
        		if (k<j && k<i) {
        			min=k;
        		}
        	}
        }
        if (i>k && i>j) {
        	max=i;
        }
        else {
        	if (j>k && j>i) {
        		max=j;
        	}
        	else {
        		if (k>j && k>i) {
        			max=k;
        		}
        	}	
        }
        System.out.println ("Min: " + min);
        System.out.println ("Max: " + max);
	}

}
