package Tasca7.S1_T07_n2exercici1;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {
    // TODO Crea una anotació personalitzada que ha de permetre serialitzar un objecte Java en un fitxer JSON.
    //  L’anotació ha de rebre el directori on es col·locarà el fitxer resultant.

    public static void main(String[] args) throws IOException {

        User user = new User(1, "Mark");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(User.JsonSerializable.filepath), user);


    }



}