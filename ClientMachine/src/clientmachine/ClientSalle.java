/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmachine;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lachgar
 */
public class ClientSalle {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            IDao<Salle> dao = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/dao");

            dao.create(new Salle("Salle1"));

        } catch (NotBoundException ex) {
            Logger.getLogger(ClientSalle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientSalle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientSalle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
