/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int badVersion=1;
        int early=1, late=n;
        while(early<=late){
            System.out.println("early= "+early+", late= "+late);
            int m=early+((late-early)/2);
            System.out.println("m= "+m);
            if(isBadVersion(m)){
                badVersion=m;
                if(early==late){
                    return badVersion;
                }
                late=m;
            } else {
                early=m+1;
            }
            System.out.println("early: "+early+", late: "+late);
        }
        return badVersion;
    }
}
