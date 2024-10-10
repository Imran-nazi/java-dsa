package lec6;

public class Global_Variable {
	static int x=100;
	public static void main(String[] args) {
		System.out.println(x);
		Update();
		System.out.println("updation= "+x);

	}
	private static void Update() {
		// TODO Auto-generated method stub
		int x=78;
		System.out.println("local variable x= "+x);
		//update of global variable
		Global_Variable.x-=20;
		
	}

}
