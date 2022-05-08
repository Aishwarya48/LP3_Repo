import java.util.*;
import java.math.*;

public class RSA{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int e=0,i=0,x,d=0;
		BigInteger msg;

		System.out.println("Enter number that to be encrypted or decrypted");
		int p = scan.nextInt();

		System.out.println("Enter the 1st Prime Number: ");
		int a = scan.nextInt();

		System.out.println("Enter the 2nd Prime Number: ");
		int b = scan.nextInt();

		int n = a*b;

		System.out.println("Public Key ");
		e = 37;

		// int z = (a-1)*(b-1);
		// System.out.println("the value of z = "+z);

		// e = scan.nextInt();
		// if(e==0){
		// 	for(e=2;e<z;e++){
		// 		if(gcd(e,z)==1){
		// 			break;
		// 		}
		// 	}
		// }
		
		// System.out.println("the value of e = "+e);

		// for(i=0;i<9;i++){
		// 	x = 1+(i*z); 
		// 	if(x%e==0){
		// 		d = x/e;
		// 		break;
		// 	}
		// }

		// System.out.println("the value of d = "+d);

		int num;
		num = (Math.pow(p,e))%n;

		System.out.println("Encrypted message is : -");
		System.out.println(num);

		// BigInteger N = BigInteger.valueOf(n);

		// BigInteger C = BigDecimal.valueOf(num).toBigInteger();
		// msg = (C.pow(d)).mod(N);
		// System.out.println("Derypted message is : ");
		// System.out.println(msg);
	}

	// static int gcd(int e, int z){
	// 	if(e==0)
	// 		return z;
	// 	else
	// 		return gcd(z%e,e);
	// }
}
