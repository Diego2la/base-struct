package structure;

public class StudentsList {
    private final String NOT_UNIQ_ID = "This id isn't unique"; 
    private final String NULL_NAME = "Incorrect name"; 
    private final String NAME_DOESNT_EXIST = "This name doesn't exist in the list"; 
    private final String ID_DOESNT_EXIST = "This id doesn't exist in the list"; 
      
    private List list; 
    private int length; 
      
    private class List{ 
        private String name; 
        private int id; 
        private List next; 
          
        public List(String name, int num){ 
            this.name = name; 
            this.id = num; 
            next = null; 
        } 
        public List getNext(){ 
            return next; 
        } 
        public void setNext(List list){ 
            next = list; 
        } 
          
        public int getId(){ 
            return id; 
        } 
          
        public String getName(){ 
            return name; 
        } 
    } 
      
    public ListOfStudents(){ 
        length = 0; 
        list = null; 
    } 
      
    public void add(String name, int id) throws IncorrectDataException{ 
        if (name == null) throw new IncorrectDataException(NULL_NAME); 
        if (list == null) { 
            list = new List(name, id); 
            ++length; 
        } else { 
            List tmp = list; 
            while (true){ 
                if (list.getId() == id) throw new IncorrectDataException(NOT_UNIQ_ID); 
                if (tmp.getNext() != null) { 
                    tmp = tmp.getNext(); 
                } else break; 
            } 
            tmp.setNext(new List(name, id)); 
            ++length; 
        } 
    } 
      
    public String toString(){ 
        List tmp = list; 
        String res = ""; 
        while (tmp != null){ 
            res = res + tmp.getId() + ", " + tmp.getName() + '\n'; 
            tmp = tmp.getNext(); 
        } 
          
        return res; 
    } 
      
    public int length(){ 
        return length; 
    } 
      
    public String getName(int id){ 
        List tmp = list; 
        while (tmp != null){ 
            if (tmp.getId() == id) return tmp.getName(); 
        } 
        return null; 
    } 
      
    public int getId(String name) throws IncorrectDataException{ 
        if (name == null) throw new IncorrectDataException(NULL_NAME); 
          
        List tmp = list; 
        while (tmp != null){ 
            if (tmp.getName().compareTo(name) == 0) return tmp.getId(); 
        } 
          
        throw new IncorrectDataException(NAME_DOESNT_EXIST); 
    } 
      
    public void delete(String name) throws IncorrectDataException{ 
        if (name == null) throw new IncorrectDataException(NULL_NAME); 
          
        List tmp = list; 
        boolean isDel = false; 
        boolean isEqualWithHead = false; 
        while(tmp != null){ 
            isEqualWithHead = tmp.getName().compareTo(name) == 0; 
            if (tmp.getNext() != null && tmp.getNext().getName().compareTo(name) == 0 || 
                    isEqualWithHead) { 
                if (!isEqualWithHead){ 
                    tmp.setNext(tmp.getNext().getNext()); 
                } else list = list.getNext(); 
                isDel = true; 
            } 
            tmp = tmp.getNext(); 
            isEqualWithHead = false; 
        } 
          
        if (!isDel) throw new IncorrectDataException(NAME_DOESNT_EXIST); 
    } 
      
    public void delete(int id) throws IncorrectDataException{ 
        List tmp = list; 
        while(tmp != null){ 
            if (tmp.getNext() != null && tmp.getNext().getId() == id || 
                    tmp.getId() == id) break; 
            tmp = tmp.getNext(); 
        } 
          
        if (tmp != null) { 
            if (list != tmp){ 
                tmp.setNext(tmp.getNext().getNext()); 
            } else list = list.getNext(); 
        } else throw new IncorrectDataException(ID_DOESNT_EXIST); 
    }

}
