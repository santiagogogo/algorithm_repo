package com.lailai.test;

/**
 * @author santiago.ge
 * @description:
 * @date 2021/7/16
 */
public enum PersonConfig {
    STU(new Student(),"st");
    private Person person;

    String type;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    PersonConfig(Person person, String type) {

        this.person = person;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Person getFullCardByType(String type) {
        for (PersonConfig config : PersonConfig.values()) {
            if (type.equals(config.getType())) {
                return config.getPerson();
            }
        }
        return null;
    }
}
