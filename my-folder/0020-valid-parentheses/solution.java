public class Solution {
    public boolean isValid(String s) {
        if (s==null || s.length()%2!=0) {
            return false;
        }
        
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        Stack<Character> q = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            switch(s.charAt(i)) {
                case '(' :
                    case '[' :
                        case '{' : q.push(map.get(s.charAt(i)));
                        break;
                        case ')':
                            case ']':
                                case '}': if (!q.isEmpty() ){
                                    System.out.println("char= "+s.charAt(i));
                                            char popped = q.pop();
                                            System.out.println("popped= "+popped);
                                            if (popped != s.charAt(i)) {
                                                System.out.println("not E");
                                                return false;
                                            }
                                            } else {
                                                return false;
                                            }
                                            break;
            }
        }
        
        if(!q.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
