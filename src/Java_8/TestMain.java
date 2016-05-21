package Java_8;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	
	public static void main(String[] args){
		LambdaExpressionImpl lm = new LambdaExpressionImpl();
		lm.setArguments(Arrays.asList(args));
		lm.loopThrough();
		ArrayList<String> la = new ArrayList<String>();
		la.add("new Test1");
		la.add("new Test2");
		lm.setArguments(la);
		lm.loopThrough();
	}
}
