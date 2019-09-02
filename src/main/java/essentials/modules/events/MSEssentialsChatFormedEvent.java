package essentials.modules.events;

import com.velocitypowered.api.proxy.Player;
import net.kyori.text.Component;

public class MSEssentialsChatFormedEvent {

    private final Player sender;
    private final String rawMessage;
    private final Component message;

    public MSEssentialsChatFormedEvent(Player sender, String rawMessage, Component message) {
        this.sender = sender;
        this.rawMessage = rawMessage;
        this.message = message;
    }

    public Component getMessage() {
        return message;
    }

    public Player getSender() {
        return sender;
    }

    public String getRawMessage() {
        return rawMessage;
    }

}