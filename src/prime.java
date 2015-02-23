
public class prime {


	public static void main (String[] args){

		int n = 9;
		PrintNprimes(n);
		//Isprime(n);
	}

	private static void Isprime(int n) {
		// TODO Auto-generated method stub
		if(n%2==0){
			System.out.println("Not Prime");
			
		}
		else{
			boolean flag = true;
			for(int i=3;i<n;i=i+2){
				if(n%i==0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("Yes Prime");
			}else{
				System.out.println("Not Prime");
			}
			
		}

	}

	private static void PrintNprimes(int n) {
		// TODO Auto-generated method stub
		//System.out.println(n);
		for(int i=3;i<=100;i=i+2){
			boolean flag = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag = false;
					break;
				}else{
					flag = true;

				}				
			}
			if(flag){
				System.out.println(i);

			}
		}
	}
}
