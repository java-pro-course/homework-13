import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Проверять простое число или нет. Если пользователь ввел число отрицательное или ноль, то выкидывать свой Exception


class simpleNumError extends Exception{
    public simpleNumError(String message){
        super(message);
    }
}
public class Main {
    public static void getSimpleNum(int num) throws simpleNumError {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) throw new simpleNumError("Number not simple");

        }
        if (num == 1)  throw new simpleNumError("Number not simple");
        System.out.println("Simple");
    }
    public static void main(String[] args) throws simpleNumError {
        Scanner in = new Scanner(System.in);
        // обьявляем
        try{
            getSimpleNum(in.nextInt());
        }catch(simpleNumError e){
            System.err.println("Error:" + e.getMessage());
        }catch(Exception e){
            System.err.println("incorrect variables (try to enter int)"+
                    "\n" +"Error: 1");
        }


    }

}