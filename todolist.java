
import java.util.ArrayList;
import java.util.Scanner;

public class todolist {

    public static void main(String args[]) {

        ArrayList<String> toDoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Menu or Druva:");
            System.out.println("1.Add item");
            System.out.println("2.Remove item:");
            System.out.println("3.View items:");
            System.out.println("4.Exit");

            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the item to add:");
                    sc.nextLine();
                    String item = sc.nextLine();
                    toDoList.add(item);
                    System.out.println("Item added to the to-do list:");
                    break;

                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty");
                    } else {
                        System.out.print("Enter the index of the item to remove:");
                        int index = sc.nextInt();
                        if (index >= 0 && index < toDoList.size()) {
                            String removedItem = toDoList.remove(index);
                            System.out.println("Removed item:" + removedItem);
                        } else {
                            System.out.println("Invalid index");

                        }
                    }
                    break;

                case 3:
                    System.out.println("\nTodo List:");
                    for (int i = 1; i < toDoList.size(); i++) {
                        System.out.println(i + " ." + toDoList.get(i));

                    }
                    break;

                case 4:
                    System.out.println("Existing the to-do list program.");
                    return;

                default:
                    System.out.println("Invalid choice.please try again");

            }
        }

    }
}
