package StatePattern.states;

import StatePattern.ui.Player;

public class LockedState extends State {
    LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing!";
        } else {
            return "Locked...";
        }
    }

    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready...";
    }

    public String onNext() {
        return "Locked...";
    }

    public String onPrevious() {
        return "Locked...";
    }

}
