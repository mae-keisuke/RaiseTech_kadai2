public class Company {
    private String name;

    private String industry;

    private int employeeNumber;

    private double aveAge;

    private double aveMoney;

    private int id;

    public Company(int id, String name, String industry, int employeeNumber, double aveAge, double aveMoney) {
        this.id = id;
        this.name = name;
        this.industry = industry;
        this.employeeNumber = employeeNumber;
        this.aveAge = aveAge;
        this.aveMoney = aveMoney;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getAveAge() {
        return aveAge;
    }

    public double getAveMoney() {
        return aveMoney;
    }

    public int getId() {
        return id;
    }
}
