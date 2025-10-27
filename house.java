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
        while (end == false){
            System.out.println("-----Menú principal-----");
            System.out.println("a) Il·luminació");
            System.out.println("b) Portes intel·ligents");
            System.out.println("c) Climatització");
            System.out.println("d) Àudio");
            System.out.println("e) Exit");
            mainMenu = lector.nextLine();
            switch (mainMenu){
                //-------------------------LLums-----------------------------------
                case "a":
                    while (!(menuA.equals("d"))) {
                        ligthsMenu();
                        menuA = lector.nextLine();
                        switch (menuA) {
                            case "a":
                                rooms();
                                room = lector.nextInt();
                                lector.nextLine();
                                System.out.println("Vols encendre o apagar les llums?");
                                while (!(answer.equals("encendre") || answer.equals("apagar"))){
                                    answer = lector.nextLine();
                                    if (answer.equals("encendre")){
                                        lightOn = true;
                                    }
                                    else if(answer.equals("apagar")){
                                        lightOn = false;
                                    }
                                    else{
                                        System.out.println("Error: torna a intentar-ho...");
                                    }
                                }
                                mLigth(room, lightOn);
                                break;
                            case "b":
                                
                                break;
                            case "c":
                                
                                break;
                            case "d":
                                System.out.println("Sortint del menu de llums...");
                                lector.nextLine();
                                break;
                            default:
                                System.out.println("ERROR: torna a intentar-ho...");
                                lector.nextLine();
                                break;
                        }
                    }
                    
                    break;
                //-------------------------Portes-----------------------------------
                case "b":
                    while (!(menuB.equals("d"))) {
                        doorsMenu();
                        menuB = lector.nextLine();
                        switch (menuB) {
                            case "a":
                                rooms();
                                break;
                            case "b":
                                
                                break;
                            case "c":
                                
                                break;
                            case "d":
                                System.out.println("Sortint del menu de portes...");
                                lector.nextLine();
                                break;
                            default:
                                System.out.println("ERROR: torna a intentar-ho...");
                                lector.nextLine();
                                break;
                        }
                    }
                    break;
                //-------------------------Climatització-----------------------------------
                case "c":
                    while (!(menuC.equals("d"))) {
                        tempMenu();
                        menuC = lector.nextLine();
                        switch (menuC) {
                            case "a":
                                rooms();
                                break;
                            case "b":
                                
                                break;
                            case "c":
                                
                                break;
                            case "d":
                                System.out.println("Sortint del menu de climatització...");
                                lector.nextLine();
                                break;
                            default:
                                System.out.println("ERROR: torna a intentar-ho...");
                                lector.nextLine();
                                break;
                        }
                    }
                    break;
                //--------------------------Àudio-----------------------------------
                case "d":
                    while (!(menuD.equals("d"))) {
                        audioMenu();
                        menuD = lector.nextLine();
                        switch (menuD) {
                            case "a":
                                rooms();
                                break;
                            case "b":
                                
                                break;
                            case "c":
                                
                                break;
                            case "d":
                                System.out.println("Sortint del menu d'àudio...");
                                lector.nextLine();
                                break;
                            default:
                                System.out.println("ERROR: torna a intentar-ho...");
                                lector.nextLine();
                                break;
                        }
                    }
                    break;
                case "e":
                    end = true;
                    break;
                default:
                    System.out.println("ERROR: torna a intentar-ho...");
                    lector.nextLine();
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
        System.out.println("a) Controla una sala");
        System.out.println("b) Controla totes les salas");
        System.out.println("c) Veure estat salas");
        System.out.println("d) Exit");
    }

    public static void tempMenu() {
        System.out.println("-----Menú Climatització-----");
        System.out.println("a) Controla una sala");
        System.out.println("b) Controla totes les salas");
        System.out.println("c) Veure estat salas");
        System.out.println("d) Exit");
    }

    public static void audioMenu() {
        System.out.println("-----Menú Àudio-----");
        System.out.println("a) Controla una sala");
        System.out.println("b) Controla totes les salas");
        System.out.println("c) Veure estat salas");
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

    public static void mLigth(int h, boolean ligth) {
        if (h == 1) {
            lightH1 = ligth;
        } else if (h == 2) {
            lightH2 = ligth;
        } else if (h == 3) {
            lightH3 = ligth;
        } else if (h == 4) {
            lightH4 = ligth;
        } else if (h == 5) {
            lightH5 = ligth;
        } else if (h == 6) {
            lightH6 = ligth;
        }
    }
}