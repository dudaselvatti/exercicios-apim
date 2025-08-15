import java.util.Queue;
import java.util.LinkedList;

public class exer24 {
    public static void main(String[] args) {
        
        Queue<String> filaimpress = new LinkedList<>();

        filaimpress.add("Documento1.pdf");
        filaimpress.add("Foto.png");
        filaimpress.add("Planilha.xlsx");
        filaimpress.add("Apresentacao.pptx");
        filaimpress.add("Relatorio.docx");

        System.out.print("Fila de impressão:");
        for (String doc : filaimpress) {
            System.out.print("\n" + doc);
        }

        System.out.print("\nIniciando a impressão...\n");
        while(!filaimpress.isEmpty()){
            System.out.println("Imprimindo: " + filaimpress.poll());
        }
        
    }
}
