/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import template.Login;
/**
 *
 * @author xatalie
 */
public class MainClass {
    public static Login login;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
