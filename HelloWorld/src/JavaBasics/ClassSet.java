package JavaBasics;

import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClassSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] ={1,2,3,4,5};
		Set<Integer> setting = new HashSet<>(Arrays.asList(arr));
		
		System.out.println(setting);
		
		for(int i=1;i<=setting.size(); i++);{	
	//WS		System.out.println(i);
		}
			
		
	}

}
