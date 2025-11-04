import java.util.Scanner;

public class house {
    // H4 = Menjador
    // H5 = Cuina
    // H6 = Bany
    static boolean lightH1 = false, lightH2 = false, lightH3 = false, lightH4 = false, lightH5 = false, lightH6 = false;
    static boolean doorH1 = false, doorH2 = false, doorH3 = false, doorH4 = false, doorH5 = false, mainDoor = false;
    static float tempH1 = 0, tempH2 = 0, tempH3 = 0, tempH4 = 0, tempH5 = 0, tempH6 = 0;
    static boolean acH1, acH2, acH3, acH4, acH5, acH6 = false;
    static int audioH1 = 0, audioH2 = 0, audioH3 = 0, audioH4 = 0, audioH5 = 0, audioH6 = 0;

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
        float tempAll = 0;
        boolean ok = false;
        int hores = 0;
        boolean horaOk = false;
        int minuts = 0;
        boolean minutOk = false;
        int segundosTotales = 0;
        int vol = 0;
        boolean volOk = false;

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
                    menuA = "";
                    while (!(menuA.equals("d"))) {
                        lightsMenu();
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
                                mlight(room, lightOn);
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
                                mlight(room, lightOn);
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
                    menuA = "";
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
                    menuC = "";
                    while (!menuC.equals("f")) {
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
                                        System.out.println("Error: ha de ser un número vàlid...");
                                        lector.nextLine();
                                    }
                                }
                                error = true;
                                System.out.print("Introdueix la temperatura desitjada (°C): ");
                                temp = 0;
                                tempOk = false;
                                while (!tempOk) {
                                    try {
                                        temp = lector.nextFloat();
                                        lector.nextLine();
                                        tempOk = true;
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("Error: introdueix un valor numèric...");
                                        lector.nextLine();
                                    }
                                }
                                mTemp(room, temp);
                                System.out.println("Temperatura actualitzada a " + temp + "°C");
                                break;

                            case "b":
                                System.out.print("Introdueix la temperatura per totes les sales (°C): ");
                                tempAll = 0;
                                ok = false;
                                while (!ok) {
                                    try {
                                        tempAll = lector.nextFloat();
                                        lector.nextLine();
                                        ok = true;
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.println("Error: introdueix un valor numèric.");
                                        lector.nextLine();
                                    }
                                }
                                mTemp(0, tempAll);
                                System.out.println("Temperatura de totes les sales actualitzada");
                                break;

                            case "c":
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
                                        System.out.println("Error: ha de ser un número vàlid...");
                                        lector.nextLine();
                                    }
                                }
                                error = true;
                                System.out.println("Vols encendre o apagar l'aire condicionat?");
                                answer = lector.nextLine();
                                while (!(answer.equals("encendre") || answer.equals("apagar"))) {
                                    System.out.println("Error: torna a intentar-ho...");
                                    answer = lector.nextLine();
                                }
                                boolean state = answer.equals("encendre");
                                setAC(room, state);
                                System.out.println("Aire condicionat " + (state ? "encès" : "apagat"));
                                break;

                            case "d":
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
                                        System.out.println("Error: ha de ser un número vàlid...");
                                        lector.nextLine();
                                    }
                                }
                                error = true;
                                
                                setAC(room, true);
                                System.out.println("Aire condicionat encès");
                                
                                System.out.println("¿Quant de temps vols que estigui encès?");
                                System.out.print("Hores: ");
                                hores = 0;
                                horaOk = false;
                                while (!horaOk) {
                                    try {
                                        hores = lector.nextInt();
                                        lector.nextLine();
                                        if (hores >= 0 && hores <= 23) {
                                            horaOk = true;
                                        } else {
                                            System.out.print("Error: entre 0 i 23 hores: ");
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.print("Error: introdueix un número: ");
                                        lector.nextLine();
                                    }
                                }
                                
                                System.out.print("Minuts: ");
                                minuts = 0;
                                minutOk = false;
                                while (!minutOk) {
                                    try {
                                        minuts = lector.nextInt();
                                        lector.nextLine();
                                        if (minuts >= 0 && minuts <= 59) {
                                            minutOk = true;
                                        } else {
                                            System.out.print("Error: entre 0 i 59 minuts: ");
                                        }
                                    } catch (java.util.InputMismatchException ex) {
                                        System.out.print("Error: introdueix un número: ");
                                        lector.nextLine();
                                    }
                                }
                                
                                if (hores == 0 && minuts == 0) {
                                    System.out.println("ERROR: El temps ha de ser superior a 0");
                                    break;
                                }
                                
                                segundosTotales = (hores * 3600) + (minuts * 60);
                                System.out.println("Temporizador iniciat per " + hores + "h " + minuts + "min");
                                System.out.println("ALERTA: El programa estarà bloquejat durant aquest temps...");
                                
                                for (int i = 1; i <= segundosTotales; i++) {
                                    try {
                                        Thread.sleep(1000); // Espera 1 segundo
                                        
                                        if (i % 60 == 0) {
                                            int minutsRestants = (segundosTotales - i) / 60;
                                            int horesRestants = minutsRestants / 60;
                                            minutsRestants = minutsRestants % 60;
                                            System.out.println("Temps restant: " + horesRestants + "h " + minutsRestants + "min");
                                        }
                                        
                                    } catch (InterruptedException e) {
                                        System.out.println("Error en el temporizador");
                                    }
                                }
                                
                                setAC(room, false);
                                System.out.println("TEMPORIZADOR FINALITZAT: Aire condicionat apagat!");
                                System.out.print("Prem Enter per continuar...");
                                lector.nextLine();
                                break;

                            case "e":
                                System.out.println("-----ESTAT CLIMATITZACIÓ----");
                                System.out.println("Menjador: " + tempH1 + "°C - AC: " + (acH1 ? "ENCÈS" : "APAGAT"));
                                System.out.println("Cuina: " + tempH2 + "°C - AC: " + (acH2 ? "ENCÈS" : "APAGAT"));
                                System.out.println("Bany: " + tempH3 + "°C - AC: " + (acH3 ? "ENCÈS" : "APAGAT"));
                                System.out.println("H1: " + tempH4 + "°C - AC: " + (acH4 ? "ENCÈS" : "APAGAT"));
                                System.out.println("H2: " + tempH5 + "°C - AC: " + (acH5 ? "ENCÈS" : "APAGAT"));
                                System.out.println("H3: " + tempH6 + "°C - AC: " + (acH6 ? "ENCÈS" : "APAGAT"));
                                System.out.print("Prem Enter per continuar...");
                                lector.nextLine();
                                break;
            case "f":
                System.out.println("Sortint del menú de climatització...");
                break;

            default:
                System.out.println("ERROR: opció no vàlida");
                break;
        }
    }
    error = true;
    break;
                // --------------------------Àudio-----------------------------------
                case "d":
                    menuA = "";
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
                                vol = 0;
                                volOk = false;
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
                    menuA = "";
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

    public static void lightsMenu() {
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
        System.out.println("a) Ajustar temperatura d'una sala");
        System.out.println("b) Ajustar temperatura de totes les sales");
        System.out.println("c) Encendre/Apagar aire condicionat");
        System.out.println("d) Programar temporizador aire condicionat");
        System.out.println("e) Veure estat climatització");
        System.out.println("f) Exit");
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

    public static void mlight(int r, boolean light) {
        if (r == 1) {
            lightH1 = light;
        } else if (r == 2) {
            lightH2 = light;
        } else if (r == 3) {
            lightH3 = light;
        } else if (r == 4) {
            lightH4 = light;
        } else if (r == 5) {
            lightH5 = light;
        } else if (r == 6) {
            lightH6 = light;
        } else {
            lightH1 = light;
            lightH2 = light;
            lightH3 = light;
            lightH4 = light;
            lightH5 = light;
            lightH6 = light;
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

    public static void setAC(int room, boolean state) {
        if (room == 1) acH1 = state;
        else if (room == 2) acH2 = state;
        else if (room == 3) acH3 = state;
        else if (room == 4) acH4 = state;
        else if (room == 5) acH5 = state;
        else if (room == 6) acH6 = state;
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
