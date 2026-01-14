public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        validateTitle(title);
        validateDescription(description);
        setTitle(title);
        setDescription(description);
    }

    private static void requireNotBlank(String s, String field) {
        if (s == null) {
            throw new IllegalArgumentException(field + " is null.");
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " is blank.");
        }
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    public void validateTitle(String title) {
        // no profanity; no .exe, no large titles > 200 char
        requireNotBlank(title, "title");
        String lowerTitle = title.toLowerCase();
        if (lowerTitle.contains("profanity")) {
            throw new IllegalArgumentException("Title contains profanity.");
        }
        if (lowerTitle.contains(".exe")) {
            throw new IllegalArgumentException("Title cannot contain .exe.");
        }
        if (title.length() > 200) {
            throw new IllegalArgumentException("Title too long.");
        }
    }

    public void validateDescription(String description) {
        // no profanity; no large desc > 1000 char
        requireNotBlank(description, "description");
        String lowerDesc = description.toLowerCase();
        if (lowerDesc.contains("profanity")) {
            throw new IllegalArgumentException("Description contains profanity.");
        }
        if (description.length() > 1000) {
            throw new IllegalArgumentException("Description too long.");
        }
    }

    public void setDescription(String description) {
        validateDescription(description);
        this.description = description;
        this.descriptionLength = description.length();
        // this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
