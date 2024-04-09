import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

    public static void main(String args[]) {
        double[] notes = getData();
        double result = calcAverage(notes);
        String answer = validation(result);
        impression(notes, result, answer);
    }

    public static double[] getData() {
        Scanner s = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Olá, seja bem-vindo!");
        System.out.println("******************************");
        System.out.println("Digite a primeira nota: ");
        double firstNote = s.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double secondNote = s.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double thirdNote = s.nextDouble();
        System.out.println("Digite a quinta nota: ");
        double fourthNote = s.nextDouble();

        double[] notes = {firstNote, secondNote, thirdNote, fourthNote};
        return notes;
    }

    public static double calcAverage(double[] notes) {
        double totalValue = 0;
        double result;

        for(int i = 0; i < notes.length; i++) {
            totalValue += notes[i];
        }
        result = totalValue / 4;

        return result;
    }

    public static String validation(double result) {
        String answer;
        if(result >= 7) {
            answer =  "Resultado: Aprovado!";
        } else if(result >= 5) {
            answer = "Resultado: Recuperação!";
        } else {
            answer = "Resultado: Reprovado!";
        }

        return answer;
    }

    public static void impression(double[] notes, double result, String answer){
        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("******************************");
        for(int i = 0; i < notes.length; i++){
            System.out.println("Avaliação " + (i + 1) + ": " + notes[i]);
        }
        System.out.println("Média: " + df.format(result));
        System.out.println(answer);
        System.out.println("******************************");
    }
}
