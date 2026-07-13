package sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dralm
 */
public interface Autenticable 
{
    public void login(String user, String pass);
    
    public void logout();
}
