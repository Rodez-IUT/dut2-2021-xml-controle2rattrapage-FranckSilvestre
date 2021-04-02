# XML - Contrôle 2

### NOM : DOE
### Prénom : John
### Groupe de TP :
- [x] Rattrapage

### Modalités
Tous les documents sont autorisés.  
Tout communication de quelque forme que ce soit est interdite avec toute autre personne différente de votre surveillant.  
Durée standard de l'épreuve : 1h30 

### 0. Création et initialisation du projet

Créez votre projet sur Github en vous inscrivant au devoir indiqué par votre enseignant.  
Clonez dans l’espace de travail de votre choix le projet Github généré pour vous par Github Classroom.  
Importez/ouvrez votre projet local dans l'IDE IntelliJ.  
Modifiez le fichier README pour qu’il contienne vos nom et prénom en place des données exemples.  
Commitez et pushez  dans votre dépôt distant en utilisant le message de commit suivant :

> fix #0 Activité préliminaire terminée

Dans la suite de ce document, à chaque fois que vous trouverez un énoncé commençant par “fix #...”,
vous devez committer et pusher les modifications sur votre dépôt distant en utilisant comme message de commit cet énoncé.

### 1. XML Schema (5 points)

La société CityMusee est spécialisée dans la fourniture d'informations sur les musées.
Pour communiquer facilement avec ses partenaires, CityMusee décide de publier ses
informations au format XML.

Vous êtes chargé d'écrire la schéma XML du document Musee.xml fourni dans le dossier "src/main/resources". La spécification 
est la suivante...
Un musée est caractérisé par :

- un nom, un sous-titre et un résumé ;
- une liste de dates de fermeture (peut être vide) ;
- une liste de jours d'ouverture (au moins 1 jour d'ouverture)

Une date de fermeture est un élément respectant le "pattern" : jj mm. La date du 25 décembre est donc représentée
comme suit : 25 12.

Un jour d'ouverture est représenté par un élément "jour" ayant un attribut "nom" pouvant prendre ses valeurs
uniquement dans l'ensemble des jours de la semaine (lundi, mardi, etc.).

1. Dans le dossier "src/main/resources", écrire le schéma XML Musee.xsd correspondant à la spécification et au document XML fournis.
2. Déclarer le shéma XML dans le fichier Musee.xml et vérifier qu'il s'agit bien d'un document valide (conforme au Schema).
   Corriger le schema en cas d'erreur de validation.

> fix #1 XML Schema

### 2. Transformation XSLT (5 points)

Dans le dossier "src/main/resources", écrivez une feuille de style XSLT « Musee.xsl » capable de générer la page HTML "Musee-modele.html"
à partir du document "Musee.xml".

> fix #2 XSLT

### 3. API SAX et DOM avec JAXP

L'interface *MuseeParser* spécifie le type d'objets *MuseeParser*. Un objet de type *MuseeParser* dispose 
d'une opération *parse* qui prend en entrée un *InputStream* correspondant à un fichier XML respectant la 
structure du document XML fourni en exemple dans le dossier "src/test/resources". L'opération retourne un 
objet de type *Musee* initialisé avec les données contenues dans le fichier XML fourni en entrée sous forme 
d'InputStream.

L'objectif de cet exercice est de fournir l'implantation des méthodes *parse* des classes
*MuseeSaxParser* et *MuseeDomParser*. Ces classes implémentent l'interface *MuseeParser* et doivent 
respectivement utiliser l'API SAX et DOM pour faire le traitement XML attendu.

#### 3.1. Utilisation de l'API SAX (4,5 points)

Implantez la méthode *parse* de la classe *MuseeSaxParser* en utilisant l'API SAX fournie par JAXP.
Vous pouvez exécuter le test contenu dans la classe *MuseeSaxParserTest* : tant que le test ne passe pas, cela 
signifie que le code n'effectue pas le traitement attendu. Attention, il ne suffit pas que le test passe pour que 
le code soit correct.

> fix 3.1 API SAX

#### 3.2. Utilisation de l'API DOM (4,5 points)

Implantez la méthode *parse* de la classe *MuseeDomParser* en utilisant l'API DOM fournie par JAXP.
Vous pouvez exécuter le test contenu dans la classe *MuseeDomParserTest* : tant que le test ne passe pas, cela
signifie que le code n'effectue pas le traitement attendu. Attention, il ne suffit pas que le test passe pour que
le code soit correct.

> fix 3.2 API DOM

#### 3.3. SAX vs DOM (1 point)

Indiquez dans quels cas il est préférable de traiter un document XML avec l'API SAX plutôt qu'avec l'API DOM.
Justifiez votre réponse.  
Réponse attendue ici :  
.............................................................................................................  
.............................................................................................................  
.............................................................................................................  
.............................................................................................................

> fix 3.3 SAX vs DOM



