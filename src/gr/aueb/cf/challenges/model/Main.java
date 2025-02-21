package gr.aueb.cf.challenges.model;

public class Main {
    public static void main(String[] args) {
      User user = new User(1L , "Frydaki","Maria");

      UserCredentials userCredentials = new UserCredentials(131L,"MRK","1213");

      System.out.println("id = "+user.getId()+", lastmame = "+user.getLastname()+", firstname = "+user.getFirstname());
        System.out.println("id = "+userCredentials.getId()+",username = "+userCredentials.getUsername()+", password = "+userCredentials.getPassword());
    }
}

