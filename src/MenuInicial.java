import java.util.Scanner;

public class Menu {
    public void exibirNaTela() {
        Scanner leitura = new Scanner(System.in);
        int opcao;


        for (int i = 0; i < 3; i++) {

            System.out.println("*************************************");
            System.out.println("BEM VINDO AO CONVERSOR DE MOEDAS");
            System.out.println("ESCOLHA UMA DAS OPÇÕES: ");
            System.out.println("1- (BRL) Real brasileiro para o Dólar americano (USD)");
            System.out.println("2- (USD) Dólar americano para o Real brasileiro (BRL)");
            System.out.println("3- (JPY) Iene japonês para o Real brasileiro (BRL)");
            System.out.println("4- (EUR) Euros para o Dólar americano (USD)");
            System.out.println("5- (RUB) Rublo russo para o Real brasileiro (BRL)");
            System.out.println("6- (BRL) Real brasileiro para o Rublo russo (RUB)");
            System.out.println("7- Sair da aplicação");
        }
        System.out.println("*************************************");

        System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA");
        opcao = leitura.nextInt();





    }
}
