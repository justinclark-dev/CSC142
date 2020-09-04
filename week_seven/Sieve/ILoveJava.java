public class ILoveJava {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED ="\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_ORANGE = "\033[38;5;172m";

    private static String eyeColor = ANSI_BLUE;
    private static String fontColor = ANSI_ORANGE;

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
            "                         IIIIIIIIIIIIIIIIIIII \n" +
            "                    IIIIIIIIIIIIIIIIIIIIIIIIIIIIII \n" +
            "                IIIIIIIIIIIIIII"+eyeColor+"IIIIIIII"+ANSI_RESET+"IIIIIIIIIIIIIII \n" +
            "             IIIIIIIIIIIIIIIII"+eyeColor+"III"+ANSI_BLACK+"IIII"+eyeColor+"III"+ANSI_RESET+"IIIIIIIIIIIIIIIII \n" +
            "            IIIIIIIIIIIIIIIII"+eyeColor+"III"+ANSI_BLACK+"IIIIII"+eyeColor+"III"+ANSI_RESET+"IIIIIIIIIIIIIIIII \n" +
            "             IIIIIIIIIIIIIIIII"+eyeColor+"III"+ANSI_BLACK+"IIII"+eyeColor+"III"+ANSI_RESET+"IIIIIIIIIIIIIIIII \n" +
            "                IIIIIIIIIIIIIII"+eyeColor+"IIIIIIII"+ANSI_RESET+"IIIIIIIIIIIIIII \n" +
            "                    IIIIIIIIIIIIIIIIIIIIIIIIIIIIII \n" +
            "                         IIIIIIIIIIIIIIIIIIII \n" +
            " \n" +
            " \n" + ANSI_RED +
            "                            ///\\      /\\\\\\ \n" +
            "                          //////\\    /\\\\\\\\\\\\ \n" +
            "                        /////////\\  /\\\\\\\\\\\\\\\\\\ \n" +
            "                        \\\\\\\\\\\\\\\\\\\\\\/////////// \n" +
            "                         \\\\\\\\\\\\\\\\\\\\////////// \n" +
            "                           \\\\\\\\\\\\\\\\//////// \n" +
            "                             \\\\\\\\\\\\////// \n" +
            "                               \\\\\\\\//// \n" +
            "                                 \\\\// \n" +
            "                                  \\/ \n" +
            " \n" + 
            " \n" + fontColor + 
            "            JJJJ          AAAA    VVVV            VVVV    AAAA \n" +
            "            JJJJ         AAAAAA    VVVV          VVVV    AAAAAA \n" +
            "            JJJJ        AAAAAAAA    VVVV        VVVV    AAAAAAAA \n" +
            "            JJJJ       AAAA  AAAA    VVVV      VVVV    AAAA  AAAA \n" +
            "            JJJJ      AAAA    AAAA    VVVV    VVVV    AAAA    AAAA \n" +
            "JJJJ        JJJJ     AAAAAAAAAAAAAA    VVVV  VVVV    AAAAAAAAAAAAAA \n" +
            "JJJJ        JJJJ    AAAAAAAAAAAAAAAA    VVVVVVVV    AAAAAAAAAAAAAAAA \n" +
            " JJJJJJJJJJJJJJ    AAAA          AAAA    VVVVVV    AAAA          AAAA \n" +
            "   JJJJJJJJJJ     AAAA            AAAA    VVVV    AAAA            AAAA \n"
            + ANSI_RESET
        );
    }
}