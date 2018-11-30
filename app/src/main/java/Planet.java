public class Planet {
    private String Planet;
    private int Mass;
    private int Diameter;
    private int Density;
    private int Gravity;

    Planet(String Data) {
        String[] parts = Data.split(" ", 8 );
        Planet = parts[0];
        Mass = Integer.parseInt(parts[1]);
        Diameter = Integer.parseInt(parts[2]);
        Density = Integer.parseInt(parts[3]);
        Gravity = Integer.parseInt(parts[4]);
    }
    String title() { return Planet; }

    String description() {
        return "Mass(10^24kg): " + Mass + "Diameter(kg): " + Diameter + "Density(kg/m^3): " + Density + "Gravity(m/s^2)" + Gravity;
    }
}
