package dumps;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.*;

public class MagicTrick {

    private static final String WORD = "abracadabra";
    private static List<String> trick = new ArrayList<>();

    public static List<String> castSpell(String magic) {
        return AccessController.doPrivileged(
                new PrivilegedAction<List<String>>() {
                    @Override
                    public List<String> run() {
                        if(magic.equalsIgnoreCase(WORD)){
                            if(trick.isEmpty())
                            {
                                trick.add(System.getProperty(magic));
                            }
//                            System.out.println(trick);
                            return trick;
                        }
                        throw new SecurityException("Incorrect Code");
                    }
                }
        );
    }

    public static void main(String[] args) {
        System.setProperty("abracadabra", "alhohamora");
        if (args != null && args.length > 0)
            System.out.print(MagicTrick.castSpell(args[0]));
    }

}


