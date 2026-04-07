public class Main {
    public static void main(String[] args) {

        Category category1 = new Category("мама деда", 2.8, "вкусна");
        System.out.println(category1.get_id() + " " + category1.get_Title() + " " + category1.get_Price() + " " + category1.get_Description());

        Category category2 = new Category("мама дена", 0.0, "крута");
        System.out.println(category2.get_id() + " " + category2.get_Title() + " " + category2.get_Price() + " " + category2.get_Description());

        Category category3 = new Category("чикенбургер", 343.4, "ДОРОГААА");
        System.out.println(category3.get_id() + " " + category3.get_Title() + " " + category3.get_Price() + " " + category3.get_Description());

    }
}