package in.nit.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

//Test case : A class that will test our code
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {

	//test methods
	
//	@BeforeAll
//	public static void setupOnce() {
//		System.out.println("FROM ONETIME SETUP");
//	}
//	
//	@BeforeEach
//	public void setup() {
//		//setup, init data
//		System.out.println("FROM SETUP");
//	}
//	
//	@Test
//	@Order(1)
//	public void testSave()
//	{
//		System.out.println("Hello-Save");
//	}
//	
//	@Test
//	@Order(2)
//	public void testUpdate()
//	{
//		System.out.println("Hello-Update");
//	}
//	
//	@Test
//	@Order(3)
//	@Disabled
//	public void testDelete()
//	{
//		System.out.println("Hello-Delete");
//	}
//	
//	@AfterEach
//	public void clear() {
//		System.out.println("CLEAR DATA");
//	}
//	
//	@AfterAll
//	public static void closeAll() {
//		System.out.println("FROM ONETIME AT END");
//	}
	
//	@RepeatedTest(value = 3,name="{displayName} - {currentRepetition}/{totalRepetitions}")
//	@DisplayName("MULTIPLE TEST")
//	public void testMultiple(TestInfo info) {
//		//System.out.println("HELLO:"+info.getTestClass().get().getName());
//		//System.out.println("HELLO:"+info.getTestMethod().get().getName());
//		System.out.println("HELLO:"+info.getDisplayName());
//	}
	
	@Test
	@Tag("dev")
	public void testA() {
		System.out.println("HELLO-TEST-A");
	}
	
	@Test
	@Tag("prod")
	public void testB() {
		System.out.println("HELLO-TEST-B");
	}
	
	@Test
	@Tag("prod")
	public void testC() {
		System.out.println("HELLO-TEST-C");
	}
}
