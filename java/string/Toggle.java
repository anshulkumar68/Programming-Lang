package string;
// Java program to toggle each character in a string

// public class Toggle 
// {
//     static void toggle(char[] str)
//     {
//         // char str[];
//         for(int i=0; i<str.length ; i++)
//         {
//             if(str[i]>='A' && str[i]<='Z')
//                 str[i]=(char) (str[i]+'a'-'A');
//             else if(str[i]>='a' && str[i]<='z')
//                 str[i]=(char) (str[i]+'A'-'a');
//         }
//     }
//     public static void main(String[] args)
//     {
//         char[] str="Anshul Kumar".toCharArray();
//         toggle(str);
//         // char[] ch=str.toCharArray();
//         // for (int i = 0; i < str.length(); i++)
//         //     System.out.print(ch[i]);
//         System.out.println(String.valueOf(str));
//     }    
// }




public class Toggle 
{
    // static void toggle(String txt)
    // {
    //     char[] str=txt.toCharArray();
    //     for(int i=0; i<str.length ; i++)
    //     {
    //         if(str[i]>='A' && str[i]<='Z')
    //             str[i]=(char) (str[i]+'a'-'A');
    //         else if(str[i]>='a' && str[i]<='z')
    //             str[i]=(char) (str[i]+'A'-'a');
    //     }
    // }
    public static void main(String[] args)
    {
        String txt="Anshul Kumar";
        char[] str =txt.toCharArray();
        for(int i=0; i<str.length ; i++)
        {
            if(str[i]>='A' && str[i]<='Z')
                str[i]=(char) (str[i]+'a'-'A');
            else if(str[i]>='a' && str[i]<='z')
                str[i]=(char) (str[i]+'A'-'a');
        }
        System.out.println("String after Toggle : ");
        for(int i=0; i<txt.length(); i++)
            System.out.print(str[i]);
    }    
}
