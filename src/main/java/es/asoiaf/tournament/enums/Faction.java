package es.asoiaf.tournament.enums;

public enum Faction {

    MARTELL("martell", "Martell");

    private String code;

    private String name;

    Faction(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
