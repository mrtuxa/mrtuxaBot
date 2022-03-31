package configurations;

public class Configuration {
    private String token = "" ; //token
    private String prefix = ">" ; // Prefix for commands
    private String guild = ""; // Guild ID
    private String welcomeChannel = ""; // Welcome channel ID
    private String youtube_api_key = ""; // YouTube API key
    private String footerText = ""; // Footer text
    private String footerIcon = ""; // Footer icon
    private String EmbedColor = "3c0fdb"; // Embed color
    private String avatarUrl = ""; // Avatar URL
    private String botName = ""; // Bot name
    private String GuildName = ""; // Guild name
    public Configuration() {

    }

    public Configuration(String token) {
        this.token = token;
    }

    public String getToken() {
        return token ;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getPrefix() {
        return prefix;
    }

     public void setGuild(String guild) {
        this.guild = guild;
    }
    public String getGuild() {
        return guild;
    }

    public void setWelcomeChannel(String welcomeChannel) {
        this.welcomeChannel = welcomeChannel;
    }

    public String getWelcomeChannel() {
        return welcomeChannel;
    }

    public void setYoutube_api_key(String youtube_api_key) {
        this.youtube_api_key = youtube_api_key;
    }

    public String getYoutube_api_key() {
        return youtube_api_key;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public void setEmbedColor(String color) {
        this.EmbedColor = color;
    }

    public String getEmbedColor() {
        return EmbedColor;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setGuildName() {
        this.GuildName = GuildName;
    }

    public String getGuildName() {
        return GuildName;
    }

}
