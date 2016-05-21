package ObjectReferenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		if(rd.readLine().trim().equals("0")){
			System.exit(-1);
		}
		ReferredClassA a1 = new ReferredClassA(5, "a1_string", "a1");
		ReferredClassA a2 = new ReferredClassA(10, "a2_string", "a2");
		ReferringClassB b1 = new ReferringClassB(a1, a2);
		int ct = 1;
		int a = 5;
		int b = 6;
		swap(a,b);
		System.out.println("a : " + a + " b : " + b);
		while(true){
			Thread.sleep(5000);
			//System.gc();
			System.out.println(ct + ")a1 ref -> " + a1);
			System.out.println(ct + ")a2 ref -> " + a2);
			System.out.println(ct + ")b1 ref -> " + b1);
			ct++;
			if(ct > 15){
				a2 = null;
			}
			if(ct > 30){
				a1 = null;
			}
			if(ct > 50){
				b1 = null;
			}
			/*if(rd.readLine().trim().equals("0")){
				System.exit(-1);
			}*/	
		}
	}
	
	private static void swap(int n1, int n2){
		int temp = n1;
		n2 = n1;
		n1 = temp;
	}

}
