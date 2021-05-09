import java.util.Scanner;

import javax.management.InvalidAttributeValueException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite seu aniversario no formato dd/mm/yyyy:");
        try {
            FormatDate.setDate();
            System.out.println(FormatDate.getDate());
        }
        catch (InvalidAttributeValueException e) {
            System.out.println("Mês inválido!");
            System.out.println(e.getMessage());
        }
    }
}
class FormatDate {
    private static String dia, mes, ano;

    public static void setDate() {
        Scanner leitor = new Scanner(System.in);
        String[] data = leitor.nextLine().split("/");
        dia = data[0];
        mes = data[1];
        ano = data[2];
        
        switch (data[1]) {
            case "01":
                mes = Meses.JANEIRO.toString().toLowerCase();
                break;
            case "02":
                mes = Meses.FEVEREIRO.toString().toLowerCase();
                break;
            case "03":
                mes = Meses.MARCO.toString().toLowerCase();
                break;
            case "04":
                mes = Meses.ABRIL.toString().toLowerCase();
                break;
            case "05":
                mes = Meses.MAIO.toString().toLowerCase();
                break;
            case "06":
                mes = Meses.JUNHO.toString().toLowerCase();
                break;
            case "07":
                mes = Meses.JULHO.toString().toLowerCase();
                break;
            case "08":
                mes = Meses.AGOSTO.toString().toLowerCase();
                break;
            case "09":
                mes = Meses.SETEMBRO.toString().toLowerCase();
                break;
            case "10":
                mes = Meses.OUTUBRO.toString().toLowerCase();
                break;
            case "11":
                mes = Meses.NOVEMBRO.toString().toLowerCase();
                break;
            case "12":
                mes = Meses.DEZEMBRO.toString().toLowerCase();
                break;
            default:
                throw new InvalidAttributeValueException();
        }
    } 

    public static String getDate() {
        return String.format("Voce nasceu em %s de %s de %s", dia, mes, ano);
    }
}
enum Meses {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO,
    JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
}
