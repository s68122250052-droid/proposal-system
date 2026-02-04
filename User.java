import java.util.List;

public class User extends Login {

    private int user_id;
    private int department_id;
    private String user_username;
    private String user_password;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;

    public void userLogin() {
        loginStatus();
    }

    public void addProposal(Proposal proposal) {
        // เพิ่ม Proposal
    }

    public void viewProposal() {
        // ดู Proposal
    }

    public void confirmProposal(Proposal proposal) {
        // อนุมัติ / ปฏิเสธ
    }

    public void createReports() {
        // สร้าง Report
    }

    public void viewReports() {
        // ดู Report
    }

    public void updateDepartment(Department department) {
        // แก้ไขแผนก (เฉพาะบาง role)
    }
}
