package Assignment_2;



//consider there is a sports performance analysis application which has record of various sportsperson's

// Without instanceof keyword: We encounter ClasscastException at runtime
/*class Cricketer {
    
}

class Allrounder extends Cricketer {
    public void Performer() {
        System.out.println("Contributes with both bat and ball");
    }
}

class Batsman extends Cricketer {
    public void Contributor() {
        System.out.println("Contributes only with bat");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        Cricketer[] members= { new Allrounder(), new Batsman(), new Allrounder() };
        
        for (Cricketer member : members) {
            ((Allrounder) member).Performer();
            ((Batsman) member).Contributor();
        }
    }
}*/


//With use of instanceof:

class Cricketer {
	
   
}

class Allrounder extends Cricketer {
    public void Performer() {
        System.out.println("Contributes with both bat and ball");
    }
}

class Batsman extends Cricketer {
    public void Contributor() {
        System.out.println("Contributes only with bat");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
    	
    	Cricketer member1=new Allrounder();
    	Cricketer member2=new Batsman();
    	
    	if(member1 instanceof Allrounder) {
    		
    		((Allrounder) member1).Performer();
    		((Batsman)member2).Contributor();
    		
    	}
    	
       /* Cricketer[] members= { new Allrounder(), new Batsman(), new Allrounder() };
        
        for (Cricketer member : members) {
        	if(member instanceof Allrounder) {
            ((Allrounder) member).Performer();
        	}
        	else if(member instanceof Batsman) {
            ((Batsman) member).Contributor();
        	}
        }*/
    }
}
