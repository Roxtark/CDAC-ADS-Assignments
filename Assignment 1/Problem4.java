import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {


    public static void main(String[] args) {

        ArrayList<Integer> queue = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n----- Student Queue Management -----");
            System.out.println("1. Add Student");
            System.out.println("2. Submit Assignment");
            System.out.println("3. Search Student");
            System.out.println("4. Display Queue");
            System.out.println("5. Count Students");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add student
                    System.out.print("Enter Student ID: ");

                    int studentId = sc.nextInt();

                    queue.add(studentId);

                    System.out.println(
                        "Student " + studentId + " added to the queue."
                    );

                    break;

                case 2:
                    // Remove student from front
                    if (queue.isEmpty()) {

                        System.out.println(
                            "Queue is empty. No student to submit."
                        );

                    } else {

                        int removedStudent = queue.remove(0);

                        System.out.println(
                            "Student " + removedStudent +
                            " submitted the assignment."
                        );
                    }

                    break;

                case 3:
                    // Search student
                    System.out.print("Enter Student ID to search: ");

                    int searchId = sc.nextInt();

                    if (queue.contains(searchId)) {

                        System.out.println(
                            "Student " + searchId + " is waiting."
                        );

                    } else {

                        System.out.println(
                            "Student " + searchId +
                            " is not waiting."
                        );
                    }

                    break;

                case 4:
                    // Display queue
                    System.out.println("Current Queue: " + queue);

                    break;

                case 5:
                    // Count students
                    System.out.println(
                        "Current number of students: " + queue.size()
                    );

                    break;

                case 6:
                    // Exit
                    System.out.println("Program ended.");

                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}

