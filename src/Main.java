import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Float> competidores = new HashMap<>();
        competidores.put("Lucas", 80.55F);
        competidores.put("Pedro", 85.49F);
        competidores.put("Paulo", 71.55F);
        competidores.put("Cleber", 71.41F);
        competidores.put("Ivan", 100.55F);
        competidores.put("Lorenzo", 114.57F);
        competidores.put("Beto", 100.44F);
        competidores.put("Carla", 99.55F);
        competidores.put("Carol", 94.10F);
        competidores.put("Cecilia", 84.43F);
        competidores.put( "Beth", 85.18F);
        competidores.put("Lorena", 102.15F);
        competidores.put("Felipe", 162.55F);
        competidores.put("Amelia", 105.28F);
        competidores.put("Duda", 122.55F);
        competidores.put("Renata",  112.15F);
        competidores.put("Jean", 110.55F);
        competidores.put("Júnior", 115.30F);
        competidores.put("claúdio", 117.50F);
        competidores.put("Daniel", 94.15F);


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

