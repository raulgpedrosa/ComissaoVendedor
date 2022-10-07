package ComissaoVendedor;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        
        String nomeVendedor = "Joao";
        float salario;
        float totalVendasMes;
        float salarioEComissao;
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println(nomeVendedor);
        
        System.out.print("Salario mensal: R$ ");
        salario = leitor.nextFloat();
        
        System.out.println("Total vendas mes: R$ ");
        totalVendasMes = leitor.nextFloat();
        
        salarioEComissao = (totalVendasMes * 0.15f) + salario;
        
        System.out.println("Salario + comissao = R$ " + salarioEComissao);
        
 
    }
}
