//������� ������ ��������

public class Factorial {

	int fact(int n){
		
		int result;
		
		if (n==1) 	
			return 1;
		
		result = fact(n-1)*n;
		System.out.printf("n=  %d\n", +n);
		System.out.printf("result = %d\n", +result);
		return result;
	}
	
	
}
