package com.lab.designpatterns.number1singleton;

public class NumberTest {
    public static void main(String[] args) {
        Convert convert = Number.instance();
        //convert.convertToWords("515555");
        convert.convertToWords("2212212212");
    }

}
