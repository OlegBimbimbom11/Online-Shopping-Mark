public class Main {
    public static void main(String[] args) {

        Category category1 = new Category("свёкла", 2.8, "вкусна");
        System.out.println(category1.get_id() + " " + category1.get_Title() + " " + category1.get_Price() + " " + category1.get_Description());

        Category category2 = new Category("свёкла", 2.8, "крута");
        System.out.println(category2.get_id() + " " + category2.get_Title() + " " + category2.get_Price() + " " + category2.get_Description());


    }
}