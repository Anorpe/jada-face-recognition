package ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: UsuarioLogueado
* @author ontology bean generator
* @version 2019/08/13, 11:18:27
*/
public class UsuarioLogueado implements Predicate {

   /**
* Protege name: usuario
   */
   private Usuario usuario;
   public void setUsuario(Usuario value) { 
    this.usuario=value;
   }
   public Usuario getUsuario() {
     return this.usuario;
   }

}
