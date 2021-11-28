package Frost.Shop_3;

// Создать консольное приложение для работы с объектами.
//
//В приложении должны быть функции добавление/удаление/получение продукта.
//
//Минимальные требования (возможные пункты меню):
//1. Добавление продукта
//2. Получение продукта по id
//3. Получение списка всех продуктов
//4. Удаление продукта по id
//(Меню можно реализовать через условный оператор switch-case)
//
//В качестве хранилища данных использовать коллекцию (на усмотрение)
//
//Основная сущность - Product.
//
//Основные поля:
//Идентификационный номер (id) - тип long (или int)
//Название (name) - тип String
//Цена (price) - тип double
//Категоря (category) – тип String
//
//Опциональные поля:
//Скидка (discount) - тип данных double
//Описание (actualPrice) - тип данных double


public class Main {
    public static void main(String[] args) {

        Market.productList.add(new Product("Lidskoe", 200, "Beer"));
        Market.productList.add(new Product("Minskoe", 200, "Beer"));
        Market.productList.add(new Product("Alivaria", 150, "Beer"));
        Market.productList.add(new Product("Tuborg", 120, "Beer"));
        Market.productList.add(new Product("Heiniken", 160, "Beer"));
        Market.productList.add(new Product("Korona", 250, "Beer"));

        Market.productList.add((new Product("Balantais", 4000, "Whisky")));
        Market.productList.add((new Product("Passport", 2500, "Whisky")));
        Market.productList.add((new Product("King Roobert", 4200, "Whisky")));
        Market.productList.add((new Product("Red Label", 4500, "Whisky")));
        Market.productList.add((new Product("Royal Legend", 1000, "Whisky")));
        Market.productList.add((new Product("Black Label", 5000, "Whisky")));

        Market.productList.add((new Product("Bungudskoe", 1500, "Wino")));
        Market.productList.add((new Product("Kindzmarauli", 1700, "Wino")));
        Market.productList.add((new Product("Valdesol", 2000, "Wino")));
        Market.productList.add((new Product("Merlot", 1200, "Wino")));
        Market.productList.add((new Product("Betanely Saperavi", 1000, "Wino")));
        Market.productList.add((new Product("Barista pinotag", 1300, "Wino")));

        Market.productList.add((new Product("Martell", 2500, "Brandy")));
        Market.productList.add((new Product("Remy Martin", 3000, "Brandy")));
        Market.productList.add((new Product("Hennessy", 4000, "Brandy")));
        Market.productList.add((new Product("Courvoiser", 3500, "Brandy")));
        Market.productList.add((new Product("Gautier", 3300, "Brandy")));
        Market.productList.add((new Product("Bisquit", 3100, "Brandy")));

        Market.personList.add(new Person("Alex", "AlexFrost", "qwerty", true, 10000));
        Market.personList.add(new Person("Petrovich", "1111", "1111", true, 3000));
        Market.personList.add(new Person("Adil", "Sheikh", "2222", false, 1_000_000));
        Market.personList.add(new Person("Svetlana", "ketochka11", "1111", true, 20000));



Market.startMenu();



    }
}
