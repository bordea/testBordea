package ExceptionCatching;

public class Teorie {
/*6 Tips pentru imbunatatirea Exception Handling

    1. Folosirea unei singure, system-wide, exception class
            In loc sa cream clase separate pentru fiecare tip de exceptie, cream doar una. Aceasta trebuie sa extinda RuntimeException.
            Acest lucru va reduce numarul de clase si nevoia de a declara exceptii cu care nu o sa avem de-a face oricum.

    2. Folosirea de ENUMs pentru error codes
    Cand punem cauza exceptie intr-un mesaj putem sa intempinam una din urmatoarele inconveniente:
            - mesajele nu pot fi traduse
    - mesajele nu pot fi mapped intr-o text care sa fie user-friendly
    - mesajele nu pot fi inspectate cand programul se ruleaza
    O varianta mai buna este sa folosim enums ca sa indicam tipul exceptiei. Vom crea un enum petru fiecare categorie de erori:
    paymennts, authentication, etc. Apoi trebuie sa facem ca enums sa implementeze o interfata ErrorCode si sa facem o referinta
    la aceasta printr-o variabile din exceptie.
    Cand gasim exceptii si vrem s ale ‘throw’ atunci pasam enum-ul corespunzator.
            throw new SystemException(PaymentCode.CREDIT_CARD_EXPIRED);
    Cand trebuie sa testam un anumit caz o sa comparam exception code-ul cu enum-ul
} catch (SystemException e) {
        if (e.getErrorCode() == PaymentCode.CREDIT_CARD_EXPIRED) {
        ...
        }
        }
        Astfel, o eroare mai usor de citit poate fi produsa prin folosirea error code-ului ca si the resource bundle’s lookup key.

        3. Adaugarea de error numbers la ENUMs
        In unele cazuri un cod numeric poate fi asociat cu fiecare exceptie. Raspunsul HTTP de exemplu. Pentru aceste cazuri,
         adaugam o metoda getNumber la interfata ErrorCode si o implementam in fiecare ENUM.
public enum PaymentCode implements ErrorCode {
    SERVICE_TIMEOUT(101),
    CREDIT_CARD_EXPIRED(102),
    AMOUNT_TOO_HIGH(103),
    INSUFFICIENT_FUNDS(104);

    private final int number;

    private PaymentCode(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

}
Numerotarea poate sa fie global unica pentru toate ENUMs sau putem avea fiecare ENUM cu umaratoarea lui. Putem folosi metoda
implicita ordinal() sau putem sa load numere dintr-un file sau o baza de date.

        4. Adaugarea de variabile dinamice la exceptii
        O buna ‘exception handling’ inseama si inregistrarea de date relevante nu doar urma stackului. Facand acest lucru ne va
        ajuta mult cand incercam sa diagnosticam si sa reproducem erori. Astfel vom sti automat ce operatie se derula cand
        aplicatia/programul s-a oprit.
        Cel mai usor mod de a face asta este sa adaugam o variabila java.util.Map la exceptie. Noua variabila va avea functia
        de a retine toate exception data dupa nume. Va trebui sa mai adaugam o metoda setter.
        Thowing exceptii cu date relevante va fi ceva de genul:
        throw new SystemException(ValidationCode.VALUE_TOO_SHORT)
        .set("field", field)
        .set("value", value)
        .set("min-length", MIN_LENGTH);

5. Prevenirea nestingului care nu e necesar
        Stack traces prea lungi si redundante nu ajuta pe nimeni, ba dimpotriva epuizeaza timpul nostru si resursele. Cand
        rethrowing exceptii, este mai bine sa chemam o metoda statica wrap in loc de constructorul exceptiei. Metoda wrap va
         fi responsabila cu decizia pentru cand va fi nevoie sa nest exceptii si cand simplu trebuie doar returnat instanta originala.
public static SystemException wrap(Throwable exception, ErrorCode errorCode) {
        if (exception instanceof SystemException) {
        SystemException se = (SystemException)exception;
if (errorCode != null && errorCode != se.getErrorCode()) {
        return new SystemException(exception.getMessage(), exception, errorCode);
}
        return se;
} else {
        return new SystemException(exception.getMessage(), exception, errorCode);
}
        }

public static SystemException wrap(Throwable exception) {
        return wrap(exception, null);
}

        6. Folosirea unui logger central cu un web dashboard
        Detalii aici.    */
}
