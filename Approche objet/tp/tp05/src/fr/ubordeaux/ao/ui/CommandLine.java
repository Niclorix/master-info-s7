package fr.ubordeaux.ao.ui;

import java.util.Scanner;

import fr.ubordeaux.ao.domain.Reference;

public class CommandLine{

  @SuppressWarnings("unused")
public static void main(String[] args){
    Reference r1 = new Reference("1");
    Reference r2 = new Reference("2");
    Reference r3 = new Reference("3");
    Reference r4 = new Reference("4");
    Reference r5 = new Reference("5");
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a number: ");
    int n = reader.nextInt(); // Scans the next token of the input as an int.
    System.out.println("user input done");
    reader.close();
  }

}
