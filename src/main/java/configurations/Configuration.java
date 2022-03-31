package configurations;

public class Configuration {
<<<<<<< HEAD
    private String token = "OTU5MTAzNzIyMzY4MTU5ODM0.YkXA8g.i6-_VQQBP7KtSWXMmwqK2-cEKhc"; //token
    private String prefix = ">"; // Prefix for commands
    private String guild = "947468849505263616"; // Guild ID
    private String welcomeChannel = "947468849505263619"; // Welcome channel ID
=======
    private String token = "" ; //token
    private String prefix = ">" ; // Prefix for commands
    private String guild = ""; // Guild ID
    private String welcomeChannel = ""; // Welcome channel ID
>>>>>>> 8f7fcaeb81c00de57e436f4b496a6a4e913d93a5
    private String youtube_api_key = ""; // YouTube API key
    private String footerText = ""; // Footer text
    private String footerIcon = ""; // Footer icon
    private String EmbedColor = "3c0fdb"; // Embed color
<<<<<<< HEAD
    private String avatarUrl = "https://cdn.discordapp.com/attachments/956593618221695028/957042576035311736/VictoriaState.png"; // Avatar URL
    private String botName = "Linus Torvalds"; // Bot name
    private String GuildName = "mrtuxa"; // Guild name
=======
    private String avatarUrl = ""; // Avatar URL
    private String botName = ""; // Bot name
    private String GuildName = ""; // Guild name
>>>>>>> 8f7fcaeb81c00de57e436f4b496a6a4e913d93a5
    private String activityName = ">help to getting started"; // Activity name
    private String activityUrl = "https://www.youtube.com/watch?v=Z_JU4NE90gI"; // Activity URL
    private String InviteChannel = "959099894403055707"; // Invite channel ID

    public Configuration() {

    }

    public Configuration(String token) {
        this.token = token;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public String getWelcomeChannel() {
        return welcomeChannel;
    }

    public void setWelcomeChannel(String welcomeChannel) {
        this.welcomeChannel = welcomeChannel;
    }

    public String getYoutube_api_key() {
        return youtube_api_key;
    }

    public void setYoutube_api_key(String youtube_api_key) {
        this.youtube_api_key = youtube_api_key;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public void setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
    }

    public String getEmbedColor() {
        return EmbedColor;
    }

    public void setEmbedColor(String embedColor) {
        EmbedColor = embedColor;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getGuildName() {
        return GuildName;
    }

    public void setGuildName(String guildName) {
        GuildName = guildName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getInviteChannel() {
        return InviteChannel;
    }

    public void setInviteChannel(String inviteChannel) {
        InviteChannel = inviteChannel;
    }
}
