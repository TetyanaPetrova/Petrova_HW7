public enum PetrovaHW4enum {
    PLUS("+"),
    MINUS("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    REMAINDER("%");

    public String mathSing;

    public String getMathSing() {
        return mathSing;
    }

    PetrovaHW4enum(String s) {
        this.mathSing = s;
    }
}


