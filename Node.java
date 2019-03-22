class Node {
    //Todoo lo que esta aqui es de https://www.youtube.com/watch?v=M6lYob8STMI
    String key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(String key, String name){
        this.key = key;
        this.name = name;
    }
    public String toString(){
        return name + "has a key" + key;
    }
    public String getKey(){
        return key;
    }
    public String getName(){
        return name;
    }

}
