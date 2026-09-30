
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i , soma = 0 , num ;
        
     
        for(i = 0 ; i < 4 ; i = i + 1){
            System.out.println("Digite um número :");
            num = scanner.nextInt();
            
            soma = num + i;
            
        }
        System.out.println(soma);
        
    }
}
