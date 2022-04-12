package App;

public class Calculator {
	public int A;
    public int B;
    
    private User user;
    private String login = "Ca";
    private String password = "3221";
    
    public Calculator(User user){
        this.user = user;
    }
    
    public String Soma(int A, int B){
        if(this.user.login(this.login, this.password)){
            return Integer.toString(A + B);
        }else{
            return ("O usuário não tem acesso");
        }
    }
    
    public String Sub(int A, int B){
        if(this.user.login(this.login, this.password)){
            return Integer.toString(A - B);
        }else{
            return ("O usuário não tem acesso");
        }
    }
    
    public String Mult(int A, int B){
        if(this.user.login(this.login, this.password)){
            return Integer.toString(A * B);
        }else{
            return ("O usuário não tem acesso");
        }
    }
    
    public String Div(int A, int B){
        if(this.user.login(this.login, this.password)){
            return Double.toString(A/B);
        }else{
            return ("O usuário não tem acesso");
        }
    }
    
//  Seguindo a função f(x) = ax+b
//  f(x) = 0
//  ax + b = 0
//  ax = - b
//  x = -(a/b)
//  segue o calculo: 
    
    public String Func(int A, int B){
        if(this.user.login(this.login, this.password)){
            float X = (A/B) * -1;
            return Float.toString(X);
        }else{
            return ("O usuário não tem acesso");
        }
    }
    
//   Dado que A seja elevado a potencia de seu prórpio valor segue o calculo: 
    
     public String Potec(int A){
        if(this.user.login(this.login, this.password)){
            int I;
            int register = 0;
            for(I = 0; I <= A; I++){
                register = A * A;
            }
            return Integer.toString(register);
        }else{
            return ("O usuário não tem acesso");
        }
    }
}
