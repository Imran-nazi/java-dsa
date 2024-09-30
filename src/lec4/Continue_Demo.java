package lec4;

public class Continue_Demo {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			if(i==2) {
				continue;
				//continue skips , when i value is ==2, and will print rest...
			}
			System.out.println(i+" ");
		}
	}

}
