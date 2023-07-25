package ex01_Calculate;

public class MainWrapper {

	public static void main(String[] args) {
  	Calculator calc=new Calculator();
  	
  	
  	double a=1.5;
    double b=1.2;
    int c=0;
    int d=10;
    
    System.out.println(calc.addition(a, b));
    System.out.println(calc.substraction(a, b));
    System.out.println(calc.multiplication(a, b));
    System.out.println(calc.division(a, b));
	}

}
