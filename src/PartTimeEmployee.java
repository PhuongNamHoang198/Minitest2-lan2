public class PartTimeEmployee extends Employee {
    private float workHours;

    public PartTimeEmployee(String id, String fullName, int age, String phone, String email, float workHours) {
        super(id, fullName, age, phone, email);
        this.workHours = workHours;
    }

    public PartTimeEmployee(float workHours) {
        this.workHours = workHours;
    }

    @Override
    public float getSalary() {
        return workHours*100;
    }

    public PartTimeEmployee() {
    }

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "workHours=" + workHours +
                '}';
    }
}