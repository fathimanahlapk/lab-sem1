class CPU
{
	double price;
	class Processor
	{
		double cores;
		String manufacturer;
		double getCache()
		{
			return 4.3;
		}
	}
	protected class RAM
	{
		double memory;
		String manufacturer;
		double getClockSpeed()
		{
			return 5.5;
		}
	}
}
public class CPUDetails
{
	public static void main(String[] args)
	{
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=cpu.new RAM();
		System.out.println("Name:FATHIMA NAHLA P.K");
		System.out.println("Admsn_no:22MCA024");
		System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
		System.out.println("Date:24-03-23");
		System.out.println("Processor cache="+processor.getCache());
		System.out.println("Ram clock speed="+ram.getClockSpeed());
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
