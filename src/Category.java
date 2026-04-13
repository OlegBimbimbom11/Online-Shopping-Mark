import java.util.ArrayList;
abstract class Category {
    private static int idid = 0;
    private int id;
    private String Title;
    private Double Price;
    private String Description;

    private static ArrayList<String> Show_and_Add_Category = new ArrayList<String>();

    public Category () {}

    public Category(String Title, Double Price, String Description) {
        idid++;
        this.id = idid;
        this.Title = Title;
        this.Price = Price;
        this.Description = Description;
    }



    public int get_id() {
        return this.id;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public String get_Title() {
        return this.Title;
    }

    public void set_Title(String Title) {
        this.Title = Title;
    }


    public Double get_Price() {
        return this.Price;
    }

    void set_Price(Double Price) {
        this.Price = Price;
    }
    public String get_Description() {
        return this.Description;
    }

    public void set_Description(String Description) {
        this.Description = Description;
    }

    public void Add_Category(String NameCat) {
        Show_and_Add_Category.add(NameCat);
    }
    public void Show_Category() {
        System.out.println("Категории:");
        for (String item: Show_and_Add_Category) {
            System.out.println("- " + item);
        }
    }

    public void Show_Info() {}



}
