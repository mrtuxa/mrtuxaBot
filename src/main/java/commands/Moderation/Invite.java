package commands.Moderation;

import configurations.Configuration;
import org.javacord.api.entity.server.invite.InviteBuilder;
import org.javacord.api.listener.message.MessageCreateListener;

public class Invite implements MessageCreateListener {
    configurations.Configuration configuration = new Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "invite")) {
            /*     event.getChannel().sendMessage(new Invite().
                    .setChannel(event.getChannel())
                    .setNeverExpires(true)
                    .setMaxUses(999)
                    .create().join()); */
        }
    }
}
