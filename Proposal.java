import java.util.Date;

public class Proposal {

    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status = StatusProposal.Waiting;

    // Composition
    private Applicant applicant;

    public void viewProposal() {
        // แสดง Proposal
    }

    public StatusProposal viewStatus() {
        return proposal_status;
    }

    public void updateProposal() {
        // แก้ไข Proposal
    }

    public void deleteProposal() {
        // ลบ Proposal
    }

    public void archiveProposal() {
        // เก็บถาวร
    }

    public Applicant viewApplicant() {
        return applicant;
    }
}
