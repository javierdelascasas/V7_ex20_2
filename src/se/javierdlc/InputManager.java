package se.javierdlc;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

public class InputManager {
    private Terminal terminal;
    private Key key;

    public InputManager(Terminal terminal) {
        this.terminal = terminal;
    }

    public boolean readInput() {
        do {
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                continue;
            }
            key = terminal.readInput();
        } while (key == null);
        if (key != null && key.getKind() != Key.Kind.Escape) {
            return true;
        } else if (key.getKind() == Key.Kind.Escape ){
            System.exit(0);
        }
        return false;
    }
}
