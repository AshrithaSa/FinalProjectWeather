package il.ac.hit.finalproject.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import il.ac.hit.finalproject.classes.Location;


public class LocationJUnitTests
{

	private static Location location;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		location = new Location("nashua", "US");
		location.setUnit("metric");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		location = null;
	}

	@Test
	public void testGetUnit()
	{
		String expected = "metric";
		String actual = location.getUnit();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCity()
	{
		String expected = "nashua";
		String actual = location.getCity();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCountry()
	{
		String expected = "US";
		String actual = location.getCountry();
		assertEquals(expected, actual);
	}

}
