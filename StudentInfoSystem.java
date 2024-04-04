public class StudentInfoSystem {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter information
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter student's birthday: ");
        String birthday = scanner.nextLine();

        System.out.print("Enter student's address: ");
        String address = scanner.nextLine();

        System.out.print("Enter student's student number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter student's year: ");
        String year = scanner.nextLine();

        System.out.print("Enter student's section: ");
        String section = scanner.nextLine();

        System.out.print("Enter student's time of arrival: ");
        String arrivalTime = scanner.nextLine();

        System.out.print("Enter student's time of dismissal: ");
        String dismissalTime = scanner.nextLine();

        // Create a new Student object with the entered information
        Student student = new Student(name, age, birthday, address, studentNumber, year, section, arrivalTime, dismissalTime);

        // Display student information
        student.displayInfo();

        // Close the Scanner object
        scanner.close();
    }
}