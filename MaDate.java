package tommy.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MaDate extends Date {
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public MaDate(int jour, int mois, int annee) {
        super(annee - 1900, mois - 1, jour);
    }

    @Override
    public String toString() {
        return simpleDateFormat.format(this);
    }

}
