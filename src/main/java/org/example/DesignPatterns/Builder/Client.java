package org.example.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {

        //Version 0 - Is Builder done -> version 0 above are cosmetic changes
//        StudentBuilder sb = new StudentBuilder();
//        sb.setName("Akash");
//        sb.setEmail("aksh.pal9@gmail.com");
//        sb.setAge(18);
//
//        Student s = new Student(sb);

        //Version 1
        StudentBuilder sb = Student.getBuilder();
        sb.setName("Akash");
        sb.setEmail("aksh.pal9@gmail.com");
        sb.setAge(18);

        Student s = new Student(sb); //sb.build()

        //Version 1A
        StudentBuilder sb1 = Student.getBuilder();
        sb1.setName("Akash");
        sb1.setEmail("aksh.pal9@gmail.com");
        sb1.setAge(18);

        //AT this point sb1
        Student s1a = sb1.build();

        // Version 2
        Student s1 = Student.getBuilder()
                .setAge(18)
                .setName("Akash")
                .setEmail("aksgh.pal95@gmail.com")
                .build();



    }
}
