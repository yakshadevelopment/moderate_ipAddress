package java8.mod.ipaddress;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.mod.ipaddress.TestUtils.*
;public class MainTest {

	@Test
	public void testCheckIpAddress() throws Exception{
	  yakshaAssert(currentTest(),Main.checkIpAddress("128.254.143.196")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.checkIpAddress("128.264.143.196")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(), Main.checkIpAddress(".128.254.143.196")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.checkIpAddress("128.254.143.196.121")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(), Main.checkIpAddress("128.254.-143.196")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.checkIpAddress("128.25b.143.196")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(), Main.checkIpAddress("128.254.143.196.")?"true":"false",businessTestFile);
	}

}
