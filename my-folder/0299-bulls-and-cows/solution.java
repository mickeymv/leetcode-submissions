import java.util.*;
import java.util.ArrayList;

public class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        HashMap<Integer, Integer> cowsMap = new HashMap<Integer,Integer>();
        int size=secret.length();
        for(int i=0;i<size;i++) {
            int number= secret.charAt(i);
            if(map.get(number)!=null) {
                ArrayList<Integer> indicesOfNumber = map.get(number);
                indicesOfNumber.add(i);
                map.put(number,indicesOfNumber);
            } else {
                ArrayList<Integer> indicesOfNumber = new ArrayList<Integer>();
                indicesOfNumber.add(i);
                map.put(number,indicesOfNumber);
            }
        }
        int bulls=0,cows=0;
        for(int j=0;j<size;j++) {
            int number = guess.charAt(j);
            if(map.get(number)!=null){
                ArrayList<Integer> indicesOfNumber = map.get(number);
                if (indicesOfNumber.contains(j)) {
                    bulls++;
                    indicesOfNumber.remove(Integer.valueOf(j));
                } else {
                    if (cowsMap.get(number)!=null) {
                    cowsMap.put(number,cowsMap.get(number)+1);
                    } else {
                        cowsMap.put(number,1);
                    }
                    }
            }
        }
        Set cowNumberKeys = cowsMap.keySet();
        Iterator cowNumberIterator = cowNumberKeys.iterator();
        while(cowNumberIterator.hasNext()) {
            Integer cowNumber = (Integer)cowNumberIterator.next();
            if (map.get(cowNumber)!=null) {
                ArrayList<Integer> indicesOfCowNumber = map.get(cowNumber);
                if(indicesOfCowNumber.size()>cowsMap.get(cowNumber)) {
                    cows+=cowsMap.get(cowNumber);
                } else {
                    cows+=indicesOfCowNumber.size();
                }
            }
        }
        return String.valueOf(bulls)+"A"+String.valueOf(cows)+"B";
        
    }
}
