class Solution {
    public List<String> mostVisitedPattern(String[] usernames, int[] timestamps, String[] websites) {
        int n = usernames.length;
        
        //we have to order the timestamps

        List<int[]> orderedTimestamps = new ArrayList<>();

        for(int i=0;i<n;i++) {
            orderedTimestamps.add(new int[]{timestamps[i],i});
        }

        orderedTimestamps.sort((a,b) -> a[0]-b[0]);
        //^ sort according to the timestamp

        //build a map of users to their websites visited

        Map<String, List<String>> userToSites = new HashMap<>();

        for(int i=0;i<n;i++) {
            int index = orderedTimestamps.get(i)[1];
            userToSites.computeIfAbsent(usernames[index],k->new ArrayList<>()).add(websites[index]);
        }

        HashMap<String, Integer> patternsToCounts = new HashMap<>();
        //for every user, add their pattern to a set, and count their visits against that set

        for(String user : userToSites.keySet()) {
            List<String> sites = userToSites.get(user);
            Set<String> userPatterns = new HashSet<>();
            for(int i=0;i<sites.size();i++) {
                for(int j=i+1;j<sites.size();j++) {
                    for(int k=j+1;k<sites.size();k++) {
                        userPatterns.add(sites.get(i)+"#"+sites.get(j)+"#"+sites.get(k));
                    }
                }
            }
            for(String userPattern : userPatterns) {
                patternsToCounts.put(userPattern, patternsToCounts.getOrDefault(userPattern, 0)+1);
            }
        }

        int highestCount = 0;
        String highestPattern = "";

        for(String pattern : patternsToCounts.keySet()) {
            int count = patternsToCounts.get(pattern);
            if(count>highestCount || (count==highestCount && pattern.compareTo(highestPattern)<0)) {
                highestPattern = pattern;
                highestCount = count;
            }
        }

        return Arrays.asList(highestPattern.split("#"));
    }
}
