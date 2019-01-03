package com.pwc.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CommonFilterImplTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public CommonFilterImplTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(CommonFilterImplTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testFilter() {
		CommonFilter filter = new CommonFilterImpl();
		assertTrue(filter.filter("A"));
	}
}
