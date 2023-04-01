package ma.enset.sdia.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//1-Question : Créer un Web service qui permet de : Convertir un montant de l’auro en DH , Consulter un Compte ,Consulter une Liste de comptes
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt)
    {
        return mt * 10.54;
    }
    @WebMethod(operationName = "ConsulterCompte")
    public Compte getCompte(@WebParam(name = "code") int code)
    {
        return new Compte(code,Math.random()*899,new Date());
    }
    @WebMethod(operationName = "ConsulterListCompte")
    public List<Compte> compteList()
    {
        List<Compte> comptes = new ArrayList<Compte>();

        comptes.add(new Compte(1,Math.random()*10.2,new Date()));
        comptes.add(new Compte(2,Math.random()*10.2,new Date()));
        comptes.add(new Compte(3,Math.random()*10.2,new Date()));
        return comptes;
    }


}
