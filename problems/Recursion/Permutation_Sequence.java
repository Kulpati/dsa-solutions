package Recursion;

public class Permutation_Sequence {
    class Solution {
    StringBuilder re;
    int count;

    private void func(StringBuilder sb, boolean[] used, int n, int k) {
        if (sb.length() == n) {
            count++;
            if(count==k){
                re.append(new StringBuilder(sb));
            }
            return ;
        }
        for (int i = 1; i <= n; i++) {
            if(used[i-1]){continue;}
            used[i-1]=true;
            sb.append((char) (i + '0'));
            func(sb, used, n, k);
            if (count == k) {
                break;
            }
            sb.deleteCharAt(sb.length() - 1);
            used[i-1]=false;
        }
    }

    public String getPermutation(int n, int k) {
        re=new StringBuilder();
        count = 0;
        StringBuilder sb = new StringBuilder();
        boolean used[] = new boolean[n];
        func(sb, used, n, k);
        return re.toString();
    }
}
}
