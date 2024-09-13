public class FindFact{

public static int findFactorial(int n){

	if(n==1){
	return 1;
	}
	return n*findFactorial(n-1);
}
public static void main(String arg[]){
int result=findFactorial(5);
System.out.println("result is:"+result);
}
}