import java.util.Scanner;

class Variable{
    private static Variable equation = new Variable();

    private Variable(){
            this.equation=null;
    }
    public static Variable getEquation(){
        return equation;
    }
    public void result(double x, double y){
        if(y==0){
            System.out.println("на ноль не делим ");
            return;
        }
        double rez = 2*x+3/y;
        System.out.println("Результат 2*х+3/у:  " + rez);
    }
}
public class Main {
    public static void main(String[] args) {
        Variable variable = Variable.getEquation();
        System.out.println("Введите переменные для выражения 2*х+3/у");
        System.out.println("Введите переменную х:");
        Scanner in = new Scanner(System.in);
        double x= in.nextDouble();
        System.out.println("Введите переменную у: ");
        Scanner am =new Scanner(System.in);
        double y = am.nextDouble();
        variable.result(x,y);
    }
}