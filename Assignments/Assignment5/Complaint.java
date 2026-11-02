public class Complaint { 
    public String dateReceived;
    public String dateSentToCompany;
    public String product;
    public String subProduct;
    public String issue;
    public String subIssue;
    public String company;
    public int zipCode;
    public String companyPublicResponse;
    public String companyConsumerResponse;
    public boolean timelyResponse;

    public Complaint(String dateReceived, String dateSentToCompany, String product, String subProduct, String issue, String subIssue, String company, int zipCode, String companyPublicResponse, String companyConsumerResponse, boolean timelyResponse) {
        this.dateReceived = dateReceived;
        this.dateSentToCompany = dateSentToCompany;
        this.product = product;
        this.subProduct = subProduct;
        this.issue = issue;
        this.subIssue = subIssue;
        this.company = company;
        this.zipCode = zipCode;
        this.companyPublicResponse = companyPublicResponse;
        this.companyConsumerResponse = companyConsumerResponse;
        this.timelyResponse = timelyResponse;
    }

    public int getComplaintYear() {
        String[] dateParts = dateReceived.split("-");
        return Integer.parseInt(dateParts[0]);
    }
}
