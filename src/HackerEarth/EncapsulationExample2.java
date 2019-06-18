package HackerEarth;

public class EncapsulationExample2 {
    public static void main(String[] args) {
    Printer printer=new Printer(50,true);
        System.out.println("initial page count ="+printer.getPagesPrinted());
        int pagesPrinted=printer.printPage(4);
        System.out.println("Pages printed was "+pagesPrinted+ "new total print count for printer ="+printer.getPagesPrinted());
    }
}

class Printer
{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel,boolean duplex)
    {
        if(tonerLevel>-1&& tonerLevel <=100)
        {
            this.tonerLevel=tonerLevel;
        }
        else{
            this.tonerLevel=-1;
        }
        this.duplex=duplex;
        this.pagesPrinted=0;
    }
    public int addToner(int tonerAmount)
    {
        if(tonerAmount>0 &&tonerAmount<=100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }
    public int printPage(int Pages)
    {
        int pagesToPrint=Pages;
        if(this.duplex)
        {
            pagesToPrint/=2;
            System.out.println("Printing in the duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}