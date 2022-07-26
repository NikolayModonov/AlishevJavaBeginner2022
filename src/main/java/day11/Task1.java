package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + "\n" + picker + "\n" + courier);
        System.out.println();

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
            if (i == 1000) {
                System.out.println(warehouse + "\n" + picker + "\n" + courier);
            }
        }
        System.out.println();

        System.out.println(warehouse + "\n" + picker + "\n" + courier);
        System.out.println();

        System.out.println("Create Warehouse 2");
        System.out.println();
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        System.out.println(warehouse2 + "\n" + picker2 + "\n" + courier2);
        System.out.println();

        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse2 + "\n" + picker2 + "\n" + courier2);
        System.out.println();

        System.out.println("Test Warehouse 1 and first workers");
        System.out.println();
        System.out.println(warehouse + "\n" + picker + "\n" + courier);
    }
}
