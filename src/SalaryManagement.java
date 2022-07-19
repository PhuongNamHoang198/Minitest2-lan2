import java.util.ArrayList;

public class SalaryManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        FullTimeEmployee nv1 = new FullTimeEmployee(2000, 10, 15000);
        FullTimeEmployee nv2 = new FullTimeEmployee(500, 100, 20000);
        PartTimeEmployee nv3 = new PartTimeEmployee(4f);
        PartTimeEmployee nv4 = new PartTimeEmployee(3f);
        employees.add(nv1);
        employees.add(nv2);
        employees.add(nv3);
        employees.add(nv4);

        System.out.println(getFullTimeUnderSalary());
        System.out.println(getPartTimeSalary());
    }

    //    1. Tinh luong trung binh cua cong ty
    public static float getAverageSalary(){
        float sum= 0;
        for (Employee e: employees
        ) {
            sum += e.getSalary();
        }
        float average = sum/employees.size();
        return average;
    }
    //    2. Danh sach nhan vien luong thap hon luong tb
    public static ArrayList<Employee> getFullTimeUnderSalary(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        float average = getAverageSalary();
        for (Employeegi employee : employees) {
            if (employee instanceof FullTimeEmployee &&
                    employee.getSalary() < average)
                employeeArrayList.add(employee);
        }
        return employeeArrayList;
    }
    // 3. Tinh luong phai tra cho Part-time employees
    public static float getPartTimeSalary(){
        float sum = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee)
                sum += employee.getSalary();
        }
        return sum;
    }
}