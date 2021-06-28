class VirusUtil
{
public static void main(String a[])
{
Virus virus=new Virus("Ebola","Sudan ebolavirus",
"fever,headache",1976);
virus.printVirusDetails();

Virus vs=new Virus("Dhori","Thogotovirus","Nausea,Fever",1969);
vs.printVirusDetails();

Virus.givesInformation();

}
} 