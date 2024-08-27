package com.jawa;

import com.jawa.creational.factory.HotDrink;
import com.jawa.creational.factory.HotDrinkMachine;

public class Main {
    public static void main(String[] args) throws Exception {
        /*Journal journal = new Journal();
        journal.addEntry("First comment");
        journal.addEntry("Third comment");
        System.out.println(journal);
        new Persistor().persist(journal,"sample.txt",false);*/

        /*Product car = new Product("Car", Color.BLUE, Size.MEDIUM);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.HUGE);
        Product apple = new Product("Apple", Color.RED, Size.SMALL);

        List<Product> products = List.of(car, house, tree, apple);

        ProductFilter filter = new ProductFilter();
        filter.filterBySpec(products, new ColorSpecficiation(Color.GREEN))
                .forEach(p -> System.out.println(p.name + " is green"));

        filter.filterBySpec(products, new AndSpecification<>(
                new ColorSpecficiation(Color.BLUE),
                new SizeSpecficiation(Size.HUGE)
        )).forEach(p -> System.out.println(p.name + " is blue and huge"));*/

        /*HtmlBuilder htmlBuilder = new HtmlBuilder("ul");
        htmlBuilder.addElement("li", "Java")
                .addElement("li","scala");

        System.out.println(htmlBuilder.toString());*/

        /*EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person person = employeeBuilder.withName("Jawahar")
                .withEmployeePosition("Dev")
                .build();
        System.out.println(person);*/

        /*PersonBuilder pb = new PersonBuilder();
        Person person = pb.lives()
                .at("Veppampattu")
                .in("Tiruvallur")
                .code("602024")
                .works()
                .worksAt("HCL")
                .worksAs("Developer")
                .earns(90344)
                .build();
        System.out.println(person);*/

        /*CodeBuilder codeBuilder = new CodeBuilder("Person");
        codeBuilder.addField("name", "String")
                .addField("age", "int");
        System.out.println(codeBuilder);*/

        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        HotDrink hotDrink = hotDrinkMachine.makeDrink();

    }
}
