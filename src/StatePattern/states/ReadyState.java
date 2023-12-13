package StatePattern.states;

import StatePattern.ui.Player;

public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    public String onLock() {
        player.changeState(new LockedState(player));
        return "Locked..";
    }

    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    public String onNext() {
        return "Locked";
    }

    public String onPrevious() {
        return "Locked";
    }
}
