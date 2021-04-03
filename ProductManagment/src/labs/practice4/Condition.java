package labs.practice4;

public enum Condition {
    HOT("Warning HOT!"),
    WARM("JUST RIGHT!");

    private String caution;
    private Condition(String caution){
        this.caution = caution;

    }


}
