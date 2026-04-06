package com.java8;


interface lambda{
	void add() ;
}

interface multi{
	int multi(int a, int b);
}
public class LambdaExpression {

	
	interface jk{
		void jk();
	}
	
	public static void main(String[] args) {

		lambda l=()->{
			System.out.println("Add Method Implemented");
		};
		
		l.add();
		
		jk j=()->{
			System.out.println("Jk");
		};
		j.jk();
		
		multi m=(a,b)->a*b;
		
		System.out.println(m.multi(4, 6));
	}

}





