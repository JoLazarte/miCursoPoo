package Account;

public class Account {
   private Integer id;
   private String name;
   private String document;
   private String email;
   private String password;

   

    public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}



public String getName() {
    return name;
}



public void setName(String name) {
    this.name = name;
}



public String getDocument() {
    return document;
}



public void setDocument(String document) {
    this.document = document;
}



public String getEmail() {
    return email;
}



public void setEmail(String email) {
    this.email = email;
}



public String getPassword() {
    return password;
}



public void setPassword(String password) {
    this.password = password;
}



    public Account(String name, String document){
        this.name = name;
        this.document = document;
    }
}
