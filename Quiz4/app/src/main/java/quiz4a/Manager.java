package quiz4a;
 
// 2.1 สร้างคลาสเมเนเจอ ขยายคลาสพนักงาน และกำหนดแผนกและโบนัส
public class Manager extends Employee {
    private String department;
    private double bonus;

    
    // 2.2 ประกาศ เมเนเจอร์ ให้เรียกคลาสในemployee และอื่นๆ พร้อมสร้างตัวแปร dpm และ bonus 
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    public void SalaryCannotBeNegative1(double salary){
        if (salary < 0)  {
            System.out.println("error");
        } else if (salary >= 1) {
            System.out.println(salary);
        }
    }

    // 2.3 สร้างฟั่งชั่นย้อนดูรายละเอียดของ พนักงานคนนั้น  โดยส่งค่าคืนออกไปทีละบรรทัด
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4 สร้างฟั่งชั่นถ้าย้อนดูรายละเอียดของพนักงานคนนั้น ถ้าสั่งfullโดยส่งค่าคืนออกไปทีละบรรทัดแบบเต็ม และถ้าไม่ได้ขอfull ก็จะส่งแค่รหัสกับชื่อพนักงาน 
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
