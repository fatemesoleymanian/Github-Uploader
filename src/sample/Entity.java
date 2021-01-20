package sample;

public class Entity {
    String directory;
    String comment;
    String link;

    public String getDirectory() throws Exception{
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
