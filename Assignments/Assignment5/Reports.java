
public class Reports {

    public static int countCompanies(ArrayList<Complaint> complaints) {
        HashSet<String> uniqueCompanies = new HashSet<>();
        for (Complaint complaint : complaints) {
            uniqueCompanies.add(complaint.company);
        }
        return uniqueCompanies.size();
    }

    public static int[] timelyResponseCount(ArrayList<Complaint> complaints) {
        int timelyCount = 0;
        int untimelyCount = 0;
        for (Complaint complaint : complaints) {
            if (complaint.timelyResponse) {
                timelyCount++;
            } else {
                untimelyCount++;
            }
        }
        return new int[]{timelyCount, untimelyCount};
    }

    public static int[] periodRangeCount(ArrayList<Complaint> complaints, int startYear, int endYear) {
        int inRangeCount = 0;
        int outOfRangeCount = 0;
        for (Complaint complaint : complaints) {
            int complaintYear = complaint.getComplaintYear();
            if (complaintYear >= startYear && complaintYear <= endYear) {
                inRangeCount++;
            } else {
                outOfRangeCount++;
            }
        }
        return new int[]{inRangeCount, outOfRangeCount};
    }

    public static int[] complaintsPerYear(ArrayList<Complaint> complaints) {
        HashMap<Integer, Integer> yearCountMap = new HashMap<>();
        for (Complaint complaint : complaints) {
            int year = complaint.getComplaintYear();
            yearCountMap.put(year, yearCountMap.getOrDefault(year, 0) + 1);
        }
        int[] counts = new int[yearCountMap.size()];
        int index = 0;
        for (int count : yearCountMap.values()) {
            counts[index++] = count;
        }
        return counts;
    }

    public static String[] topFiveSubProducts(ArrayList<Complaint> complaints) {
        HashMap<String, Integer> subProductCountMap = new HashMap<>();
        for (Complaint complaint : complaints) {
            String subProduct = complaint.subProduct;
            subProductCountMap.put(subProduct, subProductCountMap.getOrDefault(subProduct, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(subProductCountMap.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        String[] topFive = new String[Math.min(5, sortedEntries.size())];
        for (int i = 0; i < topFive.length; i++) {
            topFive[i] = sortedEntries.get(i).getKey();
        }
        return topFive;
    }
}