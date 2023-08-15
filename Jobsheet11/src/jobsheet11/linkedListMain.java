
package jobsheet11;

public class linkedListMain {
    public static void main(String[] args) {
        
    
    linkedListJava data=new linkedListJava();
    try {
    data.addFrist(7);
    data.print();
    data.add(8, 1);
    data.print();
    data.addFrist(1);
    data.print();
    data.remove(1);
    data.print();
    data.clear();
    data.print();
}catch (Exception e){
        System.out.println(e.getMessage());
}
}
}