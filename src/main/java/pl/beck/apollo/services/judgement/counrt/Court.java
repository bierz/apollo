package pl.beck.apollo.services.judgement.counrt;

public enum Court {
    NSA("Naczelny Sąd Administracyjny", "NSA"),
    WSA("Wojewódzki Sąd Administracyjny", "WSA"),
    SN("Sąd Najwyższy", "SN"),
    KIO("Krajowa Izba Odwoławcza", "KIO"),
    SP("Sądy Powszechne", "SP");

    private final String name;
    private final String shortCut;

    Court(String name, String shortCut) {
        this.name = name;
        this.shortCut = shortCut;
    }
    public String getName() {
        return this.name;
    }

    public String getShortCut() {
        return shortCut;
    }
}
