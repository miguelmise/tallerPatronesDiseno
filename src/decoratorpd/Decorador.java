/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpd;


public class Decorador implements Notificador{
    public Notificador wrapper;

    public Decorador(Notificador wrapper) {
        this.wrapper = wrapper;
    }
    
    @Override
    public void send(String message) {

        this.wrapper.send(message);
        
    }
    
}
