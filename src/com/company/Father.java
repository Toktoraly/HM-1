package com.company;

public class Father extends  GrandFather{

    private Occupation occupation;
    private  Hobby hobby;

    public Father(int age, String name, Occupation occupation, Hobby hobby) {
        super(age, name);
        this.occupation = occupation;
        this.hobby = hobby;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public String getFatherInfo(){
        return super.getInfo()+
                "\nOccupation: "+ occupation+
                "\nHobby:"+ hobby.getHobby()+
                "\nHobby place:"+ hobby.getAddress();
    }

    public final boolean drinkVodka(){
        if (occupation == Occupation.IMAM) {
            return false;
        }
        else return true;
    }
   }
