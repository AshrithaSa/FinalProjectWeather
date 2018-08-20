package il.ac.hit.finalproject.classes;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

import il.ac.hit.finalproject.exceptions.WeatherDataServiceException;


public class OpenWeatherMap implements IWeatherDataService
{
	private WeatherData weatherData = new WeatherData();
	private static volatile OpenWeatherMap weatherMap;

	/**
	 * OpenWeatherMap object empty constructor
	 */
	private OpenWeatherMap()
	{
	}

	/**
	 * The singleton property Get for the instance of this class.
	 * 
	 * @return The one and only reference of the OpenWeatherMap class
	 */
	public static OpenWeatherMap getInstance()
	{
		if (weatherMap == null)
		{
			weatherMap = new OpenWeatherMap();
		}

		return weatherMap;
	}

	/**
	 * An implemented IWeatherDataService override method getWeatherData
	 */
	@Override
	public WeatherData getWeatherData(Location location) throws WeatherDataServiceException
	{
		String city = location.getCity();
		String country = location.getCountry();

		try
		{
			URL url;
			String appID = "8380b4e97b14ef26fcc147af1edb8d92";
			url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country + "&units="
					+ location.getUnit() + "&mode=xml&APPID="+appID );

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			InputStream in = con.getInputStream();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(in);

			weatherData.setAllWeatherDataByTagNames(doc);
		}
		catch (Exception e)
		{
			System.out.println("Weather parsing error. please try again or contact app developer.");
			e.printStackTrace();
		}

		return weatherData;
	}
}