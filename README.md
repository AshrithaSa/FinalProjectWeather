# README #
 
 * Summary of set up
 An example for using this library:
 
```
#!java


 public static void main(String[] args)
 	{
 		IWeatherDataService dataService = WeatherDataServiceFactory.getWeatherDataService(service.OPEN_WEATHER_MAP);
 		WeatherData data;
 		try
 		{
 			data = dataService.getWeatherData(new Location("nashua", "US"));
 			System.out.println(data.toString());
 		}
 		catch (WeatherDataServiceException e)
 		{
 			e.printStackTrace();
 		}
 	}
```
