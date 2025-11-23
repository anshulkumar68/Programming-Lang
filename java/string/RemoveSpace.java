package string;
// import javax.sql.rowset.spi.SyncResolver;

// Java program to Remove spaces from a string

public class RemoveSpace
{
    public static void main(String[] args) 
    {
        String str="World purest";
        char[] c=str.toCharArray();
        StringBuffer str2=new StringBuffer();
        for(int i=0; i<c.length; i++)
        if((c[i]!=' ')&&(c[i]!='\t'))
        {
            str2.append(c[i]);
        }
        System.out.println("String after removing spaces:\n"+str2);
    }
}
