package com.choucair.models.purchase;

import lombok.Data;

@Data
public class Purchase {

    private String key;
    private String client;
    private String nit;
    private String date;
    private String leaves;
    private String entrance;
    private String value;
    private String observations;
}
