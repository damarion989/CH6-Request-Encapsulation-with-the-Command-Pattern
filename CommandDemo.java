interface Command {
    void execute();
}

// Receiver: performs the actual actions
class GameMusic {
    public void play() {
        System.out.println("Game music is playing.");
    }

    public void stop() {
        System.out.println("Game music stopped.");
    }
}

// Concrete command: stores a request to play music
class PlayMusicCommand implements Command {
    private GameMusic music;

    public PlayMusicCommand(GameMusic music) {
        this.music = music;
    }

    public void execute() {
        music.play();
    }
}

// Invoker: runs any command it receives
class Remote {
    public void press(Command command) {
        command.execute();
    }
}

public class CommandDemo {
    public static void main(String[] args) {
        GameMusic music = new GameMusic();
        Remote remote = new Remote();

        remote.press(new PlayMusicCommand(music));
    }
}
