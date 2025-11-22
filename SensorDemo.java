import java.io.FileWriter;
import java.io.IOException;

public class SensorDemo {
    static Sensor[] sensors = new Sensor[10];

    public static void initialiseSensors() {
        sensors[0] = new WeatherSensor("WS001", "Greenhouse East Wing", 87.5, true);
        sensors[1] = new PressureSensor("PS001", "Mountain Summit Basecamp", 92.3, true);
        sensors[2] = new WeatherSensor("WS002", "Rooftop Observatory", 75.0, true);
        sensors[3] = new PressureSensor("PS002", "Submarine Hull", 88.7, false);
        sensors[4] = new WeatherSensor("WS003", "Underground Lab", 90.0, false);
        sensors[5] = new PressureSensor("PS003", "Aircraft Cabin", 77.2, true);
        sensors[6] = new WeatherSensor("WS004", "Coastal Monitoring Station", 65.5, true);
        sensors[7] = new PressureSensor("PS004", "Deep Cave Entrance", 85.0, true);
        sensors[8] = new WeatherSensor("WS005", "Urban Park Center", 80.0, false);
        sensors[9] = new PressureSensor("PS005", "Desert Research Outpost", 79.5, false);
    }

    public static void writeFile() {
        try (FileWriter weatherWriter = new FileWriter("weather.txt");
             FileWriter pressureWriter = new FileWriter("pressure.txt")) {

            for (Sensor s : sensors) {
                if (s instanceof WeatherSensor) {
                    weatherWriter.write(s.makeReport() + "\n");
                } else if (s instanceof PressureSensor) {
                    pressureWriter.write(s.makeReport() + "\n");
                }
            }

            System.out.println("Files written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        initialiseSensors();
        writeFile();
    }
}
