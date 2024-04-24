package PhoneBook;

import java.util.List;



public class Starer {
    public static void main(String[] args) {
        String nameToFind;
        Phonebook phonebook = new Phonebook();

        Record record1 = new Record("John Doe", "1234567890");
        Record record2 = new Record("Jane Smith", "9876543210");
        Record record3 = new Record("John Doe", "5555555555");


        phonebook.add(record1);
        phonebook.add(record2);
        phonebook.add(record3);


        nameToFind = "John Doe";

        System.out.println("Finding all records for " + nameToFind + ": ");
        List<Record> foundRecords = phonebook.findAll(nameToFind);

        if (foundRecords != null) {

            for (Record record : foundRecords) {
                System.out.println("Record: " + record.getPhones());
            }

        } else {
            System.out.println("No records found for " + nameToFind);
        }


        nameToFind = "Jane Smith";

        System.out.println("Finding all records for " + nameToFind + ": ");

        foundRecords = phonebook.findAll(nameToFind);

        if (foundRecords != null) {

            for (Record record : foundRecords) {
                System.out.println("Record: " + record.getPhones());
            }

        } else {
            System.out.println("No records found for " + nameToFind);
        }
    }
}

