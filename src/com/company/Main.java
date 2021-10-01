package com.company;

public class Main {

    public static void main(String[] args) {
        Hobby hobby = new Hobby("Reading", "Toktorgul library");
        Hobby hobby1 = new Hobby("Runing", "Naavoi park");
        Father father = new Father(60,"Manas", Occupation.TEACHER, hobby1);
	    Son Toktoraly = new Son(25,"ToktorALY",Occupation.DOCTOR,hobby, "Nariman");
        Son Daniair = new Son(25,"Daniiar",Occupation.POLICE,hobby);

        System.out.println(Toktoraly.getFatherInfo());
    }

}
