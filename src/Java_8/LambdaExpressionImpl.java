package Java_8;

import java.util.List;

public class LambdaExpressionImpl {
	
	List<String> arguments;
	int count;

	public List<String> getArguments() {
		return arguments;
	}

	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}
	
	public void loopThrough(){
		count = 0;
		arguments.forEach((arg) -> {System.out.println(count++ + arg);});
	}

}
