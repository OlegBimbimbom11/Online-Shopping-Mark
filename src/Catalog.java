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

    public Catalog(String Title, Double Price) {
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


}

// TODO - Этап 2
// 1 шаг. В классе Product должны быть поля id, title, price, description (описание). Product Class должен быть абстрактным
// 2 шаг создаём новый класс Category, делаем поля id, title, description, список ArayList, он сохраняет в себе список Category
// 2.1 добавить AddCategory, ShowCategory
// 3 шаг автогенерация id, каждый новый шаг добавляем новый id, которое генерируется само
// 4 шаг наследники - Electronic, GargenItem
// 5 шаг создаём новый класс MobileDivice, он есть наследник Electronic
// 6 шаг создаём несколько новых объектов из новых классов (в main)

// TODO - Этап 3
// 1 шаг - создать класс Catalog (есть), add Add_Category, Show_Category
// 2 ШАГ - добавляем счётчики   в каталог, 1 - сколько есть категорий, 2 - сколько субкатегорий