import java.util.Scanner;

public class house {
    // H4 = Menjador
    // H5 = Cuina
    // H6 = Bany
    static boolean lightH1, lightH2, lightH3, lightH4, lightH5, lightH6 = false;
    static boolean doorH1, doorH2, doorH3, doorH4, doorH5, mainDoor = false;
    static float tempH1, tempH2, tempH3, tempH4, tempH5, tempH6 = 0;
    static int audioH1, audioH2, audioH3, audioH4, audioH5, audioH6 = 0;

    public static void main(String[] args) {
        boolean end = false;
        Scanner lector = new Scanner(System.in);
        String mainMenu = "";
        String menuA = "";
        String menuB = "";
        String menuC = "";
        String menuD = "";
        int room = 0;
        String answer = "";
        boolean lightOn = false;
        int door = 0;
        boolean sensor = false;
        boolean tempOk = false;
        float temp = 0;
        int volAll = 0;
        boolean ok2 = false;
        boolean error = true;
        while (end == false) {
            System.out.println("-----Menú principal-----");
            System.out.println("a) Il·luminació");
            System.out.println("b) Portes intel·ligents");
            System.out.println("c) Climatització");
            System.out.println("d) Àudio");
            System.out.println("e) Exit");
            System.out.println("------------------------");
            System.out.println("i) Info dels menus");
            System.out.println("------------------------");
            mainMenu = lector.nextLine();
            switch (mainMenu) {
                // -------------------------LLums-----------------------------------
                case "a":
                    while (!(menuA.equals("d"))) {
                        ligthsMenu();
                        menuA = lector.nextLine();
                        switch (menuA) {
                            case "a":
                                while (error) {
                                    try {
                                        rooms();
                                        room = lector.nextInt();
                                        lector.nextLine();
                                        if (room >= 1 && room <= 6) {
                                            error = false;
                                        } else {
                                            System.out.println("");
                                            System.out.print("Error: el numero ha de ser entre 1 i 6...");
                                            lector.nextLine();
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("");
                                        System.out.print("Error: ha de ser un numero...");
                                        lector.nextLine();
                                    }
                                }
                                System.out.println("Vols encendre o apagar la llum?");
                                answer = lector.nextLine();
                                while (!(answer.equals("encendre") || answer.equals("apagar"))) {
                                    System.out.println("Error: torna a intentar-ho...");
                                    answer = lector.nextLine();
                                }
                                if (answer.equals("encendre")) {
                                    lightOn = true;
                                } else {
                                    lightOn = false;
                                }
                                mLigth(room, lightOn);
                                break;
                            case "b":
                                room = 0;
                                System.out.println("Vols encendre o apagar les llums?");
                                answer = lector.nextLine();
                                while (!(answer.equals("encendre") || answer.equals("apagar"))) {
                                    System.out.println("Error: torna a intentar-ho...");
                                    answer = lector.nextLine();
                                }
                                if (answer.equals("encendre")) {
                                    lightOn = true;
                                } else {
                                    lightOn = false;
                                }
                                mLigth(room, lightOn);
                                System.out.println("Totes les llums han sigut actualitzades.");
                                break;
                            case "c":
                                System.out.println("-----Estat de les llums-----");
                                System.out.println("Menjador: " + lightH1);
                                System.out.println("Cuina: " + lightH2);
                                System.out.println("Bany: " + lightH3);
                                System.out.println("H1: " + lightH4);
                                System.out.println("H2: " + lightH5);
                                System.out.println("H3: " + lightH6);
                                lector.nextLine();
                                break;
                            case "d":
                                System.out.println("");
                                System.out.print("Sortint del menu de llums...");
                                lector.nextLine();
                                break;
                            default:
                                System.out.println("");
                                System.out.print("ERROR: torna a intentar-ho...");
                                lector.nextLine();
                                break;
                        }
                    }
                    error = true;
                    break;
                // -------------------------Portes-----------------------------------
                case "b":
                    while (!(menuB.equals("d"))) {
                        doorsMenu();
                        menuB = lector.nextLine();
                        switch (menuB) {
                            case "a":
                                while (error) {
                                    try {
                                        doors();
                                        door = lector.nextInt();
                                        lector.nextLine();
                                        if (door >= 1 && door <= 6) {
                                            error = false;
                                        } else {
                                            System.out.println("");
                                            System.out.print("Error: el numero ha de ser entre 1 i 6...");
                                            lector.nextLine();
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("");
                                        System.out.print("Error: ha de ser un numero decimal...");
                                        lector.nextLine();
                                    }
                                }
                                System.out.println("Vols encendre o apagar els sensors?");
                                answer = lector.nextLine();
                                while (!(answer.equals("encendre") || answer.equals("apagar"))) {
                                    System.out.println("Error: torna a intentar-ho...");
                                    answer = lector.nextLine();
                                }
                                if (answer.equals("encendre")) {
                                    sensor = true;
                                } else {
                                    sensor = false;
                                }
                                mDoor(door, sensor);
                                break;
                            case "b":
                                door = 0;
                                System.out.println("Vols encendre o apagar els sensors?");
                                answer = lector.nextLine();
                                while (!(answer.equals("encendre") || answer.equals("apagar"))) {
                                    System.out.println("Error: torna a intentar-ho...");
                                    answer = lector.nextLine();
                                }
                                if (answer.equals("encendre")) {
                                    sensor = true;
                                } else {
                                    sensor = false;
                                }
                                mDoor(door, sensor);
                                System.out.println("Tots els sensors han sigut actualitzats.");
                                break;
                            case "c":
                                System.out.println("-----Estat dels sensors-----");
                                System.out.println("P1: " + doorH1);
                                System.out.println("P2: " + doorH2);
                                System.out.println("P3: " + doorH3);
                                System.out.println("P4: " + doorH4);
                                System.out.println("P5: " + doorH5);
                                System.out.println("Porta principal: " + mainDoor);
                                System.out.print("Enter per continuar...");
                                lector.nextLine();
                                break;
                            case "d":
                                System.out.println("");
                                System.out.print("Sortint del menu de portes...");
                                lector.nextLine();
                                break;
                            default:
                                System.out.println("");
                                System.out.print("ERROR: torna a intentar-ho...");
                                lector.nextLine();
                                break;
                        }
                    }
                    error = true;
                    break;
                // -------------------------Climatització-----------------------------------
                case "c":
                    while (!(menuC.equals("d"))) {
                        tempMenu();
                        menuC = lector.nextLine();
                        switch (menuC) {
                            case "a":
                                while (error) {
                                    try {
                                        rooms();
                                        room = lector.nextInt();
                                        lector.nextLine();
                                        if (room >= 1 && room <= 6) {
                                            error = false;
                                        } else {
                                            System.out.println("Error: el número ha de ser entre 1 i 6.");
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("");
                                        System.out.print("Error: ha de ser un número vàlid...");
                                        lector.nextLine();
                                    }
                                }
                                error = true;
                                System.out.print("Introdueix la temperatura desitjada: ");
                                temp = 0;
                                tempOk = false;
                                while (!tempOk) {
                                    try {
                                        temp = lector.nextFloat();
                                        lector.nextLine();
                                        tempOk = true;
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("");
                                        System.out.print("Error: introdueix un valor numèric per la temperatura...");
                                        lector.nextLine();
                                    }
                                }
                                mTemp(room, temp);
                                System.out.println("Temperatura actualitzada correctament.");
                                break;

                            case "b":
                                System.out.print("Introdueix la temperatura desitjada per totes les sales: ");
                                float tempAll = 0;
                                boolean ok = false;
                                while (!ok) {
                                    try {
                                        tempAll = lector.nextFloat();
                                        lector.nextLine();
                                        ok = true;
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("Error: introdueix un valor numèric per la temperatura.");
                                        lector.nextLine();
                                    }
                                }
                                mTemp(0, tempAll);
                                System.out.println("Temperatura de totes les sales actualitzada.");
                                break;

                            case "c":
                                System.out.println("-----Temperatures actuals-----");
                                System.out.println("Menjador: " + tempH1 + " °C");
                                System.out.println("Cuina: " + tempH2 + " °C");
                                System.out.println("Bany: " + tempH3 + " °C");
                                System.out.println("H1: " + tempH4 + " °C");
                                System.out.println("H2: " + tempH5 + " °C");
                                System.out.println("H3: " + tempH6 + " °C");
                                System.out.print("Prem Enter per continuar...");
                                lector.nextLine();
                                break;

                            case "d":
                                System.out.println("Sortint del menú de climatització...");
                                lector.nextLine();
                                break;

                            default:
                                System.out.println("");
                                System.out.print("ERROR: opció no vàlida...");
                                lector.nextLine();
                                break;
                        }
                    }
                    error = true;
                    break;
                // --------------------------Àudio-----------------------------------
                case "d":
                    while (!(menuD.equals("d"))) {
                        audioMenu();
                        menuD = lector.nextLine();
                        switch (menuD) {
                            case "a":
                                while (error) {
                                    try {
                                        rooms();
                                        System.out.print("Introdueix el número de la sala: ");
                                        room = lector.nextInt();
                                        lector.nextLine();
                                        if (room >= 1 && room <= 6) {
                                            error = false;
                                        } else {
                                            System.out.println("Error: el número ha de ser entre 1 i 6.");
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("");
                                        System.out.print("Error: ha de ser un número vàlid...");
                                        lector.nextLine();
                                    }
                                }
                                error = true;
                                System.out.print("Introdueix el volum (0-100): ");
                                int vol = 0;
                                boolean volOk = false;
                                while (!volOk) {
                                    try {
                                        vol = lector.nextInt();
                                        lector.nextLine();
                                        if (vol >= 0 && vol <= 100) {
                                            volOk = true;
                                        } else {
                                            System.out.println("Error: el volum ha d'estar entre 0 i 100.");
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("");
                                        System.out.print("Error: introdueix un número vàlid...");
                                        lector.nextLine();
                                    }
                                }
                                mAudio(room, vol);
                                System.out.println("Volum actualitzat correctament.");
                                break;

                            case "b":
                                System.out.print("Introdueix el volum per a totes les sales (0-100): ");
                                volAll = 0;
                                ok2 = false;
                                while (!ok2) {
                                    try {
                                        volAll = lector.nextInt();
                                        lector.nextLine();
                                        if (volAll >= 0 && volAll <= 100) {
                                            ok2 = true;
                                        } else {
                                            System.out.println("Error: el volum ha d'estar entre 0 i 100.");
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("");
                                        System.out.print("Error: introdueix un número vàlid...");
                                        lector.nextLine();
                                    }
                                }
                                mAudio(0, volAll);
                                System.out.println("Volumen de totes les sales actualitzat.");
                                break;

                            case "c":
                                System.out.println("-----Volumen actual-----");
                                System.out.println("Menjador: " + audioH1);
                                System.out.println("Cuina: " + audioH2);
                                System.out.println("Bany: " + audioH3);
                                System.out.println("H1: " + audioH4);
                                System.out.println("H2: " + audioH5);
                                System.out.println("H3: " + audioH6);
                                System.out.print("Prem Enter per continuar...");
                                lector.nextLine();
                                break;

                            case "d":
                                System.out.println("");
                                System.out.print("Sortint del menú d'àudio...");
                                lector.nextLine();
                                break;

                            default:
                                System.out.println("");
                                System.out.print("ERROR: opció no vàlida...");
                                lector.nextLine();
                                break;
                        }
                    }
                    error = true;
                    break;

                // --------------------------Exit-----------------------------------
                case "e":
                    end = true;
                    break;
                // --------------------------Info-----------------------------------
                case "i":
                    System.out.println("-----Informació dels menús-----");
                    System.out.println();
                    System.out.println("a) Il·luminació:");
                    System.out.println("   • Permet encendre o apagar la llum d'una habitació concreta.");
                    System.out.println("   • També pots encendre o apagar totes les llums alhora.");
                    System.out.println("   • Pots consultar l'estat actual (encesa/apagada) de cada llum.");
                    System.out.println();
                    System.out.println("b) Portes intel·ligents:");
                    System.out.println("   • Permet activar o desactivar el sensor d'una porta concreta.");
                    System.out.println("   • També pots canviar l'estat de tots els sensors alhora.");
                    System.out.println("   • Pots veure si els sensors estan actius o inactius.");
                    System.out.println();
                    System.out.println("c) Climatització:");
                    System.out.println("   • Pots establir la temperatura d'una sala específica.");
                    System.out.println("   • També pots aplicar la mateixa temperatura a totes les sales.");
                    System.out.println("   • Mostra la temperatura actual de cada habitació.");
                    System.out.println();
                    System.out.println("d) Àudio:");
                    System.out.println("   • Permet ajustar el volum d'una habitació concreta.");
                    System.out.println("   • Pots configurar el volum de totes les sales alhora.");
                    System.out.println("   • Mostra el volum actual de cada habitació.");
                    System.out.println();
                    System.out.println("e) Exit:");
                    System.out.println("   • Surt del programa.");
                    System.out.println();
                    System.out.print("Prem Enter per tornar al menú principal...");
                    lector.nextLine();
                    error = true;
                    break;

                default:
                    System.out.print("ERROR: torna a intentar-ho...");
                    lector.nextLine();
                    error = true;
                    break;
            }
        }
        lector.close();
    }

    public static void ligthsMenu() {
        System.out.println("-----Menú il·luminació-----");
        System.out.println("a) Controla una habitació");
        System.out.println("b) Controla totes les habitacions");
        System.out.println("c) Veure l'estat de les habitacions");
        System.out.println("d) Exit");
    }

    public static void doorsMenu() {
        System.out.println("-----Menú Portes-----");
        System.out.println("a) Cambia un sensor");
        System.out.println("b) Cambia tots els sensors");
        System.out.println("c) Veure estat dels sensors");
        System.out.println("d) Exit");
    }

    public static void tempMenu() {
        System.out.println("-----Menú Climatització-----");
        System.out.println("a) Controla una sala");
        System.out.println("b) Controla totes les salas");
        System.out.println("c) Veure temperatura salas");
        System.out.println("d) Exit");
    }

    public static void audioMenu() {
        System.out.println("-----Menú Àudio-----");
        System.out.println("a) Controla un altaveu");
        System.out.println("b) Controla tots els altaveus");
        System.out.println("c) Veure volum salas");
        System.out.println("d) Exit");
    }

    public static void rooms() {
        System.out.println("-----Tria habitacions-----");
        System.out.println("1) Menjador");
        System.out.println("2) Cuina");
        System.out.println("3) Bany");
        System.out.println("4) H1");
        System.out.println("5) H2");
        System.out.println("6) H3");
    }

    public static void doors() {
        System.out.println("-----Tria porta-----");
        System.out.println("1) P1");
        System.out.println("2) P2");
        System.out.println("3) P3");
        System.out.println("4) P4");
        System.out.println("5) P5");
        System.out.println("6) Porta principal");
    }

    public static void mLigth(int r, boolean ligth) {
        if (r == 1) {
            lightH1 = ligth;
        } else if (r == 2) {
            lightH2 = ligth;
        } else if (r == 3) {
            lightH3 = ligth;
        } else if (r == 4) {
            lightH4 = ligth;
        } else if (r == 5) {
            lightH5 = ligth;
        } else if (r == 6) {
            lightH6 = ligth;
        } else {
            lightH1 = ligth;
            lightH2 = ligth;
            lightH3 = ligth;
            lightH4 = ligth;
            lightH5 = ligth;
            lightH6 = ligth;
        }
    }

    public static void mDoor(int d, boolean s) {
        if (d == 1) {
            doorH1 = s;
        } else if (d == 2) {
            doorH2 = s;
        } else if (d == 3) {
            doorH3 = s;
        } else if (d == 4) {
            doorH4 = s;
        } else if (d == 5) {
            doorH5 = s;
        } else if (d == 6) {
            mainDoor = s;
        } else {
            doorH1 = s;
            doorH2 = s;
            doorH3 = s;
            doorH4 = s;
            doorH5 = s;
            mainDoor = s;
        }
    }

    public static void mTemp(int r, float t) {
        if (r == 1) {
            tempH1 = t;
        } else if (r == 2) {
            tempH2 = t;
        } else if (r == 3) {
            tempH3 = t;
        } else if (r == 4) {
            tempH4 = t;
        } else if (r == 5) {
            tempH5 = t;
        } else if (r == 6) {
            tempH6 = t;
        } else {
            tempH1 = t;
            tempH2 = t;
            tempH3 = t;
            tempH4 = t;
            tempH5 = t;
            tempH6 = t;
        }
    }

    public static void mAudio(int r, int v) {
        if (r == 1) {
            audioH1 = v;
        } else if (r == 2) {
            audioH2 = v;
        } else if (r == 3) {
            audioH3 = v;
        } else if (r == 4) {
            audioH4 = v;
        } else if (r == 5) {
            audioH5 = v;
        } else if (r == 6) {
            audioH6 = v;
        } else {
            audioH1 = v;
            audioH2 = v;
            audioH3 = v;
            audioH4 = v;
            audioH5 = v;
            audioH6 = v;
        }
    }
}
