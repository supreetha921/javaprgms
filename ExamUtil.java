class ExamUtil{
public static void main(String a[]){
Exam exam=new Exam();
exam.code="17EC81";
exam.fees=1200;

HallTicket hallTicket=new HallTicket("3wer6cs",5,"supreetha");
boolean allowed=exam.allow(hallTicket);
if(allowed)
{
System.out.println("can write exam");
}
else{
System.out.println("cannot write exam");
}
System.out.println("**************");
SupplementaryExam supplementaryExam=new SupplementaryExam();
boolean allowedForSupplementary=supplementaryExam.allow(hallTicket);
if(allowedForSupplementary){
System.out.println("can write Supplementary Exam");
}
else{
System.out.println("cannot write Supplementary exam");
}
}
}