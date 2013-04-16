package week2;

public class Certificates extends StudentResults {
    private String certificate;
    Certificates(){
        super();
        certificate = " No Cerficate Awarded";
    }

    String certificateAwarded(int aScore){
        String aGrade = examGrade(aScore);
        if (aGrade.equals("Grade is A"))
            this.certificate = "Certificate of Excellence";
        else if (aGrade.equals("Grade is B"))
            this.certificate = "Certificate of Achievment";
        else if (aGrade.equals("Grade is C"))
            this.certificate = "Certificate of Achievment";
        else this.certificate = " No Certificate Awarded";
        return this.certificate;
    }
}
