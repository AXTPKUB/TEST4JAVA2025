package quiz4a;


// (1.1) คลาสกำหนด Employee ว่ามีค่าอะไรบ้าง โดยกำหนด ประเภทแต่ละตัว
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2) กำหนด ฟั่งชั่นกำหนดพนักงานเรื่องข้อมูลของพนักงาน เช่น emloyeeid ให้บอกรหัสพนักงาน
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3) สร้างเมธอด คำนวณ ส่งค่าsalary ของ emloyeeid
    public double calculateSalary() {
        return salary;
    }

    // (1.4) สร้างเมธอดเรียก รหัสพนักงาน
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5) สร้างเมธอดเรียกชื่อของพนักงาน
    public String getName() {
        return name;
    }
}