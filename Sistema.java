import java.util.Scanner;
public class SistemaBancário {
	
	public static void main(String[] args) {
		String nome = "Paulo Victor Cruz Soares";
		String tipoConta = "Corrente";
		double saldoInicial = 250.00;
		
				       
		System.out.println("**********************************");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo atual: " + saldoInicial);
		System.out.println("**********************************");
		
		Scanner leitura = new Scanner(System.in);
		String opção = """
				       Escolha uma opção
				       
				       1- Colsutar o Saldo
				       2- Receber valor
				       3- Transferir valor
				       4- Sair
		  	           """;
		int num;
                do {	
			System.out.println(opção);
			num = leitura.nextInt();
			
			if(num == 1) {
				System.out.println("Saldo: " + saldoInicial);
			}else if(num == 2) {
			    System.out.println("Informe o valor que deseja receber: ");
			    double receber = leitura.nextDouble();
			    saldoInicial += receber;
			}else if(num == 3) {
				System.out.println("Informe um valor que deseja transferir: ");
				double transferir = leitura.nextDouble();
				if(saldoInicial < transferir) {
					System.out.println("Não suficiente para realizar trasnferencia");;
				}else {
					saldoInicial -= transferir;
				}
			}else if(num == 4) {
				System.out.println("*****************************");
				System.out.println("Operação finalizada");
				System.out.println("Nome: " + nome);
				System.out.println("Tipo de conta: " + tipoConta);
				System.out.println("Saldo: " + saldoInicial);
				System.out.println("******************************");
			}
	   }while(num != 4);

     }
   }
