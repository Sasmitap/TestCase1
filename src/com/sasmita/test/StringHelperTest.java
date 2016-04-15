package com.sasmita.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sasmita.junit.StringHelper;

public class StringHelperTest {

	@Test
	public void testAssertEquals(){
		assertEquals("ABC", "ABC");
		assertEquals("ABC", "ABCD");
	}
	
	
	
	/*@Before
	public void before(){
		System.out.println("Before");
	}
	
	@After
	public void after(){
		System.out.println("After");
	}*/
	
	
	
	@BeforeClass
	public static void before(){
		System.out.println("Before");
	}
	
	@AfterClass
	public static void after(){
		System.out.println("After");
	}
	
	
	
	@Test
	public void testTruncateInFirst2Position() {
		System.out.println("testTruncateInFirst2Position");
		StringHelper stringHelper=new StringHelper();
		
		String exceptedOutput="RTAA";
		String actualOutput=stringHelper.truncateInFirst2Position("RTAA");
		assertEquals(exceptedOutput, actualOutput); 
		
		assertEquals("RR", stringHelper.truncateInFirst2Position("AARR"));
		assertEquals("RRAA", stringHelper.truncateInFirst2Position("RRAA"));
	
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersSame(){
		System.out.println("In testAreFirstAndLastTwoCharactersSame");
		StringHelper stringHelper=new StringHelper();
		assertTrue(stringHelper.areFirstAndLastTwoCharactersSame("AB"));
		/*assertTrue(stringHelper.areFirstAndLastTwoCharactersSame(""));
		assertTrue(stringHelper.areFirstAndLastTwoCharactersSame("ABC"));*/
	}
	
	
	@Test
	public void testArraySort(){
		int[] givenArray={2,4,1,8,5};
		int[] expectedSortedArray={1,2,4,5,8};
		Arrays.sort(givenArray);
		assertArrayEquals(expectedSortedArray, givenArray);
	}
	
	
	@Test(expected=NullPointerException.class)
	public void testArraySortWithNullConditin(){
		
		int[] givenArray=null;
		Arrays.sort(givenArray);
	/**
	 * 
	 * It is not giving NullPointerException But We have written the Expectation Of The Exception
	 * So It is making the Test Failure	
	 */
		
	/*	int[] a={};
		Arrays.sort(a);*/
		
	}
	
	
	/**
	 * 
	 * Test The Performance
	 * 
	 */
	@Test(timeout=1)
	public void testArraysSortPerformance(){
		for(int i=0;i<=1000;i++){
			int[] number={i,i-1,i+1};
			Arrays.sort(number);
		}
	}

}
