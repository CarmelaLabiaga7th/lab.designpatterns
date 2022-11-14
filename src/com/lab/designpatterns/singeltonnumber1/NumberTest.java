package com.lab.designpatterns.singeltonnumber1;

public class NumberTest {
    public static void main(String[] args) {
        Convert convert = Number.instance();
        //convert.convertToWords("515555");
        convert.convertToWords("19");
    }

}
