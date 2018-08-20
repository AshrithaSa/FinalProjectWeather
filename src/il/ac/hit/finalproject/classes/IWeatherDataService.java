package il.ac.hit.finalproject.classes;

import il.ac.hit.finalproject.exceptions.WeatherDataServiceException;


public interface IWeatherDataService
{
	public WeatherData getWeatherData(Location location) throws WeatherDataServiceException;
}
