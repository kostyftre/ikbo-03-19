package laboratornya_3;

class glass extends dish {
   String color_of_glass;

    public glass(String color_of_glass) {
        this.color_of_glass = color_of_glass;
    }
    void posudamoika(){
        System.out.println("Вы отнесли в мойку стакан");
    }


    @Override
    public void colors() {
        System.out.println("Вы налили в стакан "+ color_of_glass+ " цвета сок");
    }
}
