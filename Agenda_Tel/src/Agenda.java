import java.util.Arrays;
import java.util.Scanner;

public class Agenda {

    static Scanner input = new Scanner(System.in);
    static int indiceDeContagem = 0;
    static int nLinhas = 15;
    static int contadorId = 0;
    static String[][] matriz = new String[nLinhas][4];


    public static void exibirContato() {
        for (int i = 0; i < matriz.length; i++) {

            if(matriz[i][0] != null ) {
                System.out.println("ID: " + matriz[i][0] + ", Nome: " + matriz[i][1] +
                        ", telefone: " + matriz[i][2] + ", Email: " + matriz[i][3]);
                System.out.println("--------------------------------------------------------------------------");

            }
        }
    }
    public static void adicionarContato(String[][] matriz) {
        int id = contadorId + 1;

        matriz[contadorId][0] = String.valueOf(id);

        System.out.println("Digite o nome do usuário:");
        matriz[contadorId][1] = input.nextLine();

        System.out.println("Digite o telefone:");
        matriz[contadorId][2] = input.nextLine();

        System.out.println("Digite o email:");
        matriz[contadorId][3] = input.nextLine();

        System.out.println("Registro inserido com sucesso. ID: " + id);
        contadorId++;
    }

    public static void editarContato(String[][] matriz) {

        System.out.print("Digite o Telefone do registro a ser editado: ");
        int editarId = input.nextInt();
        input.nextLine();

        for (int i = 0; i <= contadorId; i++) {

            if (Integer.parseInt(matriz[i][0]) == editarId) {
                System.out.print("Novo Nome: ");
                matriz[i][1] = input.nextLine();

                System.out.print("Novo Número de telefone: ");
                matriz[i][2] = input.nextLine();

                System.out.print("Novo Email: ");
                matriz[i][3] = input.nextLine();


                System.out.println("Registro atualizado com sucesso.");

            break;
            }
        }
    }


    public static void removerContato(){
        System.out.print("Digite o ID do registro a ser excluído: ");
        int deletarId = input.nextInt();
        for(int i=0 ; i< matriz.length ; i++){
            if(Integer.parseInt(matriz[i][0]) == deletarId){

            }

        }


    }

    public static void detalharContato(){}
}
