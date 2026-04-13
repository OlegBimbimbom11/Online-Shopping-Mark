public class Product extends Category {

    public Product(
            String Title,
            Double Price,
            String Description) {
        // Передаем параметры
        super(Title, Price, Description);
    }

    @Override
    public void Show_Info() {

        System.out.println(get_id() + " Товар: " + get_Title() + " Цена: " + get_Price() + " Описание: " + get_Description());
    }
}
