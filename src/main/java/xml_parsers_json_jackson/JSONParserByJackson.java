package xml_parsers_json_jackson;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONParserByJackson {
    public static void main(String[] args) {
        try {
            File json = new File("src/main/resources/bank.json");
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);
            JsonNode accountsNode = rootNode.get("bank").get("accounts").get("account");
            Iterator<JsonNode> iterator = accountsNode.elements();

            while (iterator.hasNext()) {
                JsonNode account = iterator.next();
                System.out.println("Account ID: " + account.get("account_id").asInt());
                System.out.println("Account number: " + account.get("account_number").asText());
                System.out.println("Balance: " + account.get("balance").asDouble());
                System.out.println("------------------------");
            }
        } catch (IOException e) {
            System.out.println("Error reading JSON file tree: " + e.getMessage());
        }
    }
}
