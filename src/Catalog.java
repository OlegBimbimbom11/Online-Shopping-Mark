//Todo catalog, мы делаем каталог для магазина, id будет в формате int, 2 Title в формате String;
// Price идёт в double, после делаем инкапсуляцию, далее создаём два объекта в main;
public class Catalog {
    private int id;
    private String Title;
    private Double Price;

    public Catalog() {}

    public Catalog(int id) {
        this.id = id;
    }

    public Catalog(int id, String Title, Double Price) {
        this.id = id;
        this.Title = Title;
        this.Price = Price;

    }

    public int get_id() {
        return this.id;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.Title;
    }

    public void set_Title(String Title) {
        this.Title = Title;
    }


    public Double getPrice() {
        return this.Price;
    }

    void set_Price(Double Price) {
            this.Price = Price;
    }


}
