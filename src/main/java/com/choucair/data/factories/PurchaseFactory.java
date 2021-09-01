package com.choucair.data.factories;


import com.choucair.exceptions.InvoiceNotFoundException;
import com.choucair.models.purchase.Purchase;
import com.choucair.util.GetEnvironment;


import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class PurchaseFactory {

    private static final String PURCHASE_PATH = "/qa/purchase/purchase-data.json";

    public static List<Purchase> getMoneyTransfer() throws FileNotFoundException {
        return Arrays.asList(from(getPurchaseFile()).getObject("qa/purchase", Purchase[].class));
    }

    public static Purchase getPurchaseByKey(String key) throws FileNotFoundException {
        return getMoneyTransfer().stream()
                .filter(a -> a.getKey()
                        .equals(key))
                .findFirst()
                .orElseThrow(() ->
                        new InvoiceNotFoundException(String.format("purchase with key %s not found", key)));
    }

    private static URL getPurchaseFile() throws FileNotFoundException {
        String path = GetEnvironment.actual() + PURCHASE_PATH;
        URL filePath = PurchaseFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for purchase: " + path);
        }
        return filePath;
    }

}
