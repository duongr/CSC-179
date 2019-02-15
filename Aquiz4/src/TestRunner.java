import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
		if(result.getFailureCount()>0) {
			for(Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
		}
		else System.out.println("All tests successful");
	}

}
