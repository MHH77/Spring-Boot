package com.mhh.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems;

}