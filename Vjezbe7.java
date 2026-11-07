package sedmaNedjelja;
import java.util.Scanner;
public class Vjezbe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String binarni = (""); //oktalni
        
        while(n > 0) {
        	binarni = (n%2) + binarni; //8
        	n = n/2; //8
        }
        System.out.println("Binarno" + binarni);
        sc.close();
        
	}

}
