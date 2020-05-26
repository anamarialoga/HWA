package service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.NoUsernameGiven;
import exceptions.UsernameUsed;
import model.Message;
import model.PremiumName;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private static List<Message> messages=new ArrayList<Message>();
    public static void loadMessages() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("../HWA/src/main/resources/datastorage/chat.json"));
            TypeReference<List<Message>> typeReference = new TypeReference<List<Message>>() {
            };
            messages = mapper.readValue(inputStream, typeReference);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addMessage(String username) throws NoUsernameGiven {
        loadMessages();

        Message ct = new Message(username);
        messages.add(ct);
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file=new File("../HWA/src/main/resources/datastorage/chat.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, messages);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
