import KAGO_framework.Config;
import KAGO_framework.control.MainController;
import my_project.model.Apple;
import my_project.model.Pear;

public class MainProgram {

    /**
     * Die Main-Methode von Java startet das Programm. Sie ist einzigartig im ganzen Projekt.
     * Sie startet das Framework. Weitere Details zum Ablauf kann man sehen, wenn man mit STRG+Linksklick auf
     * "startFramework()" in der Methode klickt.
     *
     * Der gesamte Prozess endet mit dem Erzeugen eines Objekts der Klasse "ProgramController", die sich im Paket "my_project > control"
     * befindet. Dort sollte deine Arbeit beginnen.
     */
    public static void main (String[] args){
        MainController.startFramework();
        Apple myApple = new Apple(50,50);
        myApple.update(24);
        Pear myPear = new Pear(150,150);
        myPear.update(24);
    }
}
