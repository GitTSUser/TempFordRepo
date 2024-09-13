public class FindFact{

public static int findFactorialV1(int n){
	int result=1;
	for(int i=1;i<=n;i++){
	result=result*i;
	}

return result;
}
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