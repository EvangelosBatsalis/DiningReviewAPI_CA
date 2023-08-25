package gr.vbatsalis.diningreviewapi_ca.businesslayer;

public class DiningReview {
    private String name;

    private Restaurant restaurant;

    public DiningReview(String name, Long id){
        this.name = name;
        this.restaurant = new Restaurant(id);
    }

}
