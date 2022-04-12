package App;

public class Main {
	public static void main(String[] args){
        User user = new User ("Caio", "Ca", "3221");
        Calculator calc = new Calculator(user);
        
        System.out.println(calc.Soma(5, 3));
        System.out.println(calc.Sub(5, 3));
        System.out.println(calc.Mult(5, 3));
        System.out.println(calc.Div(5, 3));
        System.out.println(calc.Func(5, 3));
        System.out.println(calc.Potec(3));
    }
}
