// public class WeatherData {
//     /**
//      * このメソッドは気象観測所が
//      * 更新されるたびに呼び出されます
//      */
//     public measurementsChanged() {
//         float temp = getTempeature();
//         float humidity = getHumidity();
//         float pressure = getPressure();

//         currentConditionDisplay.update(temp, humidity, pressure);
//         statisticsDisplay.update(temp, humidity, pressure);
//         forecastDisplay(temp, humidity, pressure);

//         return true;
//     }
// }

public class WeatherData {
    /**
     * このメソッドは気象観測所が
     * 更新されるたびに呼び出されます
     */
    public measurementsChanged() {
        float temp = getTempeature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay(temp, humidity, pressure);

        return true;
    }
}

// Subject
public interface WeatherData {
    TemperatureSenser ts = new TemperatureSenser();
    HumiditySenser hs = new HumiditySenser();
    PressureSenser ps = new PressureSenser();

    registerObserver();
    removeObserver();
    notifyObservers();
}

// Observer
public interface Disaplay {
    update();
}

// ConcreteSubject
public class TemperatureSensor implements WeatherData {
    public void registerObserver() {
    }
    public void removeObserver() {
    }
    public void notifyObservers() {
    }
}
public class HumiditySensor implements WeatherData {
    public void registerObserver() {
    }
    public void removeObserver() {
    }
    public void notifyObservers() {
    }
}
public class PressureSensor implements WeatherData {
    public void registerObserver() {
    }
    public void removeObserver() {
    }
    public void notifyObservers() {
    }
}

// Concrete Observer
public class CurrentConditionDisplay implements Display {
    public void update() {
    }
}
public class StatisticsDisplay implements Display {
    public void update() {
    }
}
public class ForecastDisplay implements Display {
    public void update() {
    }
}
