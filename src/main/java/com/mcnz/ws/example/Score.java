package com.mcnz.ws.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Score {

    public int wins, losses, ties;

    // Constructor, getters, setters, etc.
}