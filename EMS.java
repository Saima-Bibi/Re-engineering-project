import java.util.Scanner;

class EmployeeRecordSystem {
    static class Address {
        String address;
        String nationality;
    }

    static class DMY {
        int date;
        int month;
        int year;
    }

    static class Employee {
        int id;
        String name;
        String fatherName;
        DMY dob = new DMY();
        int age;
        String gender;
        long contact;
        long cnic;
        Address address = new Address();
        String qualification;
        String dept;
        DMY doj = new DMY();
        double salary;
    }

    static int total = 0;
    static Employee[] employees = new Employee[100];
    static String username, password;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<");
        System.out.println("\n\t\t\t\t\t        EMPLOYEE RECORD SYSTEM");
        System.out.println("\n\t\t\t\t\t>>*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*<<");

        // Sign Up process
        System.out.println("\n\t\t\t\t\t>>**************SIGN UP**************<<");
        System.out.print("\n\t\t\t Enter username: ");
        username = scanner.nextLine();

        // Password validation
        do {
            System.out.print("\n\t\t\t Enter Password: ");
            password = scanner.nextLine();

            if (!validatePassword(password)) {
                System.out.println("\n\t\t\t --> INVALID password. It should be at least 6 characters long, have at least one uppercase letter, one lowercase letter, and one digit.");
            }
        } while (!validatePassword(password));

        System.out.println("\n\t\t\t Your PASSWORD is VERIFIED");
        System.out.println("\n\t\t\t Your new ID is creating please wait...");

        for (int i = 0; i < 6; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }

        System.out.println("\n\t\t\t Your ID created successfully");

        login(scanner);
    }

    static void login(Scanner scanner) throws InterruptedException {
        String inputUsername, inputPassword;

        while (true) {
            System.out.println("\n\t\t\t\t>>***************LOGIN***************<<");
            System.out.print("\n\t\t\t Enter Username: ");
            inputUsername = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Password: ");
            inputPassword = scanner.nextLine();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("\n\t\t\t Login successful!");
                showMenu(scanner);
            } else {
                System.out.println("\n\t\t\t Invalid Username or Password. Please try again.");
                Thread.sleep(2000);
            }
        }
    }

    static void showMenu(Scanner scanner) throws InterruptedException {
        while (true) {
            System.out.println("\n\t\t\t\t  [ 1.] Add Employee");
            System.out.println("\n\t\t\t\t  [ 2.] Show Record");
            System.out.println("\n\t\t\t\t  [ 3.] Search Record");
            System.out.println("\n\t\t\t\t  [ 4.] Update Record");
            System.out.println("\n\t\t\t\t  [ 5.] Delete Record");
            System.out.println("\n\t\t\t\t  [ 6.] Logout");
            System.out.println("\n\t\t\t\t  [ 7.] Exit");
            System.out.print("\n\t\t\t\t  Enter Choice... ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    showRecord(scanner);
                    break;
                case 3:
                    searchRecord(scanner);
                    break;
                case 4:
                    updateRecord(scanner);
                    break;
                case 5:
                    deleteRecord(scanner);
                    break;
                case 6:
                    return;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\t\t\t Invalid Input");
                    break;
            }
        }
    }

    static void addEmployee(Scanner scanner) {
        System.out.print("\n\t\t\t How many employees data do you want to enter? ");
        int user = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = total; i < total + user; i++) {
            employees[i] = new Employee();

            System.out.println("\n\t\t\t Enter Employee Data: " + (i + 1));

            System.out.print("\n\t\t\t Enter Employee ID: ");
            employees[i].id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("\n\t\t\t Enter Employee Name: ");
            employees[i].name = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Employee Father Name: ");
            employees[i].fatherName = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Birth Date (D M Y): ");
            employees[i].dob.date = scanner.nextInt();
            employees[i].dob.month = scanner.nextInt();
            employees[i].dob.year = scanner.nextInt();

            System.out.print("\n\t\t\t Enter Age: ");
            employees[i].age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("\n\t\t\t Enter Gender: ");
            employees[i].gender = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Phone Number: ");
            employees[i].contact = scanner.nextLong();

            System.out.print("\n\t\t\t Enter CNIC: ");
            employees[i].cnic = scanner.nextLong();
            scanner.nextLine(); 

            System.out.print("\n\t\t\t Enter Address: ");
            employees[i].address.address = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Nationality: ");
            employees[i].address.nationality = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Qualification: ");
            employees[i].qualification = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Department: ");
            employees[i].dept = scanner.nextLine();

            System.out.print("\n\t\t\t Enter Joining Date (D M Y): ");
            employees[i].doj.date = scanner.nextInt();
            employees[i].doj.month = scanner.nextInt();
            employees[i].doj.year = scanner.nextInt();

            System.out.print("\n\t\t\t Enter Salary: ");
            employees[i].salary = scanner.nextInt();
            scanner.nextLine();
        }

        total += user;
        System.out.println("\n\t\t\t New Record is entered Successfully");
    }

    static void showRecord(Scanner scanner) {
        if (total != 0) {
            System.out.print("\n\t\t\t Enter Employee ID which you want to view: ");
            int id = scanner.nextInt();

            for (int i = 0; i < total; i++) {
                if (employees[i].id == id) {
                    printEmployeeData(i);
                    return;
                }
            }
            System.out.println("\n\t\t\t No such record found.");
        } else {
            System.out.println("\n\t\t\t No data is entered.");
        }
    }

    static void searchRecord(Scanner scanner) {
        if (total != 0) {
            System.out.print("\n\t\t\t Enter Employee ID which you want to search: ");
            int id = scanner.nextInt();

            for (int i = 0; i < total; i++) {
                if (employees[i].id == id) {
                    printEmployeeData(i);
                    return;
                }
            }
            System.out.println("\n\t\t\t No such record found.");
        } else {
            System.out.println("\n\t\t\t No data is entered.");
        }
    }
    static void updateRecord(Scanner scanner) { 
        if (total != 0) {
            System.out.println("\n\t\t\t ************Update Record************");
            System.out.println("\n\t\t\t [1.] to Update Specific Record");
            System.out.println("\n\t\t\t [2.] to Update Full Record");
            System.out.print("\n\t\t\t Enter choice: ");
            int press = scanner.nextInt();
            scanner.nextLine(); 
    
            System.out.print("\n\t\t\t Enter Employee ID which you want to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
    
            for (int i = 0; i < total; i++) {
                if (employees[i].id == id) {
                    if (press == 1) {
                        // Update specific field
                        System.out.println("\n\t\t\t *********MENU*********");
                        System.out.println("\n\t\t\t [1.]  Update Name");
                        System.out.println("\n\t\t\t [2.]  Update Father Name");
                        System.out.println("\n\t\t\t [3.]  Update Birth Date");
                        System.out.println("\n\t\t\t [4.]  Update Age");
                        System.out.println("\n\t\t\t [5.]  Update Gender");
                        System.out.println("\n\t\t\t [6.]  Update Contact");
                        System.out.println("\n\t\t\t [7.]  Update CNIC");
                        System.out.println("\n\t\t\t [8.]  Update Address");
                        System.out.println("\n\t\t\t [9.]  Update Nationality");
                        System.out.println("\n\t\t\t [10.] Update Qualification");
                        System.out.println("\n\t\t\t [11.] Update Department");
                        System.out.println("\n\t\t\t [12.] Update Joining Date");
                        System.out.println("\n\t\t\t [13.] Update Salary");
                        System.out.print("\n\t\t\t Enter choice: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); 
    
                        switch (choice) {
                            case 1:
                                System.out.print("\n\t\t\t Enter Name to update: ");
                                employees[i].name = scanner.nextLine();
                                break;
                            case 2:
                                System.out.print("\n\t\t\t Enter Father Name to update: ");
                                employees[i].fatherName = scanner.nextLine();
                                break;
                            case 3:
                                System.out.print("\n\t\t\t Enter Birth Date to update (D M Y): ");
                                employees[i].dob.date = scanner.nextInt();
                                employees[i].dob.month = scanner.nextInt();
                                employees[i].dob.year = scanner.nextInt();
                                break;
                            case 4:
                                System.out.print("\n\t\t\t Enter Age to update: ");
                                employees[i].age = scanner.nextInt();
                                break;
                            case 5:
                                System.out.print("\n\t\t\t Enter Gender to update: ");
                                employees[i].gender = scanner.nextLine();
                                break;
                            case 6:
                                System.out.print("\n\t\t\t Enter Contact to update: ");
                                employees[i].contact = scanner.nextLong();
                                break;
                            case 7:
                                System.out.print("\n\t\t\t Enter CNIC to update: ");
                                employees[i].cnic = scanner.nextLong();
                                break;
                            case 8:
                                System.out.print("\n\t\t\t Enter Address to update: ");
                                employees[i].address.address = scanner.nextLine();
                                break;
                            case 9:
                                System.out.print("\n\t\t\t Enter Nationality to update: ");
                                employees[i].address.nationality = scanner.nextLine();
                                break;
                            case 10:
                                System.out.print("\n\t\t\t Enter Qualification to update: ");
                                employees[i].qualification = scanner.nextLine();
                                break;
                            case 11:
                                System.out.print("\n\t\t\t Enter Department to update: ");
                                employees[i].dept = scanner.nextLine();
                                break;
                            case 12:
                                System.out.print("\n\t\t\t Enter Joining Date to update (D M Y): ");
                                employees[i].doj.date = scanner.nextInt();
                                employees[i].doj.month = scanner.nextInt();
                                employees[i].doj.year = scanner.nextInt();
                                break;
                            case 13:
                                System.out.print("\n\t\t\t Enter Salary to update: ");
                                employees[i].salary = scanner.nextDouble();
                                break;
                            default:
                                System.out.println("\n\t\t\t Invalid choice.");
                        }
    
                    } else if (press == 2) {
                        // Update full record
                        System.out.print("\n\t\t\t Enter Name to update: ");
                        employees[i].name = scanner.nextLine();
    
                        System.out.print("\n\t\t\t Enter Father Name to update: ");
                        employees[i].fatherName = scanner.nextLine();
    
                        System.out.print("\n\t\t\t Enter Birth Date to update (D M Y): ");
                        employees[i].dob.date = scanner.nextInt();
                        employees[i].dob.month = scanner.nextInt();
                        employees[i].dob.year = scanner.nextInt();
    
                        System.out.print("\n\t\t\t Enter Age to update: ");
                        employees[i].age = scanner.nextInt();
                        scanner.nextLine(); 
    
                        System.out.print("\n\t\t\t Enter Gender to update: ");
                        employees[i].gender = scanner.nextLine();
    
                        System.out.print("\n\t\t\t Enter Contact to update: ");
                        employees[i].contact = scanner.nextLong();
    
                        System.out.print("\n\t\t\t Enter CNIC to update: ");
                        employees[i].cnic = scanner.nextLong();
                        scanner.nextLine(); 
    
                        System.out.print("\n\t\t\t Enter Address to update: ");
                        employees[i].address.address = scanner.nextLine();
    
                        System.out.print("\n\t\t\t Enter Nationality to update: ");
                        employees[i].address.nationality = scanner.nextLine();
    
                        System.out.print("\n\t\t\t Enter Qualification to update: ");
                        employees[i].qualification = scanner.nextLine();
    
                        System.out.print("\n\t\t\t Enter Department to update: ");
                        employees[i].dept = scanner.nextLine();
    
                        System.out.print("\n\t\t\t Enter Joining Date to update (D M Y): ");
                        employees[i].doj.date = scanner.nextInt();
                        employees[i].doj.month = scanner.nextInt();
                        employees[i].doj.year = scanner.nextInt();
    
                        System.out.print("\n\t\t\t Enter Salary to update: ");
                        employees[i].salary = scanner.nextDouble();
                        scanner.nextLine(); 
    
                        System.out.println("\n\t\t\t Record updated successfully.");
                    }
                    return;
                }
            }
            System.out.println("\n\t\t\t No such record found.");
        } else {
            System.out.println("\n\t\t\t No data is entered.");
        }
    }
    

    static void deleteRecord(Scanner scanner) {
        if (total != 0) {
            System.out.print("\n\t\t\t Enter Employee ID which you want to delete: ");
            int id = scanner.nextInt();

            for (int i = 0; i < total; i++) {
                if (employees[i].id == id) {
                    for (int j = i; j < total - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    employees[total - 1] = null;
                    total--;
                    System.out.println("\n\t\t\t Record deleted successfully.");
                    return;
                }
            }
            System.out.println("\n\t\t\t No such record found.");
        } else {
            System.out.println("\n\t\t\t No data is entered.");
        }
    }

    static boolean validatePassword(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        if (password.length() >= 6) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) hasUppercase = true;
                if (Character.isLowerCase(c)) hasLowercase = true;
                if (Character.isDigit(c)) hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit;
    }

    static void printEmployeeData(int i) {
        System.out.println("\n\t\t\t Employee ID: " + employees[i].id);
        System.out.println("\n\t\t\t Name: " + employees[i].name);
        System.out.println("\n\t\t\t Father Name: " + employees[i].fatherName);
        System.out.println("\n\t\t\t Date of Birth: " + employees[i].dob.date + "/" + employees[i].dob.month + "/" + employees[i].dob.year);
        System.out.println("\n\t\t\t Age: " + employees[i].age);
        System.out.println("\n\t\t\t Gender: " + employees[i].gender);
        System.out.println("\n\t\t\t Phone: " + employees[i].contact);
        System.out.println("\n\t\t\t CNIC: " + employees[i].cnic);
        System.out.println("\n\t\t\t Address: " + employees[i].address.address);
        System.out.println("\n\t\t\t Nationality: " + employees[i].address.nationality);
        System.out.println("\n\t\t\t Qualification: " + employees[i].qualification);
        System.out.println("\n\t\t\t Department: " + employees[i].dept);
        System.out.println("\n\t\t\t Date of Joining: " + employees[i].doj.date + "/" + employees[i].doj.month + "/" + employees[i].doj.year);
        System.out.println("\n\t\t\t Salary: " + employees[i].salary);
    }
}
