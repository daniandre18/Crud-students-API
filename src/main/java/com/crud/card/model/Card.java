package com.crud.card.model;

import lombok.Data;

import java.sql.Date;

@Data
public class Card {
    int id_card;
    String fullName;
    String documentNumber ;
    String phone;
    Date date;
    int status;
}
