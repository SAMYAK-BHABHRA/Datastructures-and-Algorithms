package Strings;
//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class LargestOddNodInString {
        // Driver code
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                String s = br.readLine();
                Solution obj = new Solution();
                System.out.println(obj.maxOdd(s));
            }
        }
    }
    // } Driver Code Ends
    
    
    
    
    class Solution {
    
        String maxOdd(String s) {
            // code here
            String res="";
            int k=-1;
            for(int i=s.length()-1;i>=0;i--){
                if((s.charAt(i)-'0')%2==1){
                    k=i;
                    break;
                }
            }
            if(k==-1){
            return res;
            }
            for(int i=0;i<=k;i++){
                res=res+s.charAt(i);
            }
            return res;
           
        }
    }
