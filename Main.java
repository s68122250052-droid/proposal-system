public class Main {

    public static void main(String[] args) {

        // สร้าง Department
        Department department = new Department();

        // สร้าง User
        User user = new User();
        user.userLogin();

        // สร้าง Applicant
        Applicant applicant = new Applicant();

        // สร้าง Proposal
        Proposal proposal = new Proposal();

        // สร้าง Report
        Report report = new Report();

        System.out.println("ระบบเริ่มทำงานเรียบร้อย");
    }
}
