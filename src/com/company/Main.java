package com.company;

import java.util.Scanner;

public class Main {


        public static void main(String[] args){  //Check if String contains a sequence
            String str_Sample = "RockStar";

            String test = "Tar";
            System.out.println("Contains sequence 'tar': " + str_Sample.contains(test.compareToIgnoreCase()));
        }

}
