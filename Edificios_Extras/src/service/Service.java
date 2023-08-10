package service;

public class Service {
    private String serviceName;

    public Service(String serviceName) {
        this.serviceName = serviceName;
    }
    public void performanceService(){
        System.out.println("Performing service: "+serviceName);
    }
}
