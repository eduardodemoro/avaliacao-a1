import java.util.Scanner;

public class App {
          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
            // Solicita as informações do artefato
            System.out.print("Descrição do artefato: ");
            String descricao = scanner.nextLine();
            System.out.print("Tipo do artefato (1 - Arma/tecnologia similar de metal, 2 - Ferramentas ou utensílios domésticos, 3 - Artefato desconhecido): ");
            int tipo = scanner.nextInt();
            System.out.print("Percentual de carbono-14: ");
            int percentualC14 = scanner.nextInt();

            String artefato="";
            if (tipo==1)
            artefato= "Arma/tecnologia similar de metal";
          else if(tipo==2)
          artefato="Ferramentas ou utensílios domésticos";
          else if(tipo==3)
          artefato="Artefato desconhecido";
        
            // Calcula o período aproximado do artefato
            String periodo = "";
            if (percentualC14 >= 75) {
              periodo = "Idade moderna";
            } else if (percentualC14 >= 28) {
              periodo = "Idade Média";
            } else if (percentualC14 >= 4) {
              periodo = "Idade do Bronze";
            } else {
              periodo = "Pré-história";
            }
        
            // Escolhe o nome do pesquisador responsável
            String pesquisador = "";
            if (periodo.equals("Idade moderna")) {
              if (tipo == 1) {
                pesquisador = "Doutora Kassandra";
              } else if (tipo == 2) {
                pesquisador = "Doutor Edward";
              } else {
                pesquisador = "Doutor Cesare Borgia";
              }
            } else if (periodo.equals("Idade Média")) {
              if (tipo == 1) {
                pesquisador = "Doutor Kenway";
              } else if (tipo == 2) {
                pesquisador = "Doutor Ézio";
              } else {
                pesquisador = "Doutor Rodrigo";
              }
            } else if (periodo.equals("Idade do Bronze")) {
              if (tipo == 1) {
                pesquisador = "Doutor Alexios";
              } else if (tipo == 2) {
                pesquisador = "Doutor Altair";
              } else {
                pesquisador = "Doutor Cormac";
              }
            } else {
              if (tipo == 1) {
                pesquisador = "Doutor Arno";
              } else if (tipo == 2) {
                pesquisador = "Doutora Elise";
              } else {
                pesquisador = "Doutora Braddock";
              }
            }
        
            // Imprime a etiqueta com as informações do artefato
            System.out.println("Descrição do artefato: " + descricao);
            System.out.println("Tipo do artefato: " + artefato);
            System.out.println("Período aproximado do artefato: " + periodo);
            System.out.println("Pesquisador responsável: " + pesquisador);
        
            scanner.close();
          }
        
    }