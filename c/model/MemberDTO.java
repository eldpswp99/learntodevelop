package c.model;

public class MemberDTO{
    String name;
    String email;
    String phone;
    
    MemberDTO(String name,String email,String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        
        if(getClass() != obj.getClass()) return false;
        
        MemberDTO temp = (MemberDTO)obj;
        
        if(name == null){
            if(temp.name != null) return false;
        }else if(!name.equals(temp.name)) return false;
        
        if(email == null){
            if(temp.email != null) return false;
        }else if(!email.equals(temp.email)) return false;
        
        if(phone == null){
            if(temp.phone != null) return false;
        }else if(!phone.equals(temp.phone)) return false;
        
        return true;
    }
        
    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime * result + ((name == null ? 0 : name.hashCode()));
        result = prime * result + ((email == null ? 0 : email.hashCode()));
        result = prime * result + ((phone == null ? 0 : phone.hashCode()));
        
        return result;
    }
    
}