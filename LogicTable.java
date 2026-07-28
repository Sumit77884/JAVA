class LogicTable{
    public static void main(String args[]){
        boolean p=true;
        boolean q=true;
        System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP");
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p));
        p=true;q=false;
        System.out.print(p +"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q) +"\t"+(!p));
        p=false;q=true;
        System.out.print(p+ "\t"+q +"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
        System.out.println((p^q)+"\t"+(!p)); 
        p=false;q=false;
        System.out.print(p +"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(p|q)+"\t");
    System.out.println((p^q)+"\t"+(!p));
    }
}