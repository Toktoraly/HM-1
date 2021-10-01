package com.company;

public final class Son extends Father {
    private String school;

    public Son(int age, String name, Occupation occupation, Hobby hobby, String school) {
        super(age, name, occupation, hobby);
        this.school = school;
    }

   public Son(int age, String name, Occupation occupation, Hobby hobby) {
        super(age, name, occupation, hobby);

    }
    public String getSchool() {
        return school;
    }

    @Override
    public String getFatherInfo() {
        return super.getFatherInfo()+
                "\nschool: "+ school;
    }
}

