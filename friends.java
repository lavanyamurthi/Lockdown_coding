import java.io.*;
import java.util.*;

public class Friend{
     public static void main(String[] args) {
        String str = "hello friend";
        char ele;
        int i=0,j=0;
        for(i= 0 ;i<str.length();i++)
        {
            int c = 0;
            ele = str.charAt(i);
            // System.out.println(ele);
            if (ele != '-')
            {
                for(j= i ;j<str.length();j++)
                {
                    if (ele == str.charAt(j))
                    {
                        c++;
                        
                    }
                    
                }
                str = str.replace(ele, '-');
                System.out.println(ele+" "+c);
            }
            
        }
        
        
    }
}
