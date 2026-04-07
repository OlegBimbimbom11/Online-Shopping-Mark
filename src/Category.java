import java.util.ArrayList;
public class Category {
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












// Этап 2
// 1 шаг. Product Class должен быть абстрактным
// 2 шаг создаём новый класс Category, делаем поля id, title, description, список ArayList, он сохраняет в себе список Category
// 2.1 добавить AddCategory, ShowCategory
// 3 шаг автогенерация id, каждый новый шаг добавляем новый id, которое генерируется само
// 4 шаг наследники - Electronic, GargenItem
// 5 шаг создаём новый класс MobileDivice, он есть наследник Electronic
// 6 шаг создаём несколько новых объектов из новых классов (в main)
}
