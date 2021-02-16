package com.api.ordering.controller.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {

    //metodo para decodar string. Dessa forma evita espaços em brancos.
    public static String decodeParam(String s){
       try {
           return URLDecoder.decode(s, "UTF-8");
       }
       catch (UnsupportedEncodingException e){
           return "";
        }
    }

    //Metodo para converter uma lista de Inteiro para String.
    public static List<Integer> decodeIntList(String s){
        String [] vet = s.split(",");
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<vet.length; i++){
            list.add(Integer.parseInt(vet[i]));
        }
        //return Arrays.asList(Arrays.asList(s.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList()));

        return list;
    }
}