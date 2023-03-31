package ma.enset.sdia;

import ma.enset.sdia.ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJWS {

    public static void main(String[] args)
    {
        //2. Déployer le Web service avec un simple Serveur JaxWS
        //address => O.O.O.O : pour que le server permet d'accepter la connéxion depuis n'importe que address IP sur le port 9191
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web servoce déployé sur http://0.0.0.0:9191/");
    }
}
