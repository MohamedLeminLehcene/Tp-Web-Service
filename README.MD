<h3>Compte rendu En Web Service réaliser par => Lehcene Mohamed Lemine Master SDIA ENSET-Mohammedia
</h3>
<p>1.Question - Créer un Web service qui permet de : </p>
<ul>
<li>Convertir un montant de l’auro en DH.</li>
<li>Consulter un Compte.</li>
<li>Consulter une Liste de comptes.</li>
</ul>
<img src="captures/Question1.png"/>

<p>2.Question - Déployer le Web service avec un simple Serveur JaxWS</p>
<img src="captures/Question2.png">

<p>3.Question - Consulter et analyser le WSDL avec un Browser HTTP</p>
<p>Voici Notre web Service qu'on a consulter par un browser HTTP CHROME qui est juste un document XML qui permet de fait la description de l'interface de WEB SERVICE et contient également les noms de methodes qui propose notre WEB SERVICE.</p>
<img src="captures/Question3.png"/>

<p>4.Question - Tester les opérations du web service avec un outil
comme SoapUI ou Oxygen</p>
<p>On Tester notre web service avec SOAPUI.</p>

<p>On doit donner le nom pour projet qu'on a construire dans l'outil SOAPUI et L'address WSDL pour le webservice qu'ont doit le tester.</p>
<img src="captures/Question4/img0.png"/>
<p>Donc il afficher les différents méthodes qui propose notre web service.</p>
<img src="captures/Question4/img1.png"/>
Voici le résultat aprés teste pour le méthode Convert qui consiste seulement a converture en montant de l'auro en DH.
<img src="captures/Question4/img2.png"/>
Voici la résultat aprés teste pour le méthode ConsulterCompte qui permet de nous de consulter une compte par son code.
<img src="captures/Question4/img3.png"/>
Voici le résultat aprés teste pour le méthodes ConsultListCompte qui consiste a afficher liste de comptes.
<img src="captures/Question4/img4.png"/>


<p>5. Créer un Client SOAP Java</p>
<p>Voici Capture ecran pour code source pour client SOAP en Java avec JaxWS.</p>
<img src="captures/Question5/img1.png"/>
<p>Voici Capture ecran pour Tester Les différents methodes qui propose notre WebService avec Client JOAP Java. </p>

<img src="captures/Question5/img2.png"/>

<p>6. Créer un Client SOAP Dot Net</p>
<p>Dans cette partie je créer un application windows form qui permet de Consulter notre WEB SERVICE.</p>
<p>D'abord On doit donner L'address WSDL pour le webservice qu'ont doit le consulter par Client SOAP DOTNET.</p>
<img src="captures/Question6/AccederAuWS/img1.png"/>
<p>Donc lorsqu'on cliquer sur bouton (Aller à) il m'afficher les différents méthodes qui propose mon web service.</p>
<img src="captures/Question6/AccederAuWS/img2.png"/>
<p>
Voici un capture ecran pour client SOAP DOTNET qui 
a une interface graphique créer avec Windows Froms Application qui contient 
textBox pour saisir un Montant , textBox pour afficher resultat de conversion en DH, 
DataGridView pour afficher resultat lorsque on clique sur button Comptes et 
des boutons pour consulter les différentes méthodes (Convert en DH et Afficher Liste des Comptes).
</p>
<img src="captures/Question6/img2.png">
<p>
Voici le résultat aprés teste pour le méthode Convert lorsque on sasir 
un montant dans textBox et on click sur button 
Conversion qui consiste seulement a converture en montant de l'auro en DH.
</p>
<img src="captures/Question6/img3.png">
<p>
Voici le résultat aprés teste pour le méthode ConsultListCompte avec Client SOAP DOTNET
lorsque on click sur button (Comptes) qui permet d'Afficher Liste des Comptes dans une DataGridView.
</p>
<img src="captures/Question6/img4.png">

<p>Voici capture ecran code source pour client soap avec DotNet et 
on utilise des événements pour effectuer les opérations.
</p>
<img src="captures/Question6/img1.png">

<p>7. Créer un Client SOAP PHP</p>
<p>Voici capture ecran code source pour client soap avec PHP.</p>
<img src="captures/Question7/ClientSoapPHP/ClientSoapPhp.png" />
<p>Layout Header.</p>
<img src="captures/Question7/ClientSoapPHP/Header.png" />
<p>Layout Footer.</p>
<img src="captures/Question7/ClientSoapPHP/footer.png" />
<p>
Voici un capture ecran pour client SOAP PHP qui a une interface créer avec framework Bootstrap
qui contient 3 boutons pour tester avec notre client SOAP PHP Les différents méthodes qui propose notre Web Service.
</p>
<img src="captures/Question7/img0.png" />

<p>Voici le résultat aprés teste  pour le méthode Convert lorsque on sasir un montant dans input et on click sur button Convert qui consiste seulement a converture en montant de l'auro en DH. </p>
<img src="captures/Question7/img1.png" />
<img src="captures/Question7/img2.png" />

<p>Voici le résultat aprés teste  pour le méthode ConsulterCompte lorsque on sasir un code du compte dans input et on click sur button Consulter un Compte qui permet de nous de consulter une compte par son code et on afficher le résultat dans un tableau.</p>
<img src="captures/Question7/img3.png" />
<img src="captures/Question7/img4.png" />

<p>Voici le résultat aprés teste  pour le méthode ConsultListCompte lorsque on click sur button Afficher Liste des Comptes qui consiste a afficher liste de comptes et on affiche le résultat dans une tableau.</p>
<img src="captures/Question7/img6.png" />

