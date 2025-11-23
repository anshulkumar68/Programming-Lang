package stringBuilder;
// package STRING_BUILDER;

public class Index 
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Chest Press");
        //  char at index 0
        System.out.println(sb.charAt(0));

        //  set char at index 0
        sb.setCharAt(0, 'L');
        System.out.println(sb);

        // for insert char at particular index
        sb.insert(4, 'o');
        System.out.println(sb);

        // delete the extra 'o'
        sb.delete(5, 6);
        System.out.println(sb);

        // append
        sb.append('o');
        System.out.println(sb);
    }
}
