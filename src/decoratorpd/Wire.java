/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpd;


public class Wire  extends Decorador {
    
    public Wire(Notificador wrapper) {
        super(wrapper);
    }
        
    @Override
    public void send(String message) {
        
        super.wrapper.send(message);
        
    }
}

