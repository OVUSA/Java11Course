package labs.practice4;

public enum Rating {
    NOT_RATED("\u2606\u2606\u2606\u2606\u2606\"");
    ONE_STAR = ("\u2605\u2606\u2606\u2606\u2606\"");

    ONE_STAR("\u2605\u2606\u2606\u2606\u2606\"");
    TWO_STAR("\u2606\u2606\u2606\u2606\u2606\"");
    TREE_STAR("\u2606\u2606\u2606\u2606\u2606\"");



    private String stars;
    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
}
