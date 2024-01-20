import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double maior = 0;
        int escolhido = 0;

        for(int i = 0; i < a; i++){
            int aluno = sc.nextInt();
            double nota = sc.nextDouble();

            if(nota > maior){
                maior = nota;
                escolhido = aluno;
            }
            
        }

        sc.close();
        if(maior < 8){
            System.out.println("Minimum note not reached");
        }else{
            System.out.println(escolhido);
        }
    }
}
