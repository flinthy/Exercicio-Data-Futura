package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime passado = LocalDateTime.of(2010,5,15,10,0,0);

        System.out.println(passado);

        LocalDateTime futuro = passado.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);

    }
}
