import javax.swing.*;
class User{
  private String Name;
  private String Username;
  private String Email;
  private String Password;
  
  public User(String Name, String Username, String Email, String Password){
    setName(Name);
    setUsername(Username);
    setEmail(Email);
    this.Password = Password; 
    
    //setPassword(Password);
    /*
    this.Name = Name;
    this.Username = Username;
    this.Email = Email;
    this.Password = Password; 
    */   
  }     
  public User(){
    
  } 
  public void setName(String Name){
    if (Name.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ihre Name fehlt!");
    } else {
      this.Name=Name;
    } // end of if-else
  }
  public String getName(){
    return Name;
  }
  public void setUsername(String Username){
    if (Username.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ihre Username fehlt!");
    } else {
      this.Username=Username;
    } // end of if-else
  }
  public String getUsername(){
    return Username;
  }
  public void setEmail(String Email){
    if (Email.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ihre E-Mail fehlt!");
    } else {
      this.Email=Email;
    } // end of if-else
  }
  public String getEmail(){
    return Email;
  }
  public void setPassword(){
    this.Password=Password;
  }
  public String getPass(){
    return Password;
  }         
}