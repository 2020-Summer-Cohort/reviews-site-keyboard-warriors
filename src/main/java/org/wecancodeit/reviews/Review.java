package org.wecancodeit.reviews;

public class Review {
    private String make;
    private String model;
    private int year;
    private String review;
    private String backGroundPic;

    public Review(String make, String model, int year, String review, String backGroundPic) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.review = review;
        this.backGroundPic = backGroundPic;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {

        return model;
    }

    public int getYear() {

        return year;
    }

    public String getReview() {

        return review;
    }

    public String getBackGroundPic() {

        return backGroundPic;
    }
}
