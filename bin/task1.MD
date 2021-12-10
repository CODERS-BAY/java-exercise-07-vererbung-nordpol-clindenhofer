# Das ist eine Wiederholung der objektorientierten Konzepte.

Bitte versuche als Übung alles in Markdown zu beantworten. Hier ist ein [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. Was ist das Ziel der Objektorientierung?
 * Erhöhung der Flexibilität und Wartbarkeit von Programmen.
   Objektorientierte Programme sind modular und können daher einfacher verteilt entwickelt werden.

2. Gibt es OOP nur in Java?
 * Nein. Andere objektorientierte Programmiersprachen:
    - Javascript
    - Python
    - C++
    - Ruby
    - Scala
    - PHP
  [Java gilt jedoch als eine der populärsten Sprachen](https://en.wikipedia.org/wiki/Java_(programming_language)#/media/File:Tiobeindex.png)

3. Was ist der Unterschied zwischen Objekt und Klasse?
 * - **Objekt:** Ein konkretes Exemplar, eine Instanz, das nach einem bestimmten Bauplan gefertigt wurde. Es wird während
              der Laufzeit erzeugt ("instanziiert"). Das heißt, es wird Speicher reserviert, wo die Eigenschaften des Objekts
              gespeichert werden. Zusammen mit den Methoden ist dieser Speicherbereich das Objekt.
              <https://de.wikipedia.org/wiki/Objekt_(Programmierung)>

   - **Klasse:** Eine Klasse legt fest, welche Attribute (Eigenschaften) und Methoden (Verhaltensweisen) ein Objekt hat.
              <https://de.wikipedia.org/wiki/Klasse_(Objektorientierung)>

4. Wie erzeuge ich eine neue Instanz? (Welches Schlüsselwort gibt es dafür)
 * Schlüsselwort: `new`
   Beispiel:
   ```
   Mitarbeiter mitarbeiterObjekt;
   mitarbeiterObjekt = new Mitarbeiter();
   ```

5. Was bedeutet das Schlüsselwort `static` und wo kann es überall verwendet werden?
 * Das Wort `static` kennzeichnet Strukturen, die nur einmal für die ganze Klasse existieren, 
   d.h. sie sind nicht an ein Objekt gebunden.

   Bei **Attributen** bedeutet `static`, dass das Attribut nur einmal pro Klasse existiert.
   Es wird nicht neu für jedes Objekt angelegt
   
   Bei **Methoden** bedeutet `static`, dass diese aufgerufen werden können, ohne dass zuvor
   ein Objekt erzeugt wurde.

6. Wozu dient die Vererbung?
 * Aufbauend auf existierende Klassen werden neue erschaffen, wobei die Beziehung zwischen neuer 
   und alter (ursprünglicher) Klasse dauerhaft ist.
   Eine neue Klasse kann dabei eine Erweiterung oder eine Einschränkung der ursprünglichen Klasse sein.
   <https://de.wikipedia.org/wiki/Vererbung_(Programmierung)>
 
 - **Codeersparnis**.
   - **"Programming by Difference"** 
        -> *Employee* ist wie eine *Person*, hat aber folgenden Unterschied ...
   - **Kompabilität** 
        -> *Employee* kann überall verwendet werden, wo *Person* erwartet wird
   - **Abstraktion** 
        -> *Employee* oder *Apprentice* können gleich behandelt werden   

7. Kann in Java von mehreren Klassen geerbt werden? Wenn ja wie?
 * In Java ist die Mehrfachvererbung *nicht* möglich.

   Mithilfe eines **Interfaces** kann man jedoch die Mehrfachvererbung realisieren, da dieses keine
   ausformulierten Methoden zur Verfügung stellt, sondern nur Signaturen (die gegebenenfalls
   überschrieben werden können).

8. Welche Vererbungshierarchien kennst du? (Ein Bild reicht aus)
  * Beispiel Vererbungshierarchien:
    (https://de.wikipedia.org/wiki/Vererbung_(Programmierung)#/media/Datei:InheritancePgmExample.svg)

9. Was beudeted Casten und wie ist die Syntax in Java dafür?
  * **Casten** ist die Umwandlung eines Datentypes in einen anderen.
    Es wird gleich der gewünschte Datentyp angegeben:
  
  ```
  int i = 20;
  long l = 1000;

  long newl = i; //funktioniert, da integer groß genug für long ist
  int i = l; //funktioniert nicht, da long zu groß für integer ist -> Datenverlust

  ```

10. Was ist der Unterschied zwischen explizieten und implizieten Typecasting?
 * - **Implizites Typecasting:**
      Daten des kleineren Datentyps werden durch den Compiler automatisch
      dem größeren angepasst, aber nur dann wenn es keinen Datenverlust gibt.

    - **Explizites Typcasting:**
      Der neue, gewünschte Datentyp wird angegeben, wobei Datenverlust miteinberechnet wird.

11. Erkläre die folgenden Schlüsselwörter: `super`, `this`
 * `super`:
    - ruft den Konstruktort der Oberklasse auf
    - ruft die Methoder einer Oberklasse auf
    - löst Namenskonflikt in einer Vererbungshierarchie auf

    `this`:
    - liefert eine Referenz auf das Objekt, in dem wir uns befinden


12. Für was dient der `instanceof` Operator. Gib ein sinnvolles Beispiel.
 * Bei `instanceof` handelt es sich um einen Binäroperator, der prüft, ob ein Objekt eine Instanz einer Klasse, 
   einer Subklasse oder eines Interfaces ist. Das Ergednis ist true oder false.

   ```
   class Parent {}
   class Child extends Parent {}

   class Testing {
     public static void main(String[] args) {
       Parent testParent = new Parent();
       if (testParent instanceof Child){
         Sytem.out.println("testParent is instance of Child);
       }
       else{
         Sytem.out.println("testParent is not instance of Child);
       }
     }
   }

   //das Ergebnis ist "false" ("testParent is not instance of Child), da Child eine Instanz von testParent ist

   ```



