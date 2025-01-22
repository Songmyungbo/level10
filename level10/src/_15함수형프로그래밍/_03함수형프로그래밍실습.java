package _15함수형프로그래밍;

import java.util.function.BinaryOperator;

import _15함수형프로그래밍.CalFunction.Calculate;

@FunctionalInterface
interface CalFunction{
	 int cal(int a, int b);

class Calculate{
	int add(int a,int b) {return a+b;}
	int subtract(int a,int b) {return a-b;}
	int multiply(int a,int b) {return a*b;}
}
}

public class _03함수형프로그래밍실습 {

	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.subtract(10, 20));
		System.out.println(cal.multiply(10, 20));
		
		//
		CalFunction add = (int a, int b) -> a+b;
		System.out.println(add.cal(10, 20));
		CalFunction subtract = (int a, int b) ->a-b;
		System.out.println(subtract.cal(10, 20));
		CalFunction multiply = (int a, int b) -> a*b;
		System.out.println(multiply.cal(10, 20));
		
		BinaryOperator<Integer> add2 = (a,b) ->a+b;
		System.out.println(add2.apply(10, 20));
	}

}
