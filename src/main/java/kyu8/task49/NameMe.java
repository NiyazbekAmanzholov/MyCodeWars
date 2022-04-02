package kyu8.task49;

//        NameMe nameMe = new NameMe("John", "Doe");
//
//        assertEquals("Verifying First name. Object returned should contain the firstname: John",
//                "John",
//                nameMe.getFirstName());
//
//        assertEquals("Verifying Last name. Object returned should contain the lastname: Doe",
//                "Doe",
//                nameMe.getLastName());
//
//        assertNotEquals("Verifying full name. Object returned should contain full name: John Doe",
//                "JohnDoe",
//                nameMe.getFullName());
//
//        assertEquals("Verifying full name. Object returned should contain full name: John Doe",
//                "John Doe",
//                nameMe.getFullName());

public class NameMe {
    public String firstName;
    public String lastName;
    public String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}