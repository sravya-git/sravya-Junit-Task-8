package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveInitialATest {

	@Test
	void test1() 
	{
		RemoveInitialA ri=new RemoveInitialA();
		String actual=ri.removeInitialA("AABCDA");
		assertEquals(actual,"BCDA");
		
		
	}
	@Test
	void test2()
	{
		RemoveInitialA ri=new RemoveInitialA();
		String actual=ri.removeInitialA("BCDA");
		assertEquals(actual,"BCDA");
	}
	@Test
	void test3()
	{
		RemoveInitialA ri=new RemoveInitialA();
		String actual=ri.removeInitialA("ABCDA");
		assertEquals(actual,"BCDA");
	}
	@Test
	void test4()
	{
		RemoveInitialA ri=new RemoveInitialA();
		String actual=ri.removeInitialA("BCD");
		assertEquals(actual,"BCD");
	}
	@Test
	void test5()
	{
		RemoveInitialA ri=new RemoveInitialA();
		String actual=ri.removeInitialA("");
		assertEquals(actual,"");
	}

}
