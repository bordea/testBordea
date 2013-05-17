package TeorieTutorialeRomana.Interfete;

import java.util.*;

interface ExpiryDate {
    String TODAY = "Sunday";

    void isExpired();

    Integer daysTillExpires();
}
