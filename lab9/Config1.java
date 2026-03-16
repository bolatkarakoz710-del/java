class Config1 {

    static String appName;
    static int version;

    static {
        appName = "JavaApp";
        version = 2;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println(appName);
        System.out.println(version);
    }
}