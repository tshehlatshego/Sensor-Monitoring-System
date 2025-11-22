public class PressureSensor extends Sensor {

    public PressureSensor(String id, String location, double batteryLevel, boolean status) {
        super(id, location, batteryLevel, status);
    }

    @Override
    public void activate() {
        status = true;
    }

    @Override
    public void deactivate() {
        status = false;
    }

    @Override
    public double boostBattery() {
        if (!status) {
            return batteryLevel;
        }
        double boosted = batteryLevel * 1.15; // increase by 15%
        if (boosted > 100) {
            boosted = 100;
        }
        batteryLevel = boosted;
        return batteryLevel;
    }

    @Override
    public String makeReport() {
        String report = "Pressure sensor {\n";
        report += "  id: " + id + "\n";
        report += "  location: " + location + "\n";
        report += String.format("  boosted battery: %.1f%%\n", boostBattery());
        report += "  status: " + status + "\n";
        report += "}\n";
        return report;
    }
}
