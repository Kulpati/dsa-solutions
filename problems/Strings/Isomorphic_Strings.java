import java.util.Hashtable;
class Solution {
    public boolean isIsomorphic(String s, String t) {
       
          Hashtable<Character,Character> ht1 = new Hashtable<>();
          HashSet<Character> set= new HashSet<>();
        for(int i=0;i<t.length();i++){
          
        
            if(ht1.containsKey(s.charAt(i))){
                if(ht1.get(s.charAt(i))!=t.charAt(i)){
                    return false;}}
            else{if(set.contains(t.charAt(i))){return false;}
                set.add(t.charAt(i));
                ht1.put(s.charAt(i),t.charAt(i));}
        }
    return true;}
}
