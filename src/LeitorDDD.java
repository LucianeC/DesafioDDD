import java.util.Scanner;

public class LeitorDDD {
    public static void main(String[] args) {
        Scanner DetectorDDD = new Scanner(System.in);
        System.out.println("Digite o DDD que deseja consultar: ");
        int DDD = DetectorDDD.nextInt();
        if (DDD == 11) {
            System.out.println(" O DDD 11 é de Sao Paulo");
        }
        else if (DDD == 61) {
            System.out.println("O DDD 61 é de Brasilia");
        }
        else if (DDD == 71) {
            System.out.println("O DDD 71 é de Salvador");
        }
        else if (DDD == 21) {
            System.out.println("O DDD 21 é de Rio de Janeiro");
        }
        else if (DDD == 32) {
            System.out.println("O DDD 31 é de Juiz de Fora");
        }
        else if (DDD == 19) {
            System.out.println("O DDD 19 é de Campinas");
        }
        else if (DDD == 27) {
            System.out.println("O DDD 27 é de Vitoria");
        }
        else if (DDD == 31) {
            System.out.println("O DDD 32 é de Belo Horizonte");
        } else {
            System.out.println("O DDD "+ DDD +" não está cadastrado ou não existir");
        }
    }
}