import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestCaseA.class, TestCaseB.class, TestCaseC.class, TestCaseD.class})
public class TestSuite {}
