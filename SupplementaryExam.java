class SupplementaryExam extends Exam{
 public SupplementaryExam(){
System.out.println("SupplementaryExam object is created");
}
@Override
public boolean allow(HallTicket hallTicket){
System.out.println("Invoked allow from Supplementary Exam");
super.code="17EC81";
super.fees=1500;

return super.allow(hallTicket);
}
}