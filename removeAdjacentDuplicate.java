// public class removeAdjacentDuplicate {
    
//}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class removeAdjacentDuplicate {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.rremove(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String rremove(String s) {
        // code here
        StringBuilder t;
        while(true){
            t=new StringBuilder("");
            int i=0,j;
            while(i<s.length()){
                j=i+1;
                while(j<s.length() && s.charAt(i) ==s.charAt(j)) j++;
                if(j==(i+1)) t.append(s.charAt(i));
                i=j;
            }
            if(t.length()==s.length()) break;
            s=t.toString();
        }
        return s;
    }
}