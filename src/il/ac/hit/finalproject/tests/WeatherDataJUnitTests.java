package il.ac.hit.finalproject.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import il.ac.hit.finalproject.classes.Location;
import il.ac.hit.finalproject.classes.OpenWeatherMap;
import il.ac.hit.finalproject.classes.WeatherData;
import il.ac.hit.finalproject.weatherclasses.City;
import il.ac.hit.finalproject.weatherclasses.Clouds;
import il.ac.hit.finalproject.weatherclasses.Humidity;
import il.ac.hit.finalproject.weatherclasses.LastUpdate;
import il.ac.hit.finalproject.weatherclasses.Precipitation;
import il.ac.hit.finalproject.weatherclasses.Pressure;
import il.ac.hit.finalproject.weatherclasses.Temperature;
import il.ac.hit.finalproject.weatherclasses.Visibility;
import il.ac.hit.finalproject.weatherclasses.Weather;
import il.ac.hit.finalproject.weatherclasses.Wind;

public class WeatherDataJUnitTests
{
	private WeatherData weatherData;
	private OpenWeatherMap openWeatherMap;

	@Before
	public void setUp() throws Exception
	{

		openWeatherMap = OpenWeatherMap.getInstance();
		weatherData = openWeatherMap.getWeatherData(new Location("nashua", "US"));
	}

	@After
	public void tearDown() throws Exception
	{
		openWeatherMap = null;
		weatherData = null;
	}

	@Test
	public void testGetCity()
	{
		City expected = weatherData.getCity();
		assertNotNull(expected);
	}

	@Test
	public void testGetClouds()
	{
		Clouds expected = weatherData.getClouds();
		assertNotNull(expected);
	}

	@Test
	public void testGetWind()
	{

		Wind expected = weatherData.getWind();
		assertNotNull(expected);
	}

	@Test
	public void testGetLastUpdate()
	{
		LastUpdate expected = weatherData.getLastUpdate();
		assertNotNull(expected);
	}

	@Test
	public void testGetHumidity()
	{
		Humidity expected = weatherData.getHumidity();
		assertNotNull(expected);
	}

	@Test
	public void testGetPressure()
	{
		Pressure expected = weatherData.getPressure();
		assertNotNull(expected);
	}

	@Test
	public void testGetVisibility()
	{
		Visibility expected = weatherData.getVisibility();
		assertNotNull(expected);
	}

	@Test
	public void testGetPrecipitation()
	{
		Precipitation expected = weatherData.getPrecipitation();
		assertNotNull(expected);
	}

	@Test
	public void testGetWeather()
	{
		Weather expected = weatherData.getWeather();
		assertNotNull(expected);
	}

	@Test
	public void testGetTemperature()
	{
		Temperature expected = weatherData.getTemperature();
		assertNotNull(expected);
	}

}
