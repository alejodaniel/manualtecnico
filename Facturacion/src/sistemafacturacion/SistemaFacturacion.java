/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafacturacion;

import com.alejandro.DAO.ProductoDao;
import com.alejandro.views.CargaView;
import com.alejandro.views.LoginView;
import com.alejandro.views.PrincipalView;

/**
 *
 * @author Alejandro
 */
public class SistemaFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginView lv = new LoginView(null, true, null);
        lv.setVisible(true);

        //PrincipalView pv = new PrincipalView(null, null);
       // pv.setVisible(true);
//        ProductoDao pd = new ProductoDao(null);
//        pd.buscarTodos();
//        CargaView cv = new CargaView(null, true);
//        cv.setVisible(true);
    }
}
