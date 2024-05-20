import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversor {

    public double cambioMoeda(String moedaInserida, String moedaOpcao) {

        try {
            String minhaChave = "b5645b832f977007f0e34e5c";
            String enderecoUrl = "https://v6.exchangerate-api.com/v6" + minhaChave + "/latest" + moedaInserida;


            URL url = new URL(enderecoUrl);
            HttpURLConnection conectar = (HttpURLConnection) url.openConnection();
            conectar.setRequestMethod("GET");


            int status = conectar.getResponseCode();
            if (status != 200) {
                System.out.println("Possível erro no código. solicitação: " + status);
                return  -1;
            }

            JsonParser parser = new JsonParser();
            JsonElement raiz = parser.parse(new InputStreamReader(conectar.getInputStream()));
            JsonObject objeto = raiz.getAsJsonObject();


            JsonObject taxaConversao = objeto.getAsJsonObject("converaion_rates");

            if (!taxaConversao.has(moedaInserida)) {
                System.out.println("ESSE TIPO DE MOEDA É INVÁLIDA");
                return -1;
            }

            return taxaConversao.get(moedaInserida).getAsDouble();
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao obter os dados: " + e.getMessage());
            return -1;
        }
    }
}
