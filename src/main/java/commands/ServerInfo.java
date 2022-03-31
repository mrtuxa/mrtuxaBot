package commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class ServerInfo implements MessageCreateListener {

    configurations.Configuration configuration = new configurations.Configuration();

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        if (messageCreateEvent.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "serverinfo")) {
            messageCreateEvent.getChannel().sendMessage("Server Name: " + messageCreateEvent.getServer().get().getName() + "\n" +
                                                        "Member Count: "  + "\n" + messageCreateEvent.getServer().get().getMemberCount() + "\n" +
                                                        "Server Owner: " + messageCreateEvent.getServer().get().getOwner() + "\n" +
                                                        //"Server Region: " + messageCreateEvent.getServer().get().getRegion().get().getName() + "\n" +
                                                        "Server Icon: " + messageCreateEvent.getServer().get().getIcon().get().getUrl() + "\n");
        }
    }
}
