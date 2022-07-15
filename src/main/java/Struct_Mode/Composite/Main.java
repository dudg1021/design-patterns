package Struct_Mode.Composite;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-15 15:34
 */
public class Main {

    /**
     * 组合模式：将对象组合成树形结构表示“部分-整体”层次结构，使得用户对单个对象和组合对象的使用具有一致性。
     * @param args
     */
    public static void main(String[] args) {
        Employee ceo = new Employee("boss", "CEO", 10000);

        Employee headSales = new Employee("saleHeader", "Sale", 8000);
        ceo.getSubordinates().add(headSales);

        Employee sales1 = new Employee("sale1", "Sale", 2000);
        Employee sales2 = new Employee("sale2", "Sale", 2000);
        headSales.getSubordinates().add(sales1);
        headSales.getSubordinates().add(sales2);

        Employee financeHeader = new Employee("financeHeader", "Finance", 5000);
        ceo.getSubordinates().add(financeHeader);

        Employee cashier1 = new Employee("cashier1", "Finance", 3000);
        Employee cashier2 = new Employee("cashier2", "Finance", 3000);
        financeHeader.getSubordinates().add(cashier1);
        financeHeader.getSubordinates().add(cashier2);

        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
        
    }

}
