import java.util.*;
public class phonebook {
    //Complete this code or write your own from scratch


	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        String[] names = new String[n];
        int[] number = new int[n];
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            names[i]=name;
            number[i]=phone ;
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            for(int i=0;i<n;i++){
                if(s==names[i]){
                    System.out.println(s+"="+number[i]);
                    break;
                }
            }
            System.out.println("Not found");
		}
	}
}




}
