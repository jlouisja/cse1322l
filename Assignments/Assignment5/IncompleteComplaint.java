public class IncompleteComplaint extends Complaint {
    public String badRecord;

    public IncompleteComplaint(String dateReceived, String dateSentToCompany, String product, String subProduct, String issue, String subIssue, String company, int zipCode, String companyPublicResponse, String companyConsumerResponse, boolean timelyResponse, String badRecord) {
        super(dateReceived, dateSentToCompany, product, subProduct, issue, subIssue, company, zipCode, companyPublicResponse, companyConsumerResponse, timelyResponse);
        this.badRecord = badRecord;
    }


    public String getBadRecord() {
        return badRecord;
    }
}