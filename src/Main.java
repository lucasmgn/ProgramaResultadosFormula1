import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Float> competidores = new HashMap<>();
        competidores.put("Lucas", (float) 80.55);
        competidores.put("Pedro", (float) 85.49);
        competidores.put("Paulo", (float) 71.55);
        competidores.put("Cleber", (float) 71.41);
        competidores.put("Ivan", (float) 100.55);
        competidores.put("Lorenzo", (float) 114.57);
        competidores.put("Beto", (float) 100.44);
        competidores.put("Carla", (float) 99.55);
        competidores.put("Carol", (float) 94.10);
        competidores.put("Cecilia", (float) 84.43);
        competidores.put( "Beth", (float) 85.18);
        competidores.put("Lorena", (float) 102.15);
        competidores.put("Felipe", (float) 162.55);
        competidores.put("Amelia", (float) 105.28);
        competidores.put("Duda", (float) 122.55);
        competidores.put("Renata", (float) 112.15);
        competidores.put("Jean", (float) 110.55);
        competidores.put("Júnior", (float) 115.30);
        competidores.put("claúdio", (float) 117.50);
        competidores.put("Daniel", (float) 94.15);


        vencedor(competidores);
        perdedor(competidores);
        resultado(competidores);
        media(competidores);
        totalCompetidores(competidores);



    }
    private static void totalCompetidores(Map<String,Float> competidorVencedor){
        System.out.println("Total de competidores: " + competidorVencedor.size());
        System.out.println("----------------------------------------------------");

    }

    private static void vencedor(Map<String,Float> competidorVencedor){

        Map.Entry<String, Float> minEntry = null;

        for (Map.Entry<String, Float> entry : competidorVencedor.entrySet()) {
            if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0) {
                minEntry = entry;

            }
        }

        boolean b = minEntry != null;
        if(b) {
            System.out.println("---------- Vencedor ----------");
            System.out.println("Nome: " + minEntry.getKey() + ", Tempo: " + minEntry.getValue() + " minutos");
            System.out.println(" ");
        }

    }

    private static void perdedor(Map<String,Float> competidorVencedor){
        Map.Entry<String, Float> maxEntry = null;

        for (Map.Entry<String, Float> entry : competidorVencedor.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
            }
        }
        boolean b = maxEntry != null;

        if(b) {
            System.out.println("----------- Último colocado ------------");
            System.out.println("Nome: " + maxEntry.getKey() + ", Tempo: " + maxEntry.getValue() + " minutos");
            System.out.println(" ");
        }

    }

    private static void resultado(Map<String,Float> competidorVencedor){
        int cont = 1;

        System.out.println("------------------- Resultado ----------------------");
        List<Map.Entry<String, Float>> resultado = new ArrayList<>(competidorVencedor.entrySet());
        resultado.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Float> colocacao : resultado) {
            System.out.println(cont + "º lugar - Nome: " + colocacao.getKey() + " Tempo: " + colocacao.getValue() + " minutos.");
            System.out.println("----------------------------------------------------");

            cont++;

        }

    }


    private static void media(Map<String,Float> competidorVencedor) {

        float total = 0;

        for (Map.Entry<String, Float> entry : competidorVencedor.entrySet()){
            total = total + entry.getValue();

        }
        int media = (int) (total/ competidorVencedor.size());
        System.out.println("Média de tempo: " + media + " minutos.");
        System.out.println("----------------------------------------------------");
    }

}

