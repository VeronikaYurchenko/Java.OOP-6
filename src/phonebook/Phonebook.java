package phonebook;

import java.util.ArrayList;
import java.util.logging.*;


public class Phonebook implements phonebook.AddPersons {
    public ArrayList<phonebook.Persona> pb;

    public Phonebook(){
        this.pb = new ArrayList<>();
        phonebook.LoggerClass.logger.log(Level.INFO, "A new phone book has been created");
    }

    public void showAddressBook(){
        for(phonebook.Persona i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
        phonebook.LoggerClass.logger.log(Level.INFO, "The phone book is printed in the console");
    }

    @Override
    public void AddPerson(){
        pb.add(new phonebook.Persona("Васильев Василий Васильевич", "8914-479-5698", "Мурманск"));
        pb.add(new phonebook.Persona("Петров Петр Петрович", "8924-369-8521", "Санкт-Петербург"));
        phonebook.LoggerClass.logger.log(Level.INFO, "New persons have been added to the phone book");
    }
}
