class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){return 0;}
        if(needle.length()>haystack.length()){return -1;}
        int mod=1000000009;
        int base=31;
        long hash=0;
        for(int i=0;i<needle.length();i++){
            int val=needle.charAt(i)-'a'+1;
            hash=(hash*base+val)%mod;
        }
        long hs=0;
        for(int i=0;i<needle.length();i++){
            int val=haystack.charAt(i)-'a'+1;
            hs=(hs*base+val)%mod;
        }
        if(hs==hash){
            int j=0;
            while(j<needle.length()){
                if(needle.charAt(j)!=haystack.charAt(j)){break;}
                j++;
            }
            if(j==needle.length()){return 0;}
        }
        long maxpow=1;
        for(int i=0;i<needle.length()-1;i++){
            maxpow=(maxpow*31)%mod;
        }
        int t=0;
        for(int i=needle.length();i<haystack.length();i++){
            int out=(haystack.charAt(t)-'a'+1);
            hs=(hs-(out*maxpow)%mod+mod)%mod;
            int in=(haystack.charAt(i)-'a'+1);
            hs=(hs*base+in)%mod;
            if(hs==hash){
                int m=0;
            while(m<needle.length()){
                if(needle.charAt(m)!=haystack.charAt(i+m-needle.length()+1)){break;}
                m++;
            }
            if(m==needle.length()){return i-needle.length()+1;}
        }
            t++;   
    }
return -1;}
}
