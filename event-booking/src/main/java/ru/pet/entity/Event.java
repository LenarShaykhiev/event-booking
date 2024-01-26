package ru.pet.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Event {

    private String title;
    private String description;
    private String address;
    private Date date;
    private int price;
    private String ageLimit;
    private List<String> comments;

}
