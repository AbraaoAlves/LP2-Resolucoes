package q1;

public class Cliente {

    public static void main(String[] args) {
	    ComputerKit kit = new ComputerKit();
        kit.addPart(new ComputerPart("cpu", 1000));
        kit.addPart(new ComputerPart("memoria", 120));

        //testando
        if(kit.temperaturaPreco() == "caro"){
            System.out.println("O kit está muito caro");
        }

        if(!kit.contains("processador")){
            System.out.println("O kit não contem 'processador'");
        }

        if(kit.contains("memoria")){
            System.out.println("O kit contem memoria");
        }

        if(kit.count("cpu") == 1){
            System.out.println("O kit tem 1 cpu");
        }

        kit.addPart(new ComputerPart("cpu", 800));

        if(kit.count("cpu") == 2){
            System.out.println("O kit tem 2 cpus");
        }
    }
}
