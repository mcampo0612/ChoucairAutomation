package com.choucair.data.factories;

import com.choucair.exceptions.InvoiceNotFoundException;
import com.choucair.models.registerclient.RegisterClient;
import com.choucair.util.GetEnvironment;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class RegisterClientFactory {

    private static final String REGISTER_CLIENT_PATH = "/registerclient/register-client-data.json";

    public static List<RegisterClient> getRegisterClient() throws FileNotFoundException {
        return Arrays.asList(from(getRegisterClientFile()).getObject("registerClient", RegisterClient[].class));
    }

    public static RegisterClient getRegisterClientByKey(String key) throws FileNotFoundException {
        return getRegisterClient().stream()
                .filter(a -> a.getKey()
                        .equals(key))
                .findFirst()
                .orElseThrow(() ->
                        new InvoiceNotFoundException(String.format("register client with key %s not found", key)));
    }

    private static URL getRegisterClientFile() throws FileNotFoundException {
        String path = GetEnvironment.actual() + REGISTER_CLIENT_PATH;
        URL filePath = RegisterClientFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for register client: " + path);
        }
        return filePath;
    }
}
