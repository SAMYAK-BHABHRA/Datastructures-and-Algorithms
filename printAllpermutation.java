import java.io.*;
import java.util.*;
class printAllpermutation {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> list = new ArrayList<String>();
        permutationCalc(S , "", list);
        Collections.sort(list);
        return list ; 
    }
    
    public void permutationCalc(String S , String asf , ArrayList<String> list )
    {
        if(S.length() == 0 )
        {
            list.add(asf);
            return ; 
        }
        for(int i = 0 ; i<S.length() ; i++)
        {
            char ch = S.charAt(i);
            String qlpart = S.substring(0,i);
            String rlpart = S.substring(i+1);
            String roq = qlpart + rlpart ; 
            permutationCalc(roq , asf + ch , list );
        }
    }
}
