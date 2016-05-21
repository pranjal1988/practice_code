package Practice;

import java.util.Arrays;

public class StringSort {
	
	public static void main(String[] args){
		String ref = "abcdabcsdeflshave";
		char[] arr = ref.toCharArray();
		System.out.println(arr);
		Arrays.sort(arr);
		System.out.println(arr);
		char[] subarr = new char[arr.length];
		int ct = 0;
		for(int i = 0; i < arr.length; i++){
			if(i == 0){
				if(arr[i] != arr[i+1]){
					System.out.println(arr[i]);
				}
			}
			else if(i == arr.length-1){
				if(arr[i] != arr[i-1]){
					System.out.println(arr[i]);
				}
			}
			else if(arr[i] != arr[i+1] && arr[i] != arr[i-1]){
				System.out.println(arr[i]);
				subarr[ct] = arr[i];
				ct++;
			}
		}
		System.out.println(subarr);
		System.out.println(new String(subarr).substring(0,ct));
	}

}
