package jvm;

public class StackOOM {

    public void oom(){
        oom();
    }
}

class staticOOMTest{
    public static void main(String[] args) {
        new StackOOM().oom();
    }
}