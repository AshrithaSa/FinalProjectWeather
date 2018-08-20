package il.ac.hit.finalproject.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import il.ac.hit.finalproject.classes.IWeatherDataService;
import il.ac.hit.finalproject.classes.Location;
import il.ac.hit.finalproject.classes.OpenWeatherMap;
import il.ac.hit.finalproject.classes.WeatherData;
import il.ac.hit.finalproject.exceptions.WeatherDataServiceException;


public class OpenWeatherMapJUnitTests
{

	static IWeatherDataService openWeatherMap;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		openWeatherMap = OpenWeatherMap.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		openWeatherMap = null;

	}

	@Test
	public void testGetWeatherData() throws WeatherDataServiceException
	{
		WeatherData excpected = openWeatherMap.getWeatherData(new Location("nashua", "US"));
		assertNotNull(excpected);

	}

}
