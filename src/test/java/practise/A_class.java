package practise;

class A_class {

	A_class(){
		System.out.println("A");
	}
}

class B_class extends A_class{
	
	B_class(){
		System.out.println("B");
	}
}
class C_class extends B_class{
	
	C_class(){
		System.out.println("c");
	}
}

