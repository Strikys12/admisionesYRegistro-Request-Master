package requests.models;


public class Request {

    private String name;
    private String id;
    private String email;
    private String numberCellphone;
    private boolean status;



    //Constructores

    public Request(){

    }

    public Request(String name, String id, String email, String numberCellphone, boolean status){
        this.name =  name;
        this.id = id;
        this.email = email;
        this.numberCellphone = numberCellphone;
        this.status = status;
        
    }

    

    //SETTERS//

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumberCellphone(String numberCellphone) {
        this.numberCellphone = numberCellphone;
    }

    

    //GETTERS//

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNumberCellphone() {
        return numberCellphone;
    }

    

    


    
} 
