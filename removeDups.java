import java.io.*;
import java.util.*;

public class removeDups  {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        int [] map = new int[26];
        String newS = "";
        for(int i = 0 ; i<S.length() ; i++)
        {
            char curChar = S.charAt(i);
            map[curChar-'a']++;
            if(map[curChar-'a']==1)
            {
                newS += curChar ;
            }
        }
        return newS ; 
    }
}