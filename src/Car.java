public class Car {
    private String m_make;
    private String m_model;
    private double m_fuelcapacity;
    private double m_currentfuel;
    private double m_mpg;

    public Car(String make, String model, double fuelcapacity, double mpg) {
        m_make = make;
        m_model = model;
        m_fuelcapacity = fuelcapacity;
        m_currentfuel = fuelcapacity; // Start with a full tank
        m_mpg = mpg;
    }

    public String getMake() {
        return m_make;
    }

    public String getModel() {
        return m_model;
    }

    public double getFuelCapacity() {
        return m_fuelcapacity;
    }

    public double getCurrentFuel() {
        return m_currentfuel;
    }

    public double getMPG() {
        return m_mpg;
    }

    

    public void setFuelCapacity(double fuelcapacity) {
        if(fuelcapacity <= 0) {
            System.out.println("fuel capacity cannot be negative or equal to zero");
        }
        else if(m_currentfuel > fuelcapacity) {
            m_currentfuel = fuelcapacity;
        }
        fuelcapacity = m_fuelcapacity;
    }

    public void setCurrentFuel(double fuel) { /////////// may be more or less
        if(fuel > m_fuelcapacity ) {
            System.out.println("fuel cannot be negative or be greater than " + m_fuelcapacity);
            return;
        }
        fuel = m_currentfuel;
    }

    public void setMPG( double MPG) {
        if(MPG <= 0) {
            System.out.println("MPG cannot be negative or equal to zero");
            return;
        }
        m_mpg = MPG;
    }

    public void drive(double miles) {
        double fuelUsed = miles/m_mpg;
        if(fuelUsed <= 0) {
            System.out.println("miles cannot be negative or equal to zero");
        }
        else if(fuelUsed > m_currentfuel) {
            double maxMiles = m_currentfuel/m_mpg;
            (this).setCurrentFuel(0);
            System.out.println(m_make + m_model + " only drove " + maxMiles + " miles because There was not enough fuel");
        }
        else {
            (this).setCurrentFuel(m_currentfuel - fuelUsed);
            System.out.println(m_make + m_model + " drove " + miles + "miles");
        }
    }
    public void refuel(double fuel) {
        (this).setCurrentFuel(m_currentfuel + fuel);
        System.out.println(m_make + m_model + " refueled. Current fuel: " + fuel + "gallons" );
    }
}