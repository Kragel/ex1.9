package com.company;

public class Main {

    public static void main(String[] args) {
        Integer iob;
        Double dob;
        Character cob;
        Boolean bob;

        met1(7);
        met2(7.0);
        met3('a');
        met4(true);

	  }
	  public static void met1(Integer iob){
        System.out.println("Integer");
      }
      public static void met2(Double dob){
        System.out.println("Double");
      }
    public static void met3(Character cob){
        System.out.println("Character");
    }
    public static void met4(Boolean bob){
        System.out.println("Boolean");
    }
}
