package utils.selenium;

public class Settings {
    public static String baseUrl = "https://fmweb.staging.flexint.net/?do=pp3";

    public static String weHighlightedColour = "arguments[0].style.border='5px solid blue'";
    public static String wdHighlightedColour = "arguments[0].style.border='5px solid green";

    public static String hubUrl = System.getenv("HUB_URL");
}
