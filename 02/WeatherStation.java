public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        // StaticDisplay staticDisplay = new StaticDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(27, 65, 30.4f);
        weatherData.setMeasurements(28, 70, 29.4f);
        weatherData.setMeasurements(26, 90, 29.2f);
    }
}
