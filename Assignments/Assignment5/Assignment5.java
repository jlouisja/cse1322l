public class Assignement5 {

    public static Complaint stringToComplaint(String line) {
        String[] parts = line.split(",");
        String company = parts[0].trim();
        String subProduct = parts[1].trim();
        boolean timelyResponse = Boolean.parseBoolean(parts[2].trim());
        int complaintYear = Integer.parseInt(parts[3].trim());
        return new Complaint(company, subProduct, timelyResponse, complaintYear);
    }
    public static void main(String[] args) {
        // prompt user for input file name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String fileName = scanner.nextLine();

        // read complaints from file
        ArrayList<Complaint> complaints = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                complaints.add(stringToComplaint(line));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        // crate 'errors.txt' file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("errors.txt"))) {
            for (Complaint complaint : complaints) {
                if (complaint.company.isEmpty() || complaint.subProduct.isEmpty()) {
                    bw.write("Error: Missing company or sub-product in complaint: " + complaint.toString() + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to errors file: " + e.getMessage());
        }

        // create reports.txt file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reports.txt"))) {
            bw.write("Total number of companies: " + Reports.countCompanies(complaints) + "\n");
            int[] timelyCounts = Reports.timelyResponseCount(complaints);
            bw.write("Number of timely responses: " + timelyCounts[0] + "\n");
            bw.write("Number of untimely responses: " + timelyCounts[1] + "\n");
            int[] periodCounts = Reports.periodRangeCount(complaints, 2015, 2020);
            bw.write("Number of complaints in period 2015-2020: " + periodCounts[0] + "\n");
            bw.write("Number of complaints outside period 2015-2020: " + periodCounts[1] + "\n");
            int[] complaintsPerYear = Reports.complaintsPerYear(complaints);
            bw.write("Complaints per year: " + Arrays.toString(complaintsPerYear) + "\n");
            String[] topSubProducts = Reports.topFiveSubProducts(complaints);
            bw.write("Top five sub-products: " + Arrays.toString(topSubProducts) + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to reports file: " + e.getMessage());
        }

        // create arraylist of complaints
        ArrayList<Complaint> complaintsList = new ArrayList<>(complaints);
        // read complaints from file and add to arraylist
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                complaintsList.add(stringToComplaint(line));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}